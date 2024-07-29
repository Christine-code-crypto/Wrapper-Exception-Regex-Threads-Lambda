public class Thread2 implements Runnable {
    //another way of creating a thread is my implementing the runnable interface
    public void run() {
        System.out.println("This code is running in a thread");
      }
      public static void main(String[] args) {
        Thread2 obj = new Thread2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running outside of a thread");
      }
      //If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:

      /*Differences between "extending" and "implementing" Threads
      The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable. */
}
