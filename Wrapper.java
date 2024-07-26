public class Wrapper{
    public static void main(String[] args) {
        //Wrapper classes provide a way to use primitive data types (int, double) as objects
        //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):

        //Creating Wrapper Objects
        //To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:
        Integer myInt = 5;
        Double myDouble = 100.00;
        Character myChar = 'a';

        System.out.println(myInt);
        System.out.println(myChar);
        System.out.println(myDouble);

        //methods to get values associated with the corresponding wrapper
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        //using the toString() method
        Integer myInte = 100;
        String myString = myInte.toString();
        System.out.println(myString);
        System.out.println(myString.length());

    }
}