public class Person{
    public static void main(String args[]){
        Garage homeGarage = new Garage();
        System.out.println(homeGarage);
        for(Car c: homeGarage.getCar()){
            homeGarage.addCar();
        }
        System.out.println(homeGarage);
    }
}