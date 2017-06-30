package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TpInfrastructureClp extends BaseModelImpl<TpInfrastructure>
    implements TpInfrastructure {
    private int _id;
    private String _urn;
    private String _name_EN;
    private String _name_FI;
    private String _acronym_EN;
    private String _acronym_FI;
    private String _description_EN;
    private String _description_FI;
    private boolean _active;
    private int _preparationsStarted;
    private int _buildingStarted;
    private int _operationsStarted;
    private int _operationsFinished;
    private String _formerIds;
    private String _formerUrns;
    private BaseModel<?> _tpInfrastructureRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public TpInfrastructureClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return TpInfrastructure.class;
    }

    @Override
    public String getModelClassName() {
        return TpInfrastructure.class.getName();
    }

    @Override
    public int getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("urn", getUrn());
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("acronym_EN", getAcronym_EN());
        attributes.put("acronym_FI", getAcronym_FI());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());
        attributes.put("active", getActive());
        attributes.put("preparationsStarted", getPreparationsStarted());
        attributes.put("buildingStarted", getBuildingStarted());
        attributes.put("operationsStarted", getOperationsStarted());
        attributes.put("operationsFinished", getOperationsFinished());
        attributes.put("formerIds", getFormerIds());
        attributes.put("formerUrns", getFormerUrns());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String urn = (String) attributes.get("urn");

        if (urn != null) {
            setUrn(urn);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String acronym_EN = (String) attributes.get("acronym_EN");

        if (acronym_EN != null) {
            setAcronym_EN(acronym_EN);
        }

        String acronym_FI = (String) attributes.get("acronym_FI");

        if (acronym_FI != null) {
            setAcronym_FI(acronym_FI);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }

        Boolean active = (Boolean) attributes.get("active");

        if (active != null) {
            setActive(active);
        }

        Integer preparationsStarted = (Integer) attributes.get(
                "preparationsStarted");

        if (preparationsStarted != null) {
            setPreparationsStarted(preparationsStarted);
        }

        Integer buildingStarted = (Integer) attributes.get("buildingStarted");

        if (buildingStarted != null) {
            setBuildingStarted(buildingStarted);
        }

        Integer operationsStarted = (Integer) attributes.get(
                "operationsStarted");

        if (operationsStarted != null) {
            setOperationsStarted(operationsStarted);
        }

        Integer operationsFinished = (Integer) attributes.get(
                "operationsFinished");

        if (operationsFinished != null) {
            setOperationsFinished(operationsFinished);
        }

        String formerIds = (String) attributes.get("formerIds");

        if (formerIds != null) {
            setFormerIds(formerIds);
        }

        String formerUrns = (String) attributes.get("formerUrns");

        if (formerUrns != null) {
            setFormerUrns(formerUrns);
        }
    }

    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setId", int.class);

                method.invoke(_tpInfrastructureRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUrn() {
        return _urn;
    }

    @Override
    public void setUrn(String urn) {
        _urn = urn;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setUrn", String.class);

                method.invoke(_tpInfrastructureRemoteModel, urn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName_EN() {
        return _name_EN;
    }

    @Override
    public void setName_EN(String name_EN) {
        _name_EN = name_EN;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setName_EN", String.class);

                method.invoke(_tpInfrastructureRemoteModel, name_EN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName_FI() {
        return _name_FI;
    }

    @Override
    public void setName_FI(String name_FI) {
        _name_FI = name_FI;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setName_FI", String.class);

                method.invoke(_tpInfrastructureRemoteModel, name_FI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAcronym_EN() {
        return _acronym_EN;
    }

    @Override
    public void setAcronym_EN(String acronym_EN) {
        _acronym_EN = acronym_EN;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setAcronym_EN", String.class);

                method.invoke(_tpInfrastructureRemoteModel, acronym_EN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAcronym_FI() {
        return _acronym_FI;
    }

    @Override
    public void setAcronym_FI(String acronym_FI) {
        _acronym_FI = acronym_FI;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setAcronym_FI", String.class);

                method.invoke(_tpInfrastructureRemoteModel, acronym_FI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription_EN() {
        return _description_EN;
    }

    @Override
    public void setDescription_EN(String description_EN) {
        _description_EN = description_EN;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription_EN",
                        String.class);

                method.invoke(_tpInfrastructureRemoteModel, description_EN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription_FI() {
        return _description_FI;
    }

    @Override
    public void setDescription_FI(String description_FI) {
        _description_FI = description_FI;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription_FI",
                        String.class);

                method.invoke(_tpInfrastructureRemoteModel, description_FI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getActive() {
        return _active;
    }

    @Override
    public boolean isActive() {
        return _active;
    }

    @Override
    public void setActive(boolean active) {
        _active = active;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", boolean.class);

                method.invoke(_tpInfrastructureRemoteModel, active);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPreparationsStarted() {
        return _preparationsStarted;
    }

    @Override
    public void setPreparationsStarted(int preparationsStarted) {
        _preparationsStarted = preparationsStarted;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setPreparationsStarted",
                        int.class);

                method.invoke(_tpInfrastructureRemoteModel, preparationsStarted);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBuildingStarted() {
        return _buildingStarted;
    }

    @Override
    public void setBuildingStarted(int buildingStarted) {
        _buildingStarted = buildingStarted;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setBuildingStarted", int.class);

                method.invoke(_tpInfrastructureRemoteModel, buildingStarted);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOperationsStarted() {
        return _operationsStarted;
    }

    @Override
    public void setOperationsStarted(int operationsStarted) {
        _operationsStarted = operationsStarted;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setOperationsStarted",
                        int.class);

                method.invoke(_tpInfrastructureRemoteModel, operationsStarted);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOperationsFinished() {
        return _operationsFinished;
    }

    @Override
    public void setOperationsFinished(int operationsFinished) {
        _operationsFinished = operationsFinished;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setOperationsFinished",
                        int.class);

                method.invoke(_tpInfrastructureRemoteModel, operationsFinished);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFormerIds() {
        return _formerIds;
    }

    @Override
    public void setFormerIds(String formerIds) {
        _formerIds = formerIds;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setFormerIds", String.class);

                method.invoke(_tpInfrastructureRemoteModel, formerIds);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFormerUrns() {
        return _formerUrns;
    }

    @Override
    public void setFormerUrns(String formerUrns) {
        _formerUrns = formerUrns;

        if (_tpInfrastructureRemoteModel != null) {
            try {
                Class<?> clazz = _tpInfrastructureRemoteModel.getClass();

                Method method = clazz.getMethod("setFormerUrns", String.class);

                method.invoke(_tpInfrastructureRemoteModel, formerUrns);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int[] getContactsIds() {
        try {
            String methodName = "getContactsIds";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            int[] returnObj = (int[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject getPids() {
        try {
            String methodName = "getPids";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            com.liferay.portal.kernel.json.JSONObject returnObj = (com.liferay.portal.kernel.json.JSONObject) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setKeywords_EN(java.lang.String[] keywords_EN) {
        try {
            String methodName = "setKeywords_EN";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { keywords_EN };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setContactsIds(int[] contactsIds) {
        try {
            String methodName = "setContactsIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { contactsIds };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String[] getKeywords_EN() {
        try {
            String methodName = "getKeywords_EN";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String[] returnObj = (java.lang.String[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setOrganisationsIds(int[] organisationsIds) {
        try {
            String methodName = "setOrganisationsIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { organisationsIds };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setServicesIds(int[] servicesIds) {
        try {
            String methodName = "setServicesIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { servicesIds };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String[] getKeywords_FI() {
        try {
            String methodName = "getKeywords_FI";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String[] returnObj = (java.lang.String[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setPids(com.liferay.portal.kernel.json.JSONObject pids) {
        try {
            String methodName = "setPids";

            Class<?>[] parameterTypes = new Class<?>[] {
                    com.liferay.portal.kernel.json.JSONObject.class
                };

            Object[] parameterValues = new Object[] { pids };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int[] getServicesIds() {
        try {
            String methodName = "getServicesIds";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            int[] returnObj = (int[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int[] getOrganisationsIds() {
        try {
            String methodName = "getOrganisationsIds";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            int[] returnObj = (int[]) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setKeywords_FI(java.lang.String[] keywords_FI) {
        try {
            String methodName = "setKeywords_FI";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { keywords_FI };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getTpInfrastructureRemoteModel() {
        return _tpInfrastructureRemoteModel;
    }

    public void setTpInfrastructureRemoteModel(
        BaseModel<?> tpInfrastructureRemoteModel) {
        _tpInfrastructureRemoteModel = tpInfrastructureRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _tpInfrastructureRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_tpInfrastructureRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TpInfrastructureLocalServiceUtil.addTpInfrastructure(this);
        } else {
            TpInfrastructureLocalServiceUtil.updateTpInfrastructure(this);
        }
    }

    @Override
    public TpInfrastructure toEscapedModel() {
        return (TpInfrastructure) ProxyUtil.newProxyInstance(TpInfrastructure.class.getClassLoader(),
            new Class[] { TpInfrastructure.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TpInfrastructureClp clone = new TpInfrastructureClp();

        clone.setId(getId());
        clone.setUrn(getUrn());
        clone.setName_EN(getName_EN());
        clone.setName_FI(getName_FI());
        clone.setAcronym_EN(getAcronym_EN());
        clone.setAcronym_FI(getAcronym_FI());
        clone.setDescription_EN(getDescription_EN());
        clone.setDescription_FI(getDescription_FI());
        clone.setActive(getActive());
        clone.setPreparationsStarted(getPreparationsStarted());
        clone.setBuildingStarted(getBuildingStarted());
        clone.setOperationsStarted(getOperationsStarted());
        clone.setOperationsFinished(getOperationsFinished());
        clone.setFormerIds(getFormerIds());
        clone.setFormerUrns(getFormerUrns());

        return clone;
    }

    @Override
    public int compareTo(TpInfrastructure tpInfrastructure) {
        int primaryKey = tpInfrastructure.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpInfrastructureClp)) {
            return false;
        }

        TpInfrastructureClp tpInfrastructure = (TpInfrastructureClp) obj;

        int primaryKey = tpInfrastructure.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", urn=");
        sb.append(getUrn());
        sb.append(", name_EN=");
        sb.append(getName_EN());
        sb.append(", name_FI=");
        sb.append(getName_FI());
        sb.append(", acronym_EN=");
        sb.append(getAcronym_EN());
        sb.append(", acronym_FI=");
        sb.append(getAcronym_FI());
        sb.append(", description_EN=");
        sb.append(getDescription_EN());
        sb.append(", description_FI=");
        sb.append(getDescription_FI());
        sb.append(", active=");
        sb.append(getActive());
        sb.append(", preparationsStarted=");
        sb.append(getPreparationsStarted());
        sb.append(", buildingStarted=");
        sb.append(getBuildingStarted());
        sb.append(", operationsStarted=");
        sb.append(getOperationsStarted());
        sb.append(", operationsFinished=");
        sb.append(getOperationsFinished());
        sb.append(", formerIds=");
        sb.append(getFormerIds());
        sb.append(", formerUrns=");
        sb.append(getFormerUrns());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpInfrastructure");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>urn</column-name><column-value><![CDATA[");
        sb.append(getUrn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name_EN</column-name><column-value><![CDATA[");
        sb.append(getName_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name_FI</column-name><column-value><![CDATA[");
        sb.append(getName_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>acronym_EN</column-name><column-value><![CDATA[");
        sb.append(getAcronym_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>acronym_FI</column-name><column-value><![CDATA[");
        sb.append(getAcronym_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_EN</column-name><column-value><![CDATA[");
        sb.append(getDescription_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_FI</column-name><column-value><![CDATA[");
        sb.append(getDescription_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>active</column-name><column-value><![CDATA[");
        sb.append(getActive());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>preparationsStarted</column-name><column-value><![CDATA[");
        sb.append(getPreparationsStarted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>buildingStarted</column-name><column-value><![CDATA[");
        sb.append(getBuildingStarted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>operationsStarted</column-name><column-value><![CDATA[");
        sb.append(getOperationsStarted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>operationsFinished</column-name><column-value><![CDATA[");
        sb.append(getOperationsFinished());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>formerIds</column-name><column-value><![CDATA[");
        sb.append(getFormerIds());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>formerUrns</column-name><column-value><![CDATA[");
        sb.append(getFormerUrns());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
