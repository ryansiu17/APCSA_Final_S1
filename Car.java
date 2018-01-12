import java.util.Scanner;
public class Car implements Comparable<Car>{
    //Vars
    private String model, color;
    private int year;
    private static int totalCars = 0;
    public Scanner scan = new Scanner(System.in);
    
    
    
    //Constructor and ToString
    public Car(){
        this.setModel();
        this.setYear();
        this.setColor();
        totalCars++;
    }
    public Car(String mod, int yr, String col){
        this.model = mod;
        this.year = yr;
        this.color = col;
        totalCars++;
    }
    public String toString(){
        return "A " + this.color + " " + this.year + " " + this.model;
    }
    
    
    
    //Setters and Getters
    public void setModel(){
        print("Model?");
        this.model = scan.next();
    }
    public void setColor(){
        print("Color?");
        this.color = scan.next();
    }
    public void setYear(){
        print("Year?");
        this.year = scan.nextInt();
    }
    public void setModel(String mod){
        this.model = mod;
    }
    public void setColor(String col){
        this.color = col;
    }
    public void setYear(int yr){
        this.year = yr;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public static int getTotalCars(){
        return totalCars;
    }
    
    
    //Interface methods - compare by age
    public int compareTo(Car c){
        if(this.year > c.year){
            return 1;
        }
        else if(this.year == c.year){
            return 0;
        }
        else{
            return -1;
        }
    }
    
    
    
    //Extra methods 
    public void cleanCar(){
        print(this.toString() + " has been cleaned");
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int text){
        System.out.println(text);
    }
    public static void print(Car c){
        System.out.println(c);
    }
}