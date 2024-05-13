/* Define an abstract class Shape in package P1. Inherit two more classes: Rectangle in package P2 and 
Circle in package P3. Write a program to ask the user for the type of shape and then using the concept of 
dynamic method dispatch, display the area of the appropriate subclass. Also write appropriate methods to 
read the data. The main() function should not be in any package.  */


package Question3;

import java.util.*;
import P1.*;
import P2.Rectangle;
import P3.Circle;

public class Area {
    public static void main (String[]args){

        Rectangle objRec = new Rectangle(12,10);
        Circle objCir = new Circle(12);
        Scanner Userinput = new Scanner (System.in);
        System.out.println("Give Input Rectangle/Circle");
        String Areaofshape = Userinput.nextLine();
        if (Areaofshape.equals("Rectangle")){
            System.out.println("Area Of rectangle");
            objRec.calculateArea();
            System.out.println(objRec.calculateArea());
        }
        else{
            System.out.println("Area Of Circle");
            objCir.calculateArea();
            System.out.println(objCir.calculateArea());
        }
        Userinput.close();
    }
}