package Assignment_module_6;


class Sender
{

	public void send(String msg)
	{
		System.out.println("Sending" +msg);
		
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(msg+ "sent");
		
	}
}

class Threadsend extends Thread
{
Sender sender;
String msg;
public Threadsend(Sender sender,String msg)
{
	this.sender =sender;
	this.msg=msg;
}


@Override
public void run() 
{
	synchronized (sender) 
	{
		sender.send(msg);
	}
	
}
}


public class Thread_by_Extending_Thread 
{
public static void main(String[] args) 
{
	Sender sender = new Sender();
	
	Threadsend t1 = new Threadsend(sender, "GO");
	Threadsend t2 = new Threadsend(sender, "Come");
	
	t1.start();
	t2.start();
}
}
