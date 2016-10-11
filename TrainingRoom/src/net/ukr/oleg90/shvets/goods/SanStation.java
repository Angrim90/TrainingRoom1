package net.ukr.oleg90.shvets.goods;

import java.util.Calendar;

/**
 * @author Shvets Oleg
 * @version 1.0
 */
public class SanStation {
    private String organizationname;

    public SanStation(String organizationname) {
        super();
        this.organizationname = organizationname;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }

    public void check(SanitaryStation ss) {
        if (ss.getExpiryDate() < Calendar.getInstance().get(Calendar.YEAR)) {
            System.out.println("Expiry date of your product has expired");
        } else {
            System.out.println("Your goods pass");
        }
    }
}
