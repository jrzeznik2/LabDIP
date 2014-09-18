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
public class TipCalculator {
    private ServiceTipCalculator tip;
    
    public TipCalculator(ServiceTipCalculator tip){
        this.tip = tip;
    }
    
    public void calculateTip(){
        tip.getTip();
    }
}
