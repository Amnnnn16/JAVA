class greatest{
int max(int a,int b,int c){
if(a>b)
 {
	if(a>c)
	 return a;
	else 
	 return c;
 }
else if(b>a)
{	
	if(b>c)
	 return b;
	else
	 return c;
}
else{return 0;}}

public static void main(String args[]){
greatest obj=new greatest();
int m;
m=obj.max(10,20,30);
System.out.print(m);

}}