class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is running with name:"+Thread.currentThread().getName());
        System.out.println("Thread priority:"+Thread.currentThread().getPriority());
    }
}

public class u4p3{
    public static void main(String args[]){
        Thread myThread=new Thread(new MyThread());
        myThread.setName("mythreadnm");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

        //Main thread
        
        System.out.println("Main Thread name:"+Thread.currentThread().getName());
        System.out.println("Main Thread priority:"+Thread.currentThread().getPriority());
    }
}