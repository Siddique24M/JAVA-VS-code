public class LocalConstructorChain {
    String name;
    int age;

    // Constructor 1: The "Master" constructor
    LocalConstructorChain(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Master Constructor Called");
    }

    // Constructor 2: Chaining to the master
    LocalConstructorChain(String name) {
        this(name, 18); // Calls Constructor 1 with a default age
        System.out.println("Secondary Constructor Called");
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        LocalConstructorChain s = new LocalConstructorChain("Alex"); 
        s.display();
    }
}

// Usage:
// Output: Alex is 18 years old.
    

