import java.io.*;
import java.lang.*;
public class Main
{
public static void main(String[] args) {
   StringBuilder sb1 = new StringBuilder("Hello");
   System.out.println("The resultant string is: "+sb1);
   sb1.append("java");
   System.out.println("The resultant string is: "+sb1);
   StringBuilder sb2 = new StringBuilder("Hello");
   System.out.println("The resultant string is: "+sb2);
   sb2.insert(2,"java");
   System.out.println("The resultant string is: "+sb2);
   StringBuilder sb3 = new StringBuilder("Hello");
   sb3.replace(2,4,"java");
   System.out.println("The resultant string is: "+sb3);
   StringBuilder sb4 = new StringBuilder("Hello");
   sb4.delete(1,3);
     System.out.println("The resultant string is: "+sb3);
    StringBuilder sb5 = new StringBuilder("Hello");
    sb5.reverse();
    System.out.println("The resultant string is: "+sb5);

 }
}
