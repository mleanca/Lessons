package STut01GasStation;

public class GasStation {

    /*USE OF ENUMERATIONS
    FuelType[] allowedFuelTypes; //FuelType here is a class

    public static void main(String[] args) {
        GasStation gasStation = new GasStation(); //object gasStation created
        gasStation.allowedFuelTypes = new FuelType[] {
                FuelType.DIESEL, FuelType.GASOLINE};

        //SWITCH Technique
        FuelType fuelType = FuelType.DIESEL;
        switch (fuelType) {
            case GASOLINE:
                System.out.println("It's gasoline");
                break;
            case DIESEL:
                System.out.println("It's diesel!");
                break;
            case PROPANE:
                System.out.println("It's propane!");
                break;
            default:
                System.out.println("Unknown fuel type!");
        } //outputs It's diesel, if line  FuelType fuelType = FuelType.DIESEL is not defined then the code will not compile
    }
     */

    /* ENUMERATION ACCESS
    public static void main(String[] args) {
        FuelType fuelType = FuelType.DIESEL;
        System.out.println(FuelType.DIESEL); //DIESEL
        System.out.println(fuelType == FuelType.DIESEL); //true
    }
    */

    /*OUTPUTS DEFAULT INT SEQUENCE IN ENUMERATION
    public static void main(String[] args) {
        //A method to treat enumeration as an array
        for (FuelType fuelType: FuelType.values()) {
            System.out.println(fuelType.name() + " " + fuelType.ordinal());
        } // GASOLINE 0 DIESEL 1 PROPANE 2
    }
     */

    /*
    //Another way to access a value from within the enumeration is to use the valueOf method.
    //The value passed as an argument to this method must necessarily correspond to the value in the enumeration,
    //otherwise an exception will be thrown:
    public static void main(String[] args) {
        FuelType correctDieselType = FuelType.valueOf("DIESEL"); //DIESEL
        FuelType wrongDieselType = FuelType.valueOf("diesel"); //exception error will show
    }
     */

    //OUTPUTS CODEVALUES ASSIGNED IN PLACE OF DEFAULT 0,1,2
//    public static void main(String[] args) {
//        for (FuelType fuelType : FuelType.values()) {
//            System.out.println(fuelType.name() + " " + fuelType.getCode());
//        } // GASOLINE G DIESEL D PROPANE P
//    }

}
