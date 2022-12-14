public class trunk_exc {
    String type;
    trunk_exc(String type){
        this.type=type;
    }
    double Cal_rate(){
        if(this.type.compareTo("lightning")==0){
            return 2.0;
        }else if(this.type.compareTo("urgent")==0){
            return 1.5;
        }else if(this.type.compareTo("ordinary")==0){
            return 1.0;
        }else{
            return 0;
        }
    }
}
class Cost_cal extends trunk_exc{
    int duration;
    Cost_cal(String name,int duration){
        super(name);
        this.duration=duration;
    }
    void cal(){
        double rate=super.Cal_rate();
        System.out.println("The cost of the trunk call: "+this.duration*rate+"\n");
    }
}
class Test{
    public static void main(String[] args) {
        Cost_cal ob1=new Cost_cal("lightning",300);
        Cost_cal ob2=new Cost_cal("urgent",400);
        Cost_cal ob3=new Cost_cal("ordinary",500);
        ob1.cal();
        ob2.cal();
        ob3.cal();
    }
}

