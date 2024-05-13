/* Create an exception subclass UnderAge, which prints “Under Age” along with the age value when an 
object of UnderAge class is printed in the catch statement. Write a class exceptionDemo in which the 
method test() throws UnderAge exception if the variable age passed to it as argument is less than 18. Write 
main() method also to show working of the program.  */


package Question4;

public class Main {
    public static void main(String[] args) {
        ExceptionExecutor executor = new ExceptionExecutor();
        try {
            executor.test(25);
            executor.test(55);
            executor.test(15);
        } catch (Underage e) {
            System.out.println(e);
        }
    }
}