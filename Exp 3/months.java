import java.util.*;
public class months{

    public String mon(int m){
        switch (m) {
            case 1:
                return "Janvary";
                break;
            case 2:
                return "Feb";    
                break;
            
            case 3:
                return "March";    
                break;

            case 4:
                return "April";    
                break;
            
            case 5:
                return "May";    
                break;       
        
            case 6:
                return "June";    
                break;
                
            case 7:
                return "July";    
                break;
            
            case 8:
                return "Aug";    
                break;
            
            case 9:
                return "Sept";    
                break;
            
            case 10:
                return "Oct";    
                break;
            
            case 11:
                return "Nov";    
                break;

            case 12:
                return "Dec";    
                break;
            default:
                return "wrong choice";
                break;
        }
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter no of months");
        m=sc.nextInt();
        months ob=new months();
        String s;
        s=ob.mon(m);  
        System.out.print("Month is"+s);
            
    }
}
    
