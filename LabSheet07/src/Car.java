
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car (){
		/*companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;*/
		this("Unknown","Unknown",2000,0.0);

	}
	Car(String companyName,String modelName,int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		this.year = year <1886? 2000:year;
		this.mileage = mileage; 
	}
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	public String getCompanyName(String companyName) {
		return this.companyName = companyName;
	}
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	public String getModelName(String modelName) {
		return this.modelName = modelName;
	}
	public void setYear(int year) {
		if(year > 1886) {
			this.year = year;
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	public int getYear() {
		return this.year;
	}
	public double getMileage () {
		return this.mileage;
	}
	public void showDetails() {
		System.out.println("Company Name: "+ companyName);
		System.out.println("Model Name: "+ modelName);
		System.out.println("Year: "+ year);
	}
	public void showMilage() {
		System.out.println("Mileage: "+ mileage);
	}
}
