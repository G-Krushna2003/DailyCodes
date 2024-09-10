/*
 Given an integer array and an integer element, check if the array contains the
element.
Input: Output:
[5, 2, 4, 1, 3], 2   True
 */


package Accenture;

public class Example3 {
    public static void main(String[] args) {
        int arr[]={5,2,4,1,3};
        int num=2;
        int itr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("true");
                break;
                
            }
            itr++;
            
        }
        System.out.println(itr);
    }
    
}
