
/*8. Write a program where you have to store the employee’s age working at a company,
take count of employees from the user.Take input from the user. */
package Assign1;
import java.util.Scanner;
public class code8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total count of the employees: ");
        int count=sc.nextInt();
        int age[]=new int[count];
        System.out.println("Enter the age ");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            System.out.println("Age of Employees worked in company "+age[i] );
        }
    }
    
}
