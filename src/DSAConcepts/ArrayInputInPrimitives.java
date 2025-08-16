package DSAConcepts;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayInputInPrimitives {
    public static void main(String args[]){
         Scanner input = new Scanner(System.in);
         //direct input
         int[] arr = new int[5];
         arr[0]=1;
         arr[1]=3;
         arr[2]=88;
         arr[3]=77;
         arr[4]=890;
         //[1,3,88,77,890]
        System.out.println(arr[3]);

        //input using for loops
        int[ ] array = new int[5];
        for(int i =0 ; i<array.length ; i++){
            array[i] = input.nextInt();
        }

        //printing using loops
        for(int i=0 ; i<array.length ;i++){
            System.out.println(array[i]);
        }

        //directly printing array
        System.out.println(Arrays.toString(array));

        //using for each loop
        for(int num : array){//for every element in array,print the element
            System.out.println(num + " ");//here num represents element of the array
        }
    }
}
