import java.util.*;
public class pvt_mem {
    private int a,b;
    int c,d;
    private int sum(int a,int b){
        return a+b;

    }
   int mult(int c,int d){
    return c*d;
}

    
}
class der_class extends pvt_mem{
int a1=1;
static int b1=2;

int div(int a,int b){
    return a/b;
}
  

}
class three extends der_class{
    void display()
    {
        System.out.print(a1);
    }
    public static void main(String args[]){
        pvt_mem ob=new pvt_mem();
        three t3=new three();
        t3.display();
    //   int  a1=1;
    //   int   b1=1;
        int m=ob.mult(der_class.b1, t3.display();a1,b1);
        System.out.print(m); 

    }
}

