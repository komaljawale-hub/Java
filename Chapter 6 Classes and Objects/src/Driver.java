public class Driver {

    static int minAgeForDriving = 18;

    String date;
    int age;
    String dateOfLicence;


    public boolean isAllowedToDrive(){
        return this.age >= minAgeForDriving; //this is non static class still can be accessed in static member minAgeToDrive
    }


    public static void main(String[] args) {
//        Car myCar = new Car();
//        //myCar is object of class Car() is constructor
//
//        myCar.addFuel(4);
//        myCar.start();
//        myCar.drive();  //can access the properties of class car from its
//        // special class by . operator and property
//        myCar.drive();
//
//        System.out.println(myCar.getCurrentFuelInLiters());


        Car thar = new Car();
        Car audi = new Car("Royal blue");

//        audi.addFuel(6);

        audi.start().drive(); // properties can be accessed like this one after another because
        // audi.start returns audi ie.(this object itself) then on that audi.drive() applied
//
//        Driver myDriver = new Driver();
//        myDriver.dateOfLicence = "1/Jan/2025"; //But non Static menber can not be accessed in static class without creating object

        System.out.println("The colour of your car is " + audi.colour);
        System.out.println("Current fuel in your car: " + audi.currentFuelInLiters );

        System.out.println("The colour of your car is " + thar.colour);
        System.out.println("Current fuel in your car: " + thar.currentFuelInLiters );







    }
}
