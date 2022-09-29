interface test{
    void sqaure(int n);
}
class arithmatic implements test{
    public void sqaure(int n){
        System.out.println(n*n);
    }
}

public class interf {
    public static void main(String args[]){
        arithmatic ob=new arithmatic();
        ob.sqaure(5);
    }
    
}
