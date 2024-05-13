/* Design a class Complex having a real part (x) and an imaginary part (y). Provide methods to perform 
the following on complex numbers: 
a. Add and Multiply two complex numbers. 
b. toString() method to display complex numbers in the form: x + i y */


package Question1;
public class Complex {
    int real;
    int imaginary;
    public Complex(){}
    public Complex (int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }

    public String GetValue(){
        return real + "+" + imaginary + "i";
    }
    public static Complex Add (Complex A1, Complex A2){
        Complex A3 = new Complex();
        A3.real = A1.real + A2.real;
        A3.imaginary = A1.imaginary + A2.imaginary;
        return A3;
    }

    public static Complex Multiplication (Complex A4, Complex A5) {
        Complex A6 = new Complex();
        A6.real = (A4.real) * (A5.real) - (A4.imaginary) * (A5.imaginary);
        A6.imaginary = (A4.real) * (A5.imaginary) + (A4.imaginary * A5.real);
        return A6;
    }
}


    class Practical1 {
        public static void main(String[] args) {
        Complex a= new Complex (12, 6);
        Complex b= new Complex (6, 9);
        Complex c= Complex.Add(a,b);
        Complex d= Complex.Multiplication(a,b);
        System.out.println(a.GetValue());
        System.out.println(b.GetValue());
        System.out.println(c.GetValue());
        System.out.println(d.GetValue());

        }
    }
