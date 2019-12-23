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
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int x1 =  (int) (x * 1000);
        int y1 =  (int) (y * 1000);
        
        if (x1 == y1){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
        
        
}
}


//if (x == y) {
//            if ((int) x == (int) y) {
//                if ((int) x == (int) y) {
//                    if ((int) x == (int) y) {
//                        System.out.println("true");
//                        return true;
//                    }
//                } else {
//                    System.out.println("false");
//                    return false;
//                }
//
//            } else {
//                System.out.println("false");
//                return false;
//            }
//
//        } else {
//            System.out.println("false");
//            return false;
//        }
//    return true;
