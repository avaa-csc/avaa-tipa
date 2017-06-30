package fi.csc.avaa.tupa.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TpAPI}.
 * </p>
 *
 * @author CSC
 * @see TpAPI
 * @generated
 */
public class TpAPIWrapper implements TpAPI, ModelWrapper<TpAPI> {
    private TpAPI _tpAPI;

    public TpAPIWrapper(TpAPI tpAPI) {
        _tpAPI = tpAPI;
    }

    @Override
    public Class<?> getModelClass() {
        return TpAPI.class;
    }

    @Override
    public String getModelClassName() {
        return TpAPI.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("methodsDescription", getMethodsDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String methodsDescription = (String) attributes.get(
                "methodsDescription");

        if (methodsDescription != null) {
            setMethodsDescription(methodsDescription);
        }
    }

    /**
    * Returns the primary key of this tp a p i.
    *
    * @return the primary key of this tp a p i
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _tpAPI.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tp a p i.
    *
    * @param primaryKey the primary key of this tp a p i
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _tpAPI.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the methods description of this tp a p i.
    *
    * @return the methods description of this tp a p i
    */
    @Override
    public java.lang.String getMethodsDescription() {
        return _tpAPI.getMethodsDescription();
    }

    /**
    * Sets the methods description of this tp a p i.
    *
    * @param methodsDescription the methods description of this tp a p i
    */
    @Override
    public void setMethodsDescription(java.lang.String methodsDescription) {
        _tpAPI.setMethodsDescription(methodsDescription);
    }

    @Override
    public boolean isNew() {
        return _tpAPI.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tpAPI.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tpAPI.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tpAPI.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tpAPI.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tpAPI.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tpAPI.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tpAPI.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tpAPI.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tpAPI.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tpAPI.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TpAPIWrapper((TpAPI) _tpAPI.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.tupa.db.model.TpAPI tpAPI) {
        return _tpAPI.compareTo(tpAPI);
    }

    @Override
    public int hashCode() {
        return _tpAPI.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.tupa.db.model.TpAPI> toCacheModel() {
        return _tpAPI.toCacheModel();
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI toEscapedModel() {
        return new TpAPIWrapper(_tpAPI.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.tupa.db.model.TpAPI toUnescapedModel() {
        return new TpAPIWrapper(_tpAPI.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tpAPI.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tpAPI.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tpAPI.persist();
    }

    @Override
    public java.util.List<com.liferay.portal.kernel.json.JSONObject> getMethodDescription() {
        return _tpAPI.getMethodDescription();
    }

    @Override
    public void setMethodDescription(
        java.util.List<com.liferay.portal.kernel.json.JSONObject> methodDescription) {
        _tpAPI.setMethodDescription(methodDescription);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TpAPIWrapper)) {
            return false;
        }

        TpAPIWrapper tpAPIWrapper = (TpAPIWrapper) obj;

        if (Validator.equals(_tpAPI, tpAPIWrapper._tpAPI)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TpAPI getWrappedTpAPI() {
        return _tpAPI;
    }

    @Override
    public TpAPI getWrappedModel() {
        return _tpAPI;
    }

    @Override
    public void resetOriginalValues() {
        _tpAPI.resetOriginalValues();
    }
}
