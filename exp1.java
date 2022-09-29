class Playerr {
    String name;
    int age;

    void playerr(String n,int a){
        this.name=n;
        this.age=a;

    }

    void display_info(){
        System.out.println("Name : = "+ this.name);
        System.out.println("Age : ="+ this.age);


    }

    
    
}
class cricket_playerr extends Playerr{
     cricket_playerr(String n,int a){
        this.name=n;
        this.age=a;



    }

}
public class exp1{
    cricket_playerr ob=new cricket_playerr("aman",19);
    super.display_info();




    }

