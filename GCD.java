import java.io.*;
import java.util.*;
class GcdRec{
    int gcd(int m,int n){
        if(m>n){
            return gcd(n,m);
        }
        if(m==n){
            return m;
        }
            if(m==0){
                return n;
            }
            if(m==1){
                return 1;
            }
            return gcd(m,n%m);
    }
    public static void main(String args[]){
        GcdRec ob=new GcdRec();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find the GCD");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=ob.gcd(a,b);
        System.out.println("Gcd of given numbers is"+g);
    }
    }
