import java.util.*;
public class marks
{
    public String grading(int marks){
        if(marks>=40&& marks<=50)
            return "Pass";
        else if(marks>=51 && marks<=75)
            return "Merit";
        else if(marks>75)
            return "distinction";
        else
        return "fail";

        }
        public void  bubbleSort(int array[]) {
            int size = array.length;
        
            for (int i = 0; i < size - 1; i++){
           
              for (int j = 0; j < size - i - 1; j++)
        
            
                if (array[j] > array[j + 1]) {
        
                  int temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
                }}
          }
        
        public static void main (String args[])
        {
            Scanner sc=new Scanner(System.in);
            int mrks[]=new int[10];
            String grds[]=new String[10];
            int i;
            for(i=0;i<10;i++){
            System.out.print("Enter marks "+ i+" ");
            mrks[i]=sc.nextInt();
            }
            marks ob=new marks();
            for(i=0;i<10;i++){
                grds[i]=ob.grading(mrks[i]);
            }
            System.out.println("s.no"+" "+"Marks"+" "+"Grades");
            for(i=0;i<10;i++){
            System.out.println(i+" "+mrks[i]+" "+grds[i]);
            }


        }
        
    }
