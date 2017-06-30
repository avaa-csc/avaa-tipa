package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.List;

/**
 * The extended model implementation for the TpAPI service. Represents a row in the &quot;tupa_TpAPI&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.TpAPI} interface.
 * </p>
 *
 * @author CSC
 */
public class TpAPIImpl extends TpAPIBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a tp a p i model instance should use the {@link fi.csc.avaa.tupa.db.model.TpAPI} interface instead.
     */
    public TpAPIImpl() {
    }
    
    private List<JSONObject> methodDescription;

    @JSON
    public List<JSONObject> getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(List<JSONObject> methodDescription) {
        this.methodDescription = methodDescription;
    }
}
