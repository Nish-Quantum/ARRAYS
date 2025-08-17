package DSAConcepts;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_List {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(78);
        System.out.println(list);  //[1, 2, 78]

        System.out.println(list.contains(78));    //true

        list.set(0,99);
        System.out.println(list);    //[99, 2, 78]

        list.remove(2);
        System.out.println(list);    //[99, 2]

        //INPUT
        for (int i = 0; i <5 ; i++) {
            list.add(input.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
