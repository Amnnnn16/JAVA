import java.util.*;
public class months{

    public void mon(int m){
        switch (m) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
            System.out.println("Feb");    
                break;
            
            case 3:
            System.out.println("March");    
                break;

            case 4:
            System.out.println("April");    
                break;
            
            case 5:
            System.out.println("May");    
                break;       
        
            case 6:
            System.out.println("June");    
                break;
                
            case 7:
            System.out.println("July");    
                break;
            
            case 8:
            System.out.println("Aug");    
                break;
            
            case 9:
            System.out.println("Sept");    
                break;
            
            case 10:
            System.out.print( "Oct");    
                break;
            
            case 11:
            System.out.println ("Nov");    
                break;

            case 12:
            System.out.println("Dec");    
                break;
            default:
            System.out.println("wrong choice");
                break;
        }
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter no of months");
        m=sc.nextInt();
        months ob=new months();
        
        ob.mon(m);  
        
    }
}
    
