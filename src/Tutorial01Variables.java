public class Tutorial01Variables {
    public static void main(String[] args) {

        System.out.println("Hello World! "); //Outputs Hello World

        System.out.println(29 * 3); //outputs 87
        //Get outta here
        /* I am learning how to code using Netbeans */

        //String Variable
        String name = "Copalina";
        System.out.println(name); // Outputs Copalina

        //Integer Variable
        int studentNumber = 15;
        final float myFloatNum = 5.99f;
        String myLetter = "M";
        String myText = "Haler";
        int x = 5, y = 7, z = 123;
        System.out.println((x + y) * z); // Outputs 1476

        System.out.println(myLetter); // Outputs M

        System.out.println("Yes" + " " + myText); //Outputs Yes Haller

        String studentcode = myLetter + myText;
        System.out.println (studentcode); //MHaler

        /*Java Data types*/
        int myNum = 128;
        byte myByte = 127;
        short myShortNumber = 32767;
        long largestnumber = 922337203685477580L;
        float decimalCode = 5.74E2f;
        double doubleCode = 19.99d;

        System.out.println(myNum + myShortNumber + largestnumber + doubleCode);//9.2233720368551053E17

        System.out.println(decimalCode * myByte);//72898.0

        boolean isJavaFunn = true;
        boolean isFishTasty = false;
        char letterA = 65;

        System.out.println(letterA);//A

        int myInt = 8;
        System.out.println(studentNumber + myFloatNum);//20.99

        double myDouble = myInt;
        System.out.println(myDouble);//8.0

        double myDOUBLE = 9.88d;
        int myINTEGER = (int) myDOUBLE;
        System.out.println(myINTEGER);//9

        int a = 10;
        a += 5;
        System.out.println(a);//15

        int b = 5;
        int c = 1;
        System.out.println(a > b || b < c);//true

        /*Java Strings*/
        System.out.println(name.length());//8

        System.out.println(name.toUpperCase());//COPALINA

        System.out.println(name.toLowerCase());//copalina

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(myLetter.concat(myText));//Mhaler

        System.out.println(txt.indexOf("w"));//14 where w starts, counts from 0

        String myPoem = "We\'re doing this to be \"happy\" or fulfilled.";
        System.out.println(myPoem); //We're doing this to be "happy" or fulfilled.

        /*Java Math*/
        Math.max(b,c);
        Math.min(b,c);
        Math.sqrt(100);
        Math.abs(-4.7);
        int randomNum = (int)(Math.random() * 101);

        System.out.println(isJavaFunn);//true
        System.out.println(isFishTasty);//false

        int d = 10;
        int e = 9;
        System.out.println(d > e);//true
        System.out.println(9 == 10);//false

        //Java Booleans if else statement
        int myAge = 16;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        /*Java If.. Else*/
        if (d >= e) {
            System.out.println("Equal or greater than");
        } else {
            System.out.println("False");
        }

        int time = 16;
        if (time < 14) {
            System.out.println("Good afternoon");
        } else if (time >= 16) {
            System.out.println("Good evening");
        } else {
            System.out.println("Hello");
        }

        //Java Short Hand if..else
        String resultTime = (time > 14) ? "Good afternoon" : "Good evening";
        System.out.println(resultTime);
        //Java switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day");
        }
        //While Loop
    }
}