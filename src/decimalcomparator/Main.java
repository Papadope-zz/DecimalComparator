/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalcomparator;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.1755, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        
    }
    
}
