public class Tutorial02Loops {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

         /* WHILE LOOP
        int i = 0;
        while (i < 2) {
            System.out.println(i);
            i++;
        }
         */

         /* D0/WHILE LOOP - runs w/o testing the condition
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
         */

         /* FOR LOOP - when you know exactly how many times to loop
        for (int i = 0; i < 8; i++) {
            System.out.println("Yes");
        }
         */

         /* NESTED Loops - loop in a loop
         // outer loop - runs 2x
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
            //inner loop - runs 6x (2*3)
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }
         */

         /*FOR-EACH LOOP - loop through arrays (group of similar variables)
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
         */

         /* BREAK/CONTINUE statement - to break or skip an iteration
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // change tp BREAK
            }
            System.out.println(i);
        }
         */

         /* BREAK in WHILE statements
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
          */

         /*CONTINUE in WHILE statements
        int i = 0;
        while (i < 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
          */

         /*MULTIDIMENSIONAL ARRAYS(MA)
        int[][] myCode = {{1,2,3,4}, {5,6,7}};
        System.out.println(myCode[1][1]); //Accessing MA Targets 2nd array, 2nd number, counts from 0

        myCode[1][2] = 8;
        System.out.println(myCode[1][2]); //Changed an MA element value
        for (int i = 0; i < myCode.length; i++) {
            for (int j = 0; j < myCode[i].length; j++) {
                System.out.println(myCode[i][j]);
            }
        } //Loop in a loop MA NEED TO REVIEW
          */
    }

}
