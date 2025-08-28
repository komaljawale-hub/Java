public class car {
        int noOfWheels;
        String company;
        int noOfDoors;
        int modelNum;
        String nameOfCar;

        public car(String company, int noOfDoors, int modelNum, String nameOfCar , int noOfWheels) {
            this.company = company;
            this.noOfDoors = noOfDoors;
            this.modelNum = modelNum;
            this.nameOfCar = nameOfCar;
            this.noOfWheels = noOfWheels;
        }

    @Override
    public String toString() {
        return "car{" +
                "noOfWheels=" + noOfWheels +
                ", company='" + company + '\'' +
                ", noOfDoors=" + noOfDoors +
                ", modelNum=" + modelNum +
                ", nameOfCar='" + nameOfCar + '\'' +
                '}';
    }

    public static void main(String[] args){
            car swift = new car("Hundai", 5, 5633, "Swift", 4);
//            System.out.println(swift.toString());
            // it is implicit so even if we dont write toString after calling object it is automatically called
        System.out.println(swift);
        }

}
