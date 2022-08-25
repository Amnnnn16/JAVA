import java.util.*;
public class sq{
    public int square( int arr[]){
        
        int sum=0;
        for(int i=0;i<10;i++){

            sum=sum + (arr[i]*arr[i]);

        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int i;
    int arr[] = new int[10];
    for(i=0;i<9;i++){
        System.out.println("enter number");
        arr[i]=sc.nextInt();

    }    

    sq ob =new sq();
   int s= ob.square(arr);
   System.out.println(s);

    }
}