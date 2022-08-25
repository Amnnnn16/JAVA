import java.util.*;
public class divby5{

    public int func(){
        int i;
        int sum=0;
        for(i=41;i<250;i++)
        {
            if(i%5==0)
            {
                sum=sum+i;
            }
            
        }
        return sum;
    }

        public static void main(String args[]){
            divby5 ob=new divby5();
            int s;
            s=ob.func();
            System.out.println("Output is"+s);

        }

    }
    
