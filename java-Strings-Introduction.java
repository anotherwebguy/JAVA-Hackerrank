import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>=1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String A1=A.substring(0,1);
        String A2=A.substring(1);
        String B1=B.substring(0,1);
        String B2=B.substring(1);
        System.out.println(A1.toUpperCase()+A2+" "+B1.toUpperCase()+B2);
        
    }
}
