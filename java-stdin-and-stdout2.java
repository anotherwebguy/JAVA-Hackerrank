import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        String str = scan.nextLine();
        // Write your code here.
        scan.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
