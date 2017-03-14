package reverseinteger;
import java.util.Scanner;
/**
 *
 * @author ilkiz
 */
public class ReverseInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        String sNumber=number+"";
        String reversed="";
        int n=sNumber.length();
        for (int i = 0; i < n; i++) {
            reversed=reversed+sNumber.charAt(n-i-1);
        }
        System.out.println(reversed);
    }
}
