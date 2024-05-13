/* Write a program to read a file and display only those lines that have the first two characters as '//' (Use 
try with resources). */


package Question7;

import java.io.File;
import java.util.Scanner;
import java.lang.Exception;
public class ClassFind {
    
public static void main(String []args){
    File find=new File("D:\\RC\\Semester 2\\DSC5- Programming in JAVA\\Practicals\\1.txt");
    try{
        Scanner sc=new Scanner(find);
        while(sc.hasNextLine()){
        String line= sc.nextLine();
        if(line.contains("//")){
            int index = line.indexOf("//");
            int index1 = line.indexOf(".",index);
            System.out.println(line.substring(index, index1+1));
        }
    }
    sc.close();
    }
    catch(Exception e){
        System.out.println("File not found.");
    }
}
    
}