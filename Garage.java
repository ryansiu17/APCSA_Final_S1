public class Garage implements Comparable<Garage>{
    //Instance Variables
    private boolean open = false;
    private int size;
    private Car[] cars;
    
    
    //Constructor and toString
    public Garage(){
        this.setSize();
        this.cars = new Car[sz];
        this.setEntry();
    }
    public String toString(){
        print("This Garage has: ");
        for(int i = 0; i < cars.length; i++){
            print(cars[i]);
        }
    }   
    
    //Setters Getters
    public void setSize(){
        print("Size?");
        this.size = scan.nextInt();
    }
    public void setEntry(){
        print("Open? true/false");
        this.entry = scan.next();
    }   
    public int getSize(){
        return this.size;
    }
    public boolean getEntry(){
        return this.open;
    }
    
    //CompareTo Methods
    public int compareTo(Garage g){
        if(
    }
}