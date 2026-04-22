public class ConstructorOverloading {
    int id;
    String name;
    public ConstructorOverloading(int id){
        this.id=id;
    }
    public ConstructorOverloading(int id, String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        ConstructorOverloading c0 = new ConstructorOverloading(101);
        System.out.println(c0.id);
        ConstructorOverloading c1 = new ConstructorOverloading(102,"aman");
        System.out.println(c1.id);
        System.out.println(c1.name);
    }
}
