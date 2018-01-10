public class CarDriver{
    public static void main(String args[]){
        Car car1 = new Car("Tesla", 2016, "White");
        Car car2 = new Car("Ford", 2004, "Red");
        System.out.println("Total Cars: " + Car.getTotalCars());
        System.out.println("Car1 " + car1);
        System.out.println("Car2 " + car2);
        changeIt(car1, car2);
        System.out.println("Car1 " + car1);
        System.out.println("Car2 " + car2);
    }
    public static void changeIt(Car obj1, Car obj2){
        System.out.println("------------Changing it------------");
        obj1.setYear(5000);
        obj1.setModel("5000");
        obj1.setColor("5000");
        System.out.println("Car1 " + obj1);
        Car c = new Car("Mini", 2005, "Blue");
        System.out.println("Car3 " + c);
        obj2 = c;
        obj2.setYear(4000);
        obj2.setModel("4000");
        obj2.setColor("4000");
        System.out.println("Car2 " + obj2);
        System.out.println("-----------Changed-----------");
    }
}