import  java.lang.*;
class MyThread extends Thread
{
public MyThread()
{
for(int i=1;i<=5;i++)
{
System.out.println("square root of "+i+"is"+Math.sqrt(i));
}
Thread t1=new Thread();
t1.start();
for(int i=5;i<9;i++)
{
System.out.println("square root of "+i+"is"+Math.sqrt(i));
}
Thread t2=new Thread();
t2.start();
for(int i=9;i<13;i++)
{
System.out.println("square root of "+i+"is"+Math.sqrt(i));
}
Thread t3=new Thread();
t3.start();
}
public void run()
{
for(int j=13;j<17;j++)
{
System.out.println("square root of"+j+" is" +Math.sqrt(j));
}
}}
 class BC4
{
public static void main(String a[])
{
MyThread m=new MyThread();


m.start();


}
}