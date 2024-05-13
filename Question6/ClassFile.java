/* Write a program that copies content of one file to another. Pass the names of the files through 
command-line arguments.  */


package Question6;

import java.util.*;
import java.io.*;
import java.lang.Exception;
public class ClassFile {
    public static void main(String[]args){
    File f1=new File("D:\\RC\\Semester 2\\DSC5- Programming in JAVA\\Practicals\\1.txt");
    File f2=new File("D:\\RC\\Semester 2\\DSC5- Programming in JAVA\\Practicals\\2.txt");
    try{
    if(f1.createNewFile()){
        System.out.println("file"+f1.getName()+"Created Sucessflly");
    }
    if(f2.createNewFile()){
        System.out.println("file"+f2.getName()+"Created Sucessflly");
      }  else{System.out.println("File Does not exist");

    }}catch(IOException exception){
        System.out.println("Error");
    }
    



try{
FileWriter writeinf =new FileWriter("D:\\RC\\Semester 2\\DSC5- Programming in JAVA\\Practicals\\1.txt");
writeinf.write(" Hi I am creating a file  then I will write in created file. Now I am going to write something . Hard work is key to sucess beacause there is no subtitutes for that. ");
writeinf.close();
System.out.println("File Written successfully");
}catch(IOException e){
    System.out.println("Unexpected Error");

}
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the path.");
String k1=scanner.nextLine();
try{

File file1=new File(k1);
Scanner vk=new Scanner(file1);
while (vk.hasNextLine()) {
    
    String data=vk.nextLine();
    FileWriter file2 = new FileWriter("D:\\RC\\Semester 2\\DSC5- Programming in JAVA\\Practicals\\2.txt");
    file2.write(data.substring(0));
    file2.close();
    System.out.println("File copied.");
}
vk.close();
}
catch(Exception e){
    System.out.println("File not found.");
}}
}