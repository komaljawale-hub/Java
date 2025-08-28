public class Car {
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    Car(){                       // this is default constructor
        this("Black");

        currentFuelInLiters = 5;
    }
//
    static{
        System.out.println("I am in static block");
    }

    {
        System.out.println("I am in init block");
    }
  //   above is code block concept ....init block runs at each obj creation but...static block runs only once at the starting of code

    Car(String colour){                    // this is parameterized constructor where customer have to input which colour he wants
        this.colour = colour;
        noOfSeats = 5;
        noOfWheels = 4;
        maxSpeed = 150;
        currentFuelInLiters = 2;

    }

    public Car start(){
        if( currentFuelInLiters == 0){
            System.out.println("Your car is out of fuel, cannot be started");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Your car is in reserved mode, please refuel");
        }else {
            System.out.println("Car is started....brummmhhhh.......");
        }
        return this;
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}