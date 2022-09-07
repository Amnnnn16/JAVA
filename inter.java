interface Shape
 {
   final float pi=3.14f;
   float area (int r);

}
class Circle implements Shape{
    public float area(int r)
    {
        return pi*r*r;
    }
    final void display()
    {
        System.out.println(area(2));
    }
    final class A extends Circle
    {
     void display()
        {
            System.out.println(area(5));
        }
    }
    

public static void main(String args[]) {
    A a1=new A();
    a1.display();

    
}}
