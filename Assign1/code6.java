package Assign1;
import java.util.*;
public class code6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char arr[]=new char[10];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
