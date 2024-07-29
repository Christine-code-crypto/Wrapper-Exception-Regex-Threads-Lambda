import java.util.ArrayList;

public class Lambda {
    //A lambda expression is a short block of code which takes in parameters and returns a value.
    //parameter -> expression
    //(parameter1, parameter2) -> expression)

    
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
    //(n) -> { System.out.println(n); } is a lambda expression. It takes one parameter n (each element of the ArrayList) and prints it using System.out.println(n);
    //Arrow Token (->):-> separates the parameter list from the body of the lambda expression.
    //{ System.out.println(n); } is the body of the lambda expression.This block of code is executed for each element n in the numbers list.
}
}
