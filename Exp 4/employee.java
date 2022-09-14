public class employee {
    String name;
    int empid;
    int salary;
    employee(String name,int empid,int salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;

    }
    void display(){
        System.out.print("Name of employe : "+ name);
        System.out.println("salary of employe : "+ salary);
    }
}
