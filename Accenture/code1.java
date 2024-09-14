package Accenture;
public class code1 {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9};
        int num=5;

        if(arr.length<=9){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    System.out.println(i);
                    break;
                }
            }
        }else{
            System.out.println(0);
            
        }
    }

    
}
