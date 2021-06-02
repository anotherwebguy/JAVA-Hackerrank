import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t;
        t=scan.nextInt();
        int arr[] = new int[t];
        for(int i=0;i<t;i++){
            arr[i]=scan.nextInt();
        }
        int count=0;
        for(int j=0;j<t;j++){
            int sum=0;
            for(int k=j;k<t;k++){
                sum=arr[k]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
