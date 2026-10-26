class Program6
{
 public static void main(String args[])
{
 System.out.println("Program to swap two variables without using third variable");
 int a = 10; 
 int b = 20 ;
 a +=b ;
 b = a-b;
 a = a-b;
 System.out.println("a:"+a +" b:"+b);
}
}