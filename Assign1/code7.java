/*Write a program to print the elements of the array which is divisible by 4. Take input
from the user.
Example:
Enter size: 10
14 20 18 9 11 51 16 2 8 10
Output:
20 is divisible by 4 and its index is 1
16 is divisible by 4 and its index is 6
8 is divisible by 4 and its index is 8 */

package Assign1;
import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%4==0){
                System.out.println(arr[i]+" is divisible by 4 and its index is "+i);
            }
        }
    }
    
}
