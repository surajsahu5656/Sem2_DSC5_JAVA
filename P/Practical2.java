/* Create a class TwoDim which contains private members as x and y coordinates in package P1. Define 
the default constructor, a parameterized constructor and override toString() method to display the co
ordinates. Now reuse this class and in package P2 create another class ThreeDim, adding a new dimension 
as z as its private member.  */


package P;

import P1.TwoDim;
import P2.ThreeDim;


public class Practical2 {

    public static void main(String[] args) {
        TwoDim obj1 = new TwoDim (1,2);
        System.out.print(obj1);
        ThreeDim obj2 = new ThreeDim(obj1, 4);
        System.out.println(obj2);
    }
    
}
