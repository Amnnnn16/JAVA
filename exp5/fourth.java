package exp5;

interface a{
    int division(int a,int b);
    int modules(int a,int b);
}
class My_class implements a{
    @Override
    public int division(int a,int b){
        int div=a/b;
        return div;

    }
    public int modules(int a,int b){
        int mod=a%b;
        return mod;

    }

}
class new_class{
    public static void main(String args[]){
        My_class ob=new My_class();
        ob.division(5, 10);
        ob.modules(10, 5);
    }
}