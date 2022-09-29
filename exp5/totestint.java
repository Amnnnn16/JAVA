package exp5;

interface Test{
    public int square(int a); 
}
class Area implements Test{
    public int square (int a)
    {
        return a*a;
    }
}
public class totestint{
    public static void main(String[] args) {
        Area a=new Area();
        int area=a.square(9);
        System.out.println(area);
    }
}