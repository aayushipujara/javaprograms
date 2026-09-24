import.java.lang.*;
class a extends Thread
  {
    public void run()
   {
     for(int i=1;i<=5;i++)
     {
       System.out.println("From thread a:" + i);
     }
    System.out.println("Exit from thread a");
   }
  }
class b extends Thread
  {
    public void run()
   {
     for(int j=1;j<=5;j++)
     {
       System.out.println("From thread b:" + j);
     }
    System.out.println("Exit from thread b");
   }
  }
class c extends Thread
  {
    public void run()
   {
     for(int k=1;k<=5;k++)
     {
       System.out.println("From thread c:" + k);
     }
    System.out.println("Exit from thread c");
   }
  }
class u4p1
  {
    public static void main(String args[])
    { 
      a a1=new a();
      a1.start();
      b b1=new b();
      b1.start();
      c c1=new c();
      c1.start();
    }
  }
      
