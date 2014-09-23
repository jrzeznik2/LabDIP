/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Jacob
 */
public interface ServiceTipCalculator {
    public static final double MIN_BILL = 0.00;
    public static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    public double getTip();
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
}
