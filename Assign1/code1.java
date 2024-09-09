package Assign1;

/*1. Write a program to print the array with minimum 10 elements data.
Example:
Array:
10 20 30 40 50 60 70 80 90 100
Output :
10, 20, 30, 40, 50, 60, 70, 80, 90, 100 */

class code1{
    public static void main(String[] args) {
        
        int num[]={10,20,30,40,50,60,70,80,90,100};

        for(int i=0;i<num.length;i++){

            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}