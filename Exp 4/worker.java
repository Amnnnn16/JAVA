public class worker{
    String name;
    int age;
    int sal_rate;

    worker(String name, int age,int sal_rate){
        this.name=name;
        this.age=age;
        this.sal_rate=sal_rate;
    }

    void display(){
        System.out.println("Name is:"+name);
        System.out.print("Age is:"+age);
        System.out.println("");
    }}
    class DailyWorker extends worker{
         DailyWorker(String name,int age,int sal_rate){
            super(name, age, sal_rate);
         }
          public void Compay(int hours){
                super.display();
                System.out.println("Salary is"+sal_rate*hours);

            }
         }
         class SalaryWorker extends worker{
       
         SalaryWorker(String name,int age,int sal_rate){
            super(name, age, sal_rate);
         }
        public void Compay(int hours){

            super.display();
           
            if(hours<40){
            System.out.println("Salary is "+hours*sal_rate);}
          
            else{
                System.out.println("Salary is " + 40*sal_rate);
            
            }
        }

         }
         class lab{
            public static void main(String arg[]){
                DailyWorker ob=new DailyWorker("a", 19, 250);
                ob.Compay(20);
                SalaryWorker ob1=new SalaryWorker("b", 25, 300);
                ob1.Compay(26);

                
            }
         }
