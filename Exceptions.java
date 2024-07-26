public class Exceptions {
    public static void main(String[] args) {
        try{
        int [] numbers = {1,2,3};
        System.out.println(numbers[10]);
        }
        catch(Exception e){
            System.out.println("That index is out of bounds");
        }
        //The finally statement lets you execute code, after try...catch, regardless of the result:
        finally{
            System.out.println("The try-catch has finished");
        }
    }
    
}
