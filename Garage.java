import java.util.Scanner;
public class Garage implements Comparable<Garage>{
    //Instance Variables
    private boolean open = false;
    private int size;
    private Car[] cars;
    Scanner scan = new Scanner(System.in);
    
    //Constructor and toString
    public Garage(){
        this.setSize();
        this.cars = new Car[size];
        this.setEntry();
    }
    public String toString(){
        String output = "";
        System.out.println("This Garage has: \n");
        for(int i = 0; i < cars.length; i++){
            output += cars[i] + "\n";
        }
        return output;
    }   
    
    //Setters Getters
    public void setSize(){
        System.out.println("Size?");
        this.size = scan.nextInt();
    }
    public void setEntry(){
        System.out.println("Open? true/false");
        this.open = scan.nextBoolean();
    }   
    public int getSize(){
        return this.size;
    }
    public boolean getEntry(){
        return this.open;
    }
    public Car[] getCar(){
        return cars;
    }
    public void setCar(int index){
        System.out.println("Set car to: ");
        cars[index] = new Car();
    }
    
    //CompareTo Methods and co.
    public int compareTo(Garage g1){
        if(this.size > g1.size){
            return 1;
        }
        else if(this.size == g1.size){
            return 0;
        }
        else{
            return -1;
        }
    }
    public void addCar(){
        if(this.search(null) != -1){
            cars[this.search(null)] = new Car();
        }
    }
    public int search(Car n){
        for(int i=0; i < this.cars.length; i++){
            if (this.cars[i] == n){
                return i;
            }
        }
        return -1;
    }
}