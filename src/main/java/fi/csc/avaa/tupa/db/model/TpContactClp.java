package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TpContactClp extends BaseModelImpl<TpContact> implements TpContact {
    private int _id;
    private String _email;
    private String _phone;
    private String _title;
    private String _firstName;
    private String _lastName;
    private String _url;
    private String _description_EN;
    private String _description_FI;
    private BaseModel<?> _tpContactRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public TpContactClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return TpContact.class;
    }

    @Override
    public String getModelClassName() {
        return TpContact.class.getName();
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
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("title", getTitle());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("url", getUrl());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }
    }

    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setId", int.class);

                method.invoke(_tpContactRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_tpContactRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhone() {
        return _phone;
    }

    @Override
    public void setPhone(String phone) {
        _phone = phone;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_tpContactRemoteModel, phone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_tpContactRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_tpContactRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_tpContactRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(String url) {
        _url = url;

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setUrl", String.class);

                method.invoke(_tpContactRemoteModel, url);
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

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription_EN",
                        String.class);

                method.invoke(_tpContactRemoteModel, description_EN);
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

        if (_tpContactRemoteModel != null) {
            try {
                Class<?> clazz = _tpContactRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription_FI",
                        String.class);

                method.invoke(_tpContactRemoteModel, description_FI);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int[] getInfrastructuresIds() {
        try {
            String methodName = "getInfrastructuresIds";

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
    public void setInfrastructuresIds(int[] infrastructuresIds) {
        try {
            String methodName = "setInfrastructuresIds";

            Class<?>[] parameterTypes = new Class<?>[] { int.class };

            Object[] parameterValues = new Object[] { infrastructuresIds };

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

    public BaseModel<?> getTpContactRemoteModel() {
        return _tpContactRemoteModel;
    }

    public void setTpContactRemoteModel(BaseModel<?> tpContactRemoteModel) {
        _tpContactRemoteModel = tpContactRemoteModel;
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

        Class<?> remoteModelClass = _tpContactRemoteModel.getClass();

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

        Object returnValue = method.invoke(_tpContactRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TpContactLocalServiceUtil.addTpContact(this);
        } else {
            TpContactLocalServiceUtil.updateTpContact(this);
        }
    }

    @Override
    public TpContact toEscapedModel() {
        return (TpContact) ProxyUtil.newProxyInstance(TpContact.class.getClassLoader(),
            new Class[] { TpContact.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TpContactClp clone = new TpContactClp();

        clone.setId(getId());
        clone.setEmail(getEmail());
        clone.setPhone(getPhone());
        clone.setTitle(getTitle());
        clone.setFirstName(getFirstName());
        clone.setLastName(getLastName());
        clone.setUrl(getUrl());
        clone.setDescription_EN(getDescription_EN());
        clone.setDescription_FI(getDescription_FI());

        return clone;
    }

    @Override
    public int compareTo(TpContact tpContact) {
        int primaryKey = tpContact.getPrimaryKey();

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

        if (!(obj instanceof TpContactClp)) {
            return false;
        }

        TpContactClp tpContact = (TpContactClp) obj;

        int primaryKey = tpContact.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", url=");
        sb.append(getUrl());
        sb.append(", description_EN=");
        sb.append(getDescription_EN());
        sb.append(", description_FI=");
        sb.append(getDescription_FI());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpContact");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phone</column-name><column-value><![CDATA[");
        sb.append(getPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>url</column-name><column-value><![CDATA[");
        sb.append(getUrl());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_EN</column-name><column-value><![CDATA[");
        sb.append(getDescription_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_FI</column-name><column-value><![CDATA[");
        sb.append(getDescription_FI());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
