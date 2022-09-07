import java.util.*;
public class combination{

    public void display(int a,int b,int c){
        int arr[]=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        
   
    int i,j,k;
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
        for(k=0;k<3;k++){
             //condition to avoid repeted numbers in combination
                 if(i!=j&&j!=k&&k!=i){
                    System.out.println("{"+" "+arr[i]+" "+arr[j]+" "+arr[k]+" "+"}");

                }
            }
        }
    }

    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 digits");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
combination ob=new combination();
ob.display(a, b, c);

    }

}
