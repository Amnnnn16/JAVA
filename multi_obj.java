class circle{
    int length;
    double radius;
    circle(double r){
       this.radius=r;
    }
    circle(int l,double r){
        this.length=l;
       this.radius=  r;

    }
    circle(circle c){
        this.length=c.length;
        this.radius=c.radius;


    }
    double area(){
        double area=0;
        area=3.14*this.radius*this.radius;
        return area;
    } 
}

public class multi_obj {
    public static void main(String args[]){
        circle obj=new circle(2.5);
        circle obj1=new circle(obj);
        double a=obj.area();
        System.out.println(obj1.area());
        System.out.print(a);

    }
    
}
