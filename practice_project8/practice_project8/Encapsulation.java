package practice_project8;

public class Encapsulation {

	private String brand;
	private String model;

	//Constructors
	public Encapsulation(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println(brand);
    }

	//Encapsulation
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation vehicle = new Encapsulation("Toyota", "Camry");
		
	}

}
