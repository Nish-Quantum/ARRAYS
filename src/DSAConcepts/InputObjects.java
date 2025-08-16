package DSAConcepts;
import java.util.Scanner;
import java.util.Arrays;
public class InputObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[4];
        for(int i=0 ; i<str.length ;i++){
            str[i] = input.next();
        }
        for(int i =0;i<str.length ; i++){
            System.out.print(str[i]+" ");
        }
        System.out.println(Arrays.toString(str));
        str[0]="mini";
        System.out.println(Arrays.toString(str));
    }
}
