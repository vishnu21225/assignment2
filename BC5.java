import  java.lang.*;
class MyThread extends Thread
{
public MyThread()
{
for(int i=1;i<=25;i++)
{
System.out.println("the square root of "+i+"is"+Math.sqrt(i));
}
Thread t1=new Thread();
t1.start();
for(int i=25;i<50;i++)
{
System.out.println("the square root of "+i+"is"+Math.sqrt(i));
}
Thread t2=new Thread();
t2.start();
for(int i=50;i<75;i++)
{
System.out.println("the square root of "+i+"is"+Math.sqrt(i));
}
Thread t3=new Thread();
t3.start();
}
public void run()
{
for(int j=75;j<100;j++)
{
System.out.println("the square root of"+j+" is" +Math.sqrt(j));
}
}}
 class BC5
{
public static void main(String a[])
{
MyThread m=new MyThread();


m.start();


}
}