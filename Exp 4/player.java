class Player {
    String n;
   int age;
   String sp;
    Player(String n,int age,String sp){
        this.n=n;
        this.age=age;
        this.sp=sp;
    }
    void display() {
        System.out.println("Name is " + this.n);
        System.out.println("age " + this.age);
        System.out.println("sport is "+this.sp);
        System.out.println("");
    }
}
class Hockey_Player extends Player{
    Hockey_Player(String n,int age, String sp)  {
        super(n,age, sp);
    }
}
class Cricket_Player extends Player{

    Cricket_Player(String n,int age, String sp) {
        super(n,age, sp);
    }
}
class Football_Player extends Player{
    Football_Player(String n,int age, String sp)  {
        super(n,age, sp);
    }
}

class Program{
    public static void main(String[] args) {
        Hockey_Player ob3=new Hockey_Player("a",36,"hockey");
        Cricket_Player ob1=new Cricket_Player("b",38,"Cricket");
        Football_Player ob2=new Football_Player("c",35,"Football");
        

        ob1.display();
        ob2.display();
        ob3.display();
    }
}
