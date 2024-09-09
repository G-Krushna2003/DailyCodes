/*
 3. Write a program to print the even elements in the array. Take input from the user.
Example :
Enter size : 10
Array:
10 11 12 13 14 15 16 17 18 19
Output :
10
12
14
16
18
 */

package Assign1;
import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    
}
