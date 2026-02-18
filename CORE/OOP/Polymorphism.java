class Vehicle{
    public void capacity(){
        System.out.println("Capacity is ");
    }
}
class Bike extends Vehicle{
    @Override
    public void capacity(){
        System.out.println("Capacity is " + 2);
    }
}
class Car extends Vehicle{
    @Override
    public void capacity(){
        System.out.println("Capacity is " + 5);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.capacity();
    }
    
}
