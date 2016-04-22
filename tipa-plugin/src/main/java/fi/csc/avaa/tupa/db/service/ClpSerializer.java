package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import fi.csc.avaa.tupa.db.model.AvainsanaClp;
import fi.csc.avaa.tupa.db.model.InfraClp;
import fi.csc.avaa.tupa.db.model.Infra_AvainsanatClp;
import fi.csc.avaa.tupa.db.model.Infra_PalvelutClp;
import fi.csc.avaa.tupa.db.model.Infra_VastuuorganisaatiotClp;
import fi.csc.avaa.tupa.db.model.Infra_YhteystiedotClp;
import fi.csc.avaa.tupa.db.model.KayttoehtoClp;
import fi.csc.avaa.tupa.db.model.OrganisaatioClp;
import fi.csc.avaa.tupa.db.model.PalveluClp;
import fi.csc.avaa.tupa.db.model.Palvelu_PalvelutyypitClp;
import fi.csc.avaa.tupa.db.model.PalvelutyyppiClp;
import fi.csc.avaa.tupa.db.model.SeliteClp;
import fi.csc.avaa.tupa.db.model.YhteystietoClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "tupa-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "tupa-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "tupa-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(AvainsanaClp.class.getName())) {
            return translateInputAvainsana(oldModel);
        }

        if (oldModelClassName.equals(InfraClp.class.getName())) {
            return translateInputInfra(oldModel);
        }

        if (oldModelClassName.equals(Infra_AvainsanatClp.class.getName())) {
            return translateInputInfra_Avainsanat(oldModel);
        }

        if (oldModelClassName.equals(Infra_PalvelutClp.class.getName())) {
            return translateInputInfra_Palvelut(oldModel);
        }

        if (oldModelClassName.equals(
                    Infra_VastuuorganisaatiotClp.class.getName())) {
            return translateInputInfra_Vastuuorganisaatiot(oldModel);
        }

        if (oldModelClassName.equals(Infra_YhteystiedotClp.class.getName())) {
            return translateInputInfra_Yhteystiedot(oldModel);
        }

        if (oldModelClassName.equals(KayttoehtoClp.class.getName())) {
            return translateInputKayttoehto(oldModel);
        }

        if (oldModelClassName.equals(OrganisaatioClp.class.getName())) {
            return translateInputOrganisaatio(oldModel);
        }

        if (oldModelClassName.equals(PalveluClp.class.getName())) {
            return translateInputPalvelu(oldModel);
        }

        if (oldModelClassName.equals(Palvelu_PalvelutyypitClp.class.getName())) {
            return translateInputPalvelu_Palvelutyypit(oldModel);
        }

        if (oldModelClassName.equals(PalvelutyyppiClp.class.getName())) {
            return translateInputPalvelutyyppi(oldModel);
        }

        if (oldModelClassName.equals(SeliteClp.class.getName())) {
            return translateInputSelite(oldModel);
        }

        if (oldModelClassName.equals(YhteystietoClp.class.getName())) {
            return translateInputYhteystieto(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputAvainsana(BaseModel<?> oldModel) {
        AvainsanaClp oldClpModel = (AvainsanaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getAvainsanaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInfra(BaseModel<?> oldModel) {
        InfraClp oldClpModel = (InfraClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInfraRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInfra_Avainsanat(BaseModel<?> oldModel) {
        Infra_AvainsanatClp oldClpModel = (Infra_AvainsanatClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInfra_AvainsanatRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInfra_Palvelut(BaseModel<?> oldModel) {
        Infra_PalvelutClp oldClpModel = (Infra_PalvelutClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInfra_PalvelutRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInfra_Vastuuorganisaatiot(
        BaseModel<?> oldModel) {
        Infra_VastuuorganisaatiotClp oldClpModel = (Infra_VastuuorganisaatiotClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInfra_VastuuorganisaatiotRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInfra_Yhteystiedot(BaseModel<?> oldModel) {
        Infra_YhteystiedotClp oldClpModel = (Infra_YhteystiedotClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInfra_YhteystiedotRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputKayttoehto(BaseModel<?> oldModel) {
        KayttoehtoClp oldClpModel = (KayttoehtoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getKayttoehtoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputOrganisaatio(BaseModel<?> oldModel) {
        OrganisaatioClp oldClpModel = (OrganisaatioClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getOrganisaatioRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPalvelu(BaseModel<?> oldModel) {
        PalveluClp oldClpModel = (PalveluClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPalveluRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPalvelu_Palvelutyypit(
        BaseModel<?> oldModel) {
        Palvelu_PalvelutyypitClp oldClpModel = (Palvelu_PalvelutyypitClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPalvelu_PalvelutyypitRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPalvelutyyppi(BaseModel<?> oldModel) {
        PalvelutyyppiClp oldClpModel = (PalvelutyyppiClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPalvelutyyppiRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSelite(BaseModel<?> oldModel) {
        SeliteClp oldClpModel = (SeliteClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSeliteRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputYhteystieto(BaseModel<?> oldModel) {
        YhteystietoClp oldClpModel = (YhteystietoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getYhteystietoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.AvainsanaImpl")) {
            return translateOutputAvainsana(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("fi.csc.avaa.tupa.db.model.impl.InfraImpl")) {
            return translateOutputInfra(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatImpl")) {
            return translateOutputInfra_Avainsanat(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutImpl")) {
            return translateOutputInfra_Palvelut(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotImpl")) {
            return translateOutputInfra_Vastuuorganisaatiot(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotImpl")) {
            return translateOutputInfra_Yhteystiedot(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.KayttoehtoImpl")) {
            return translateOutputKayttoehto(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.OrganisaatioImpl")) {
            return translateOutputOrganisaatio(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.PalveluImpl")) {
            return translateOutputPalvelu(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitImpl")) {
            return translateOutputPalvelu_Palvelutyypit(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiImpl")) {
            return translateOutputPalvelutyyppi(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.SeliteImpl")) {
            return translateOutputSelite(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.tupa.db.model.impl.YhteystietoImpl")) {
            return translateOutputYhteystieto(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchAvainsanaException")) {
            return new fi.csc.avaa.tupa.db.NoSuchAvainsanaException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchInfraException")) {
            return new fi.csc.avaa.tupa.db.NoSuchInfraException();
        }

        if (className.equals(
                    "fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException")) {
            return new fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException();
        }

        if (className.equals(
                    "fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException")) {
            return new fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException();
        }

        if (className.equals(
                    "fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException")) {
            return new fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException();
        }

        if (className.equals(
                    "fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException")) {
            return new fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchKayttoehtoException")) {
            return new fi.csc.avaa.tupa.db.NoSuchKayttoehtoException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchOrganisaatioException")) {
            return new fi.csc.avaa.tupa.db.NoSuchOrganisaatioException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchPalveluException")) {
            return new fi.csc.avaa.tupa.db.NoSuchPalveluException();
        }

        if (className.equals(
                    "fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException")) {
            return new fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException")) {
            return new fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchSeliteException")) {
            return new fi.csc.avaa.tupa.db.NoSuchSeliteException();
        }

        if (className.equals("fi.csc.avaa.tupa.db.NoSuchYhteystietoException")) {
            return new fi.csc.avaa.tupa.db.NoSuchYhteystietoException();
        }

        return throwable;
    }

    public static Object translateOutputAvainsana(BaseModel<?> oldModel) {
        AvainsanaClp newModel = new AvainsanaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setAvainsanaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInfra(BaseModel<?> oldModel) {
        InfraClp newModel = new InfraClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInfraRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInfra_Avainsanat(BaseModel<?> oldModel) {
        Infra_AvainsanatClp newModel = new Infra_AvainsanatClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInfra_AvainsanatRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInfra_Palvelut(BaseModel<?> oldModel) {
        Infra_PalvelutClp newModel = new Infra_PalvelutClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInfra_PalvelutRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInfra_Vastuuorganisaatiot(
        BaseModel<?> oldModel) {
        Infra_VastuuorganisaatiotClp newModel = new Infra_VastuuorganisaatiotClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInfra_VastuuorganisaatiotRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInfra_Yhteystiedot(
        BaseModel<?> oldModel) {
        Infra_YhteystiedotClp newModel = new Infra_YhteystiedotClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInfra_YhteystiedotRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputKayttoehto(BaseModel<?> oldModel) {
        KayttoehtoClp newModel = new KayttoehtoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setKayttoehtoRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputOrganisaatio(BaseModel<?> oldModel) {
        OrganisaatioClp newModel = new OrganisaatioClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setOrganisaatioRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPalvelu(BaseModel<?> oldModel) {
        PalveluClp newModel = new PalveluClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPalveluRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPalvelu_Palvelutyypit(
        BaseModel<?> oldModel) {
        Palvelu_PalvelutyypitClp newModel = new Palvelu_PalvelutyypitClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPalvelu_PalvelutyypitRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPalvelutyyppi(BaseModel<?> oldModel) {
        PalvelutyyppiClp newModel = new PalvelutyyppiClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPalvelutyyppiRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSelite(BaseModel<?> oldModel) {
        SeliteClp newModel = new SeliteClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSeliteRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputYhteystieto(BaseModel<?> oldModel) {
        YhteystietoClp newModel = new YhteystietoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setYhteystietoRemoteModel(oldModel);

        return newModel;
    }
}
