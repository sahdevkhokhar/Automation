package Assignment_module_6;

class A1 implements Runnable
{
@Override
public void run() 
{
for(int i=1;i<=10;i++)
{
System.out.println("Thread A1: "+i);	
}
}
}

class B1 implements Runnable
{
@Override
public void run() 
{
for(int i=1;i<=10;i++)
{
System.out.println("Thread B1: "+i);	
}
}
}

public class Runnable_interface_Thread 

{
public static void main(String[] args) 
{

	Thread t1 = new Thread(new A1());
	Thread t2 = new Thread(new B1());
	
	t1.start();
	t2.start();
}
	
}

