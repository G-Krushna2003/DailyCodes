/*2. Take an input from the user where the size of the array should be 10 and print the
output of the user given elements of an array. */

package Assign1;
import java.util.*;
public class code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();


        

    }
    
}
