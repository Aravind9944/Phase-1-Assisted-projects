
class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println(" Thread started running..");
 	}
}

class Extendsthread
{
 	public static void main(String args[])
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}
}
