abstract class Tutorial05Abstract {
    public String fname = "Tipi";
    public int age = 23;
    public abstract void study(); // abstract method
}
class Student extends Tutorial05Abstract {
    public int graduationYear = 2016;
    public void study() { //abstract method codeblock is written here
        System.out.println("Studying all day long");
    }
}
class SecondAbstract {
    public static void main(String[] args) {
        Student studentInfo = new Student(); //object that inherits attributes & methods from Abstract class
        System.out.println("Name: " + studentInfo.fname);
        System.out.println("Age: " + studentInfo.age);
        System.out.println("Graduation Year: " + studentInfo.graduationYear);
        studentInfo.study(); //call abstract method
    }
}

