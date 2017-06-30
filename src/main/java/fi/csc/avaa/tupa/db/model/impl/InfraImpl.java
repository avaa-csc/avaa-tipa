package fi.csc.avaa.tupa.db.model.impl;

import com.liferay.portal.kernel.json.JSON;

/**
 * The extended model implementation for the Infra service. Represents a row in the &quot;infra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.tupa.db.model.Infra} interface.
 * </p>
 *
 * @author pj,jmlehtin
 */
public class InfraImpl extends InfraBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a infra model instance should use the {@link fi.csc.avaa.tupa.db.model.Infra} interface instead.
     */
    public InfraImpl() {
    }

    private String URN;

    @JSON
    public String getURN() {
        return URN;
    }

    public void setURN(String URN) {
        this.URN = URN;
    }
}
