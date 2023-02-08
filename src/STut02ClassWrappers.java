public class STut02ClassWrappers {

    /* Ways to create class wrappers
    //1. CLASS CONSTRUCTORS for wrapping (**CAN NEVER BE PUBLIC**)
    Character charWrapper = new Character('c');
    Integer intWrapper = new Integer(34);
    Boolean booleanWrapperFromText = new Boolean("true");
    Boolean booleanWrapperFromValue = new Boolean(true);

    //2.STATIC METHOD valueOf for wrapping
    Double doubleWrapper = Double.valueOf(0.0);
    Float floatWrapper = Float.valueOf("3.14f");

    //3.Assign primitive value to reference value
    Short shortWrapper = 124;
    Long longWrapper = 19836473L;
     */

    /*Ways to use class wrappers, ie. extraction of primitive values from object(wrapper class)
    public static void main(String[] args){
        Float floatWrapper = Float.valueOf("3.14f");
        System.out.println(floatWrapper.byteValue()); // 3, returns float as byte
        System.out.println(floatWrapper.shortValue()); // 3
        System.out.println(floatWrapper.intValue()); // 3
        System.out.println(floatWrapper.longValue()); // 3
        System.out.println(floatWrapper.floatValue()); // 3.14
        System.out.println(floatWrapper.doubleValue()); // 3.140000104904175 returns as double

        float floatPrimitive = Float.parseFloat("3.14"); //now in String
        System.out.println(floatPrimitive); // 3.14 returns String value as float

        int intPrimitive = Integer.parseInt("137");
        System.out.println(intPrimitive); // 137 returns String value as int

        Integer wrapper = Integer.valueOf("3ab4"); //outputs error exception, cannot be Integer

        String hexValue = Integer.toHexString(155);
        System.out.println(hexValue); //9b

        String octalValue = Integer.toOctalString(155);
        System.out.println(octalValue); //233

        String binaryValue = Integer.toBinaryString(155);
        System.out.println(binaryValue); //10011011
    }
     */

    /*AUTOBOXING UNBOXING
    Integer integerWrapper = 147; //autoboxing
    int integerPrimitive = integerWrapper; //unboxing
    //verified through comparison operators ==
    //wrappers are immutable, cannot be modified but a new object is created to signify the change. ex.
     */

    /*
        public static void main(String[] args) {
            //EXAMPLES with values ranging from -128 to 127
            Integer wrapper1 = new Integer(15);
            Integer wrapper2 = new Integer(15);
            //object created using constructor, so they're not cached, hence in RAM they are different objects
            System.out.println(wrapper1 == wrapper2); //outputs false

            Integer wrapper3 = Integer.valueOf(15);
            Integer wrapper4 = Integer.valueOf(15);
            //object/instance created using valueOf method, they're cached in memory as integers (-128 up to 127), hence they are viewed as the same instance
            //byte, short, integer, long store objects values -128 to 128, char is 0 to 127, caching depends on the wrapper class type
            System.out.println(wrapper3 == wrapper4); //outputs true

            Integer wrapper5 = 15;
            Integer wrapper6 = 15;
            //object created using autoboxing, they're cached and they're seen as same
            System.out.println(wrapper4 == wrapper5); //outputs true
            System.out.println(wrapper5 == wrapper6); //outputs true

            //EXAMPLES with values >129
            Integer wrapper1 = new Integer(129);
            Integer wrapper2 = new Integer(129);
            Integer wrapper3 = Integer.valueOf(129);
            Integer wrapper4 = Integer.valueOf(129);
            Integer wrapper5 = 129;
            Integer wrapper6 = 129;

            System.out.println(wrapper1 == wrapper2); //false
            System.out.println(wrapper3 == wrapper4); //false
            System.out.println(wrapper4 == wrapper5); //false
            System.out.println(wrapper5 == wrapper6); //false
        }
     */
}
