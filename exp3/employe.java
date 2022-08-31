import java.util.*;

import org.ietf.jgss.GSSCredential;
public class employe
{ 
    double g_sal,it,n_sal;
    int spec_a=7000;
   
    public double gsal(int b_sal,int job_stts){
        double hra = (12/10)*b_sal;
        double da=(50/100)*b_sal;
        double ta=(5/100)*b_sal;
    if(job_stts==1){
        g_sal=b_sal+hra+da+ta+spec_a;
    }
    else{
        g_sal=b_sal+ta;
    }
    return g_sal;
    }


    public double inc_tax(double gsal){
        if(gsal>100000){
            it=(30/100)*gsal;
        }
        if(gsal>50000 && gsal<1000000){
            it=(10/100)*gsal;
        
        }
        else{
            it=0;
        }
        return it;
    }

    public double Net_sal(int b_sal,int job_stts){
        g_sal=gsal(b_sal, job_stts);
        it=inc_tax(g_sal);
        double pf=12/100*g_sal;
        n_sal=g_sal-it-pf;

        return n_sal;


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n;int bsal,job_stts;double nsal;
        System.out.println("Enter your name");
        n=sc.nextLine();
        System.out.println("Enter your base salary");
        bsal=sc.nextInt();
        System.out.println("Enter 1 if you are permanent else 0");
        job_stts=sc.nextInt();
        employe ob=new employe();



        nsal=ob.Net_sal(bsal, job_stts);
        System.out.println(n+" your net salary is  "+nsal);

    }
}