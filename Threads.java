public class Threads extends Thread {
    public void run(){
        System.out.println("This code is running in a thread");
    }


    public static void main(String[] args){
        //Threads allows a program to operate more efficiently by doing multiple things at the same time.
        //Threads can be used to perform complicated tasks in the background without interrupting the main program
        //There are two ways to create a thread. It can be created by extending the Thread class and overriding its run() method: as shown above
        Threads obj = new Threads();
        obj.start();
        System.out.println("This code is outside the thread");


    }
    //If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
    
}
