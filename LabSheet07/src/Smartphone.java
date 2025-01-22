
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPACITY = 512;
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		if(brand.length()>= 2) {
			this.brand =brand;
		}else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		if(model.length()>= 2) {
			this.model =model;
		}else {
			System.out.println("Error: model must have at least 2 characters!");
		}
	}
	public int getStorageCapacity() {
		return this.storageCapacity;
		}
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity >= 1 && storageCapacity < MAX_STORAGE_CAPACITY) {
			this.storageCapacity = storageCapacity;
		}else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	public void increaseStorage(int additionalStorage) {
		//ไม่เสร็จ
	}
}
