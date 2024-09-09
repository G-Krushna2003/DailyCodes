/*4. Write a program to print the sum of odd elements in an array.Take input from the user.
Example:
Enter size: 10
Array:
1 2 3 4 2 5 6 2 8 10 
Output :
Sum of odd elements : 9 */

package Assign1;
import java.util.*;
public class code4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];
        int sum=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                sum+=arr[i];
            }
        }
        System.out.println("sum of all odd elements: "+sum);
    }
}
