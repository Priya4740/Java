import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String args[]){
        String s1 = "Sasi";
        String s2 = "Site";
        String s3 = "SASI";
        String s4 = "Sasi";
        String s5 = "SASI";
        String s6 = "Sasi site";
        System.out.println("s1 equals (s2) returns "+s1.equals(s2));
        System.out.println("s3 equals (s5) returns "+s3.equals(s5));
        System.out.println("s5 equals (s3) returns "+s5.equals(s3));
        System.out.println("s1==s2 returns "+s1==s2);
        System.out.println("s3==s5 returns "+s3==s5);
        System.out.println("s3 compareTo s5 returns "+s3.compareTo(s5));
        System.out.println("s5 compareTo s6 returns "+s5.compareTo(s6));
        System.out.println("s6 compareTo s5 returns "+s6.compareTo(s5));
    }
}
