public class Tutorial04Classes {
    /*CONSTRUCTOR
    int x; //class attribute
    public MyClass(int y) { //class constructor for MyClass class, parameters can be included, must never have void/return type
        x = y;
    }
    public static void main(String[] args) {
        MyClass class1 = new MyClass(5); //object to call the class constructor;
        System.out.println(class1.x); //outputs 5
    }
     */

    /* ACCESS Modifiers
    1. Public CLASS - accessible by any other class
    2. Default CLASS - only accessible for classes within the same package

    for attributes, methods, and constructors..
    1. Public - accessible code for all classes (or sub) / packages (by subclasses, internal or external)
    2. Protected - accessible code in classes (or sub) / packages (by subclasses, internal) NOT EXTERNAL
    3. Default - accessible code within same package
    4. Private - accessible code within declared class

    NON-ACCESS Modifiers
    1. Final CLASS - cannot be inherited by other classes
    2. Abstract CLASS - the class cannot be used to create objects

    for attributes and methods
    1. Final - cannot be overridden or modified
    2. Static - belongs to the class, rather than as an object
    3. Abstract - can only be used within abstract class, and only on methods
    4. Transient - skipped when serializing the object containing them
    5. Synchronized - methods can only be accessed by one thread at a time
    6. Volatile - value of an attribute is not cached thread-locally, and is always read from the "main memory"
    CHECK OUT ABSTRACT sample in Tutorial05Abstract.java
     */

//    //ENCAPSULATION - protection of sensitive data, workaround is to set variables as private and use get and set methods to update and access variables
//    private String className;
//    public String getClassName() { //gets the variable value
//        return className;
//    }
//    public void setClassName(String newClassName) { //sets the value
//        this.className = newClassName;
//    }
//    public static void main(String[] args) {
//        getClassName();  //Intrebare 1:
//        setClassName("Java");
//    }
}

//class MainClass {

    /* CLASSES - ACCESS, MODIFY, MULTIPLE Objects
    int x = 5;
    int y = 3;
    public static void main(String[] args) {
        MainClass object1 = new MainClass();
        MainClass object2 = new MainClass();
        object1.x = 20;
        System.out.println(object1.x); // outputs 20
        System.out.println(object2.x); // outputs 5
    }
    */

    /* MULTIPLE Attributes
    String fname = "Tipi";
    String lname = "Cuanco";
    int age = 22;
    public static void main(String[] args) {
        MainClass javaFund = new MainClass();
        System.out.println("Name: " + javaFund.fname + " " + javaFund.lname); // Name: Tipi Cuanco
        System.out.println("Age: " + javaFund.age); // Age: 22
    }
    */

    /* STATIC vs PUBLIC methods
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects.");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects.");
    }
    public static void main(String[] args) {
        myStaticMethod();
        myPublicMethod(); //this line will compile an error!! must be w/ object

        MainClass myObj = new MainClass();
        myObj.myPublicMethod();
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can.");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) {
        MainClass honda = new MainClass();
        honda.fullThrottle(); //if just fullThrottle, editor will suggest to transform methods into void
        honda.speed(100); //in order to use public methods, an object must be created and existing
        //(.) is used to access the object's attributes and methods
    }
    */
//}
