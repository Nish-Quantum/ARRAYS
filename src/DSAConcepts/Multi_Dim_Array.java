package DSAConcepts;
import java.util.Scanner;
import java.util.Arrays;
public class Multi_Dim_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
               1 2 3
               4 5 6
               7 8 9
         */
        //2D
        int[][] arr = new int[3][]; // specifying rows is mandatory ,columns isn't
        int[][] array = {
                {1, 2, 3,5},
                {4, 5, 6,6,7},
                {7, 8, 9}
        };//dont forget (;)
        //3D arrays exist too,more than that visualising is challenging
        //number of rows must be specified at initialising the array ,number of columns can be varied

        //INPUT
        int[][] array2 = new int[3][3];
        System.out.println(array.length);//gives number of rows
        for(int row=0 ; row<arr.length ; row++){
            for(int column =0;column<array2[row].length;column++){
                array2[row][column] = input.nextInt();
            }
        }
        //OUTPUT
        for(int row =0 ; row<array2.length ; row++){
            for (int column=0 ; column<array2[row].length;column++){
                System.out.print(array2[row][column] + " ");
            }
            System.out.println();
        }



    }
}
