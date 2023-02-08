public class Tutorial03Methods {

    /* METHODS
    static void myMethod() {
        //myMethod - name of method
        //method is a code block that can be reused to perform action or functions
        //static - method belongs to the main class and not an object of the Main class
        //void - method doesn't have return value
        System.out.println("I just got called!");
    }
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
    */

    /* PARAMETERS (Single or multiple) & ARGUMENTS
    public static void myMethod2(String fname, int age) {
        //fname & age - parameters, variables must be identified
        //when passed to the method (ie passing data), it is called an argument.
        //fnames Joe, Nick, Frankie, ages 20, 22, 21 are all arguments
        System.out.println(fname + " Jonas" + " is " + age + ".");
    }
    public static void main(String[] args) {
        myMethod2("Joe", 20);
        myMethod2("Nick", 22);
        myMethod2("Frankie", 21);
    }
     */

    /* RETURN VALUES
    //indicate void key if method doesn't need to return a value
    //otherwise, use other primitive data types/variables and use return key
    static int myMethod3(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(myMethod3(5, 3));
        System.out.println(myMethod3(2, 2));
    }
    //store result in a VARIABLE (z)
    static int myMethod4(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        int z = myMethod4(5, 3);
        System.out.println(z);
    }
    //if.else statements in a method
    static void checkAge(int age){
        if (age < 18) {
            System.out.println("You are not old enough");
        }
        else {
            System.out.println("You are old enough");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
     */

    /*METHOD OVERLOADING

    //example 1 with 2 defined methods
    static int plusMethodInt(int x, int y) {
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main (String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    //example 2 with 1 overloaded method, as long as parameter data types differ
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
     */

    //SCOPE - region where variables inside are accessible only inside
    //ie. method System.out.println can only run ff the code block/line where set variables are defined

    //RECURSION - technique of making fx call itself
    //ie. adding a range of numbers (1-100)

    public static void main(String[] args) {
        int result = sum(100); //IF RANGE; define range in comma ie. 5 to 10 (5, 10)
        System.out.println(result);
    }
    public static int sum(int k) { //IF RANGE: define parameters of start and end
        if (k > 0) { //IF RANGE: (end > start)
            return k + sum(k - 1); //IF RANGE return end + sum(start, end - 1)
        } else {
            return 0; //IF RANGE return end to signify HALTING the recursion
        }
    }
}
