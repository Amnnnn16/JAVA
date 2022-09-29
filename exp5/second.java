package exp5;

interface A{
    void method1(int a);
    void method2(int b);
}
class Myclass implements A{
    public void method1(int a){
        System.out.println(a+1);
    }
        public void method2(int b){
            System.out.print(b-1);
        }
    

    }
    class new_class{
        public static void main(String args[]){

        
 Myclass ob = new Myclass();
 ob.method1(2);
 ob.method2(3);

        }
    }
