package DSAConcepts;
import java.util.Arrays;
public class Arrays_Basics {
    public static void main(String[] args) {

        /*
        ARRAYS DECLARATION
        datatype[] variable_name = new datatype[size]
        */

        int[] roll_number = new int[5];

        //or directly

        int[] roll_number2 = {1,2,3,4,5};     //--->Declaration + Initialisation
        int[] roll ;           //declaration --> at compile time in stack memory
        roll = new int[5];     //object is being created in the heap memory(actual) -->at run time(INITIALISATION)(DYNAMIC MEMORY ALLOCATION)
        System.out.println(Arrays.toString(roll_number2));
        System.out.println(roll_number[0]);   //---->0
        String[] name = new String[5];  
        System.out.println(name[0]);    //----> null


        //primitives are stored in stack memory--->int,char,boolean,float
        //all other objects like string array are stored in heap memory
        String arr = null;
       // int a = null(ERROR)--->null is not defined for primitives
    }


}
