public class GetterSetter {
	public static void main(String[] args) {
		Car c = new Car();
		for(int i=0; i<c.tyres.length; i++) {
			System.out.println(c.tyres[i].getBrand());
		}
	}
}
class Car {
	Tyre[] tyres = {new Tyre("MRF"),
			new Tyre("MRF"),
			new Tyre("MRF"),
			new Tyre("MRF")};
}

class Tyre {
	private String Brand;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String Brand) {
		this.Brand=Brand;
	}
	Tyre(){
		
	}
	Tyre(String Brand){
		setBrand(Brand);
	}
}