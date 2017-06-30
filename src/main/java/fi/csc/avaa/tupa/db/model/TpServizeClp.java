package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TpServizeClp extends BaseModelImpl<TpServize> implements TpServize {
    private int _id;
    private String _name_EN;
    private String _name_FI;
    private String _description_EN;
    private String _description_FI;
    private String _url;
    private String _address;
    private String _city;
    private double _lat;
    private double _lon;
    private BaseModel<?> _tpServizeRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.avaa.tupa.db.service.ClpSerializer.class;

    public TpServizeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return TpServize.class;
    }

    @Override
    public String getModelClassName() {
        return TpServize.class.getName();
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
        attributes.put("name_EN", getName_EN());
        attributes.put("name_FI", getName_FI());
        attributes.put("description_EN", getDescription_EN());
        attributes.put("description_FI", getDescription_FI());
        attributes.put("url", getUrl());
        attributes.put("address", getAddress());
        attributes.put("city", getCity());
        attributes.put("lat", getLat());
        attributes.put("lon", getLon());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name_EN = (String) attributes.get("name_EN");

        if (name_EN != null) {
            setName_EN(name_EN);
        }

        String name_FI = (String) attributes.get("name_FI");

        if (name_FI != null) {
            setName_FI(name_FI);
        }

        String description_EN = (String) attributes.get("description_EN");

        if (description_EN != null) {
            setDescription_EN(description_EN);
        }

        String description_FI = (String) attributes.get("description_FI");

        if (description_FI != null) {
            setDescription_FI(description_FI);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        Double lat = (Double) attributes.get("lat");

        if (lat != null) {
            setLat(lat);
        }

        Double lon = (Double) attributes.get("lon");

        if (lon != null) {
            setLon(lon);
        }
    }

    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setId", int.class);

                method.invoke(_tpServizeRemoteModel, id);
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

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setName_EN", String.class);

                method.invoke(_tpServizeRemoteModel, name_EN);
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

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setName_FI", String.class);

                method.invoke(_tpServizeRemoteModel, name_FI);
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

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription_EN",
                        String.class);

                method.invoke(_tpServizeRemoteModel, description_EN);
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

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription_FI",
                        String.class);

                method.invoke(_tpServizeRemoteModel, description_FI);
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

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setUrl", String.class);

                method.invoke(_tpServizeRemoteModel, url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_tpServizeRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCity() {
        return _city;
    }

    @Override
    public void setCity(String city) {
        _city = city;

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setCity", String.class);

                method.invoke(_tpServizeRemoteModel, city);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLat() {
        return _lat;
    }

    @Override
    public void setLat(double lat) {
        _lat = lat;

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setLat", double.class);

                method.invoke(_tpServizeRemoteModel, lat);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLon() {
        return _lon;
    }

    @Override
    public void setLon(double lon) {
        _lon = lon;

        if (_tpServizeRemoteModel != null) {
            try {
                Class<?> clazz = _tpServizeRemoteModel.getClass();

                Method method = clazz.getMethod("setLon", double.class);

                method.invoke(_tpServizeRemoteModel, lon);
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
    public java.lang.String[] getServiceTypes() {
        try {
            String methodName = "getServiceTypes";

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
    public java.lang.String[] getLocationTypes() {
        try {
            String methodName = "getLocationTypes";

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
    public void setServiceTypes(java.lang.String[] serviceTypes) {
        try {
            String methodName = "setServiceTypes";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { serviceTypes };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
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
    public void setLocationTypes(java.lang.String[] locationTypes) {
        try {
            String methodName = "setLocationTypes";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { locationTypes };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
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

    public BaseModel<?> getTpServizeRemoteModel() {
        return _tpServizeRemoteModel;
    }

    public void setTpServizeRemoteModel(BaseModel<?> tpServizeRemoteModel) {
        _tpServizeRemoteModel = tpServizeRemoteModel;
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

        Class<?> remoteModelClass = _tpServizeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_tpServizeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TpServizeLocalServiceUtil.addTpServize(this);
        } else {
            TpServizeLocalServiceUtil.updateTpServize(this);
        }
    }

    @Override
    public TpServize toEscapedModel() {
        return (TpServize) ProxyUtil.newProxyInstance(TpServize.class.getClassLoader(),
            new Class[] { TpServize.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TpServizeClp clone = new TpServizeClp();

        clone.setId(getId());
        clone.setName_EN(getName_EN());
        clone.setName_FI(getName_FI());
        clone.setDescription_EN(getDescription_EN());
        clone.setDescription_FI(getDescription_FI());
        clone.setUrl(getUrl());
        clone.setAddress(getAddress());
        clone.setCity(getCity());
        clone.setLat(getLat());
        clone.setLon(getLon());

        return clone;
    }

    @Override
    public int compareTo(TpServize tpServize) {
        int primaryKey = tpServize.getPrimaryKey();

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

        if (!(obj instanceof TpServizeClp)) {
            return false;
        }

        TpServizeClp tpServize = (TpServizeClp) obj;

        int primaryKey = tpServize.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name_EN=");
        sb.append(getName_EN());
        sb.append(", name_FI=");
        sb.append(getName_FI());
        sb.append(", description_EN=");
        sb.append(getDescription_EN());
        sb.append(", description_FI=");
        sb.append(getDescription_FI());
        sb.append(", url=");
        sb.append(getUrl());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", lat=");
        sb.append(getLat());
        sb.append(", lon=");
        sb.append(getLon());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.tupa.db.model.TpServize");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
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
            "<column><column-name>description_EN</column-name><column-value><![CDATA[");
        sb.append(getDescription_EN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description_FI</column-name><column-value><![CDATA[");
        sb.append(getDescription_FI());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>url</column-name><column-value><![CDATA[");
        sb.append(getUrl());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat</column-name><column-value><![CDATA[");
        sb.append(getLat());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon</column-name><column-value><![CDATA[");
        sb.append(getLon());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
