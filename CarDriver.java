public class CarDriver{
    public static void main(String args[]){
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("Total Cars: " + Car.getTotalCars());
        System.out.println(car1);
        System.out.println(car2);
        changeIt(car1, car2);
        System.out.println(car1);
        System.out.println(car2);
    }
    public static void changeIt(Car obj1, Car obj2){
        obj1.setYear(5000);
        Car c = new Car();
        obj2 = c;
        obj2.setYear(4000);
    }
}