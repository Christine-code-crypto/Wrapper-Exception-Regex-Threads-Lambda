public class ConcurrencyProblem extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyProblem thread = new ConcurrencyProblem();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run(){
        amount++;
    }
    
}
