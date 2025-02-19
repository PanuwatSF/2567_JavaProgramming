
public class Drink {
	private int type;
	private char size;
	Drink(int type,char size){
		this.type = type;
		this.size = size;
	}
	Drink(){
		this(0,' ');
	}
	public String getTypeName() {
		if(this.type == 1) {
			return "Hot";
		}else if(this.type == 2) {
			return "Cold";
		}else {
			return null;
		}
	}
	public int getTypePrice() {
		if(this.type == 1) {
			return 10;
		}else if(this.type == 2) {
			return 20;
		}else {
			return 0;
		}
	}
	public String getSizeName() {
		if(this.size == 'S'||this.size == 's') {
			return "Small";
		}else if(this.size == 'M'||this.size == 'm') {
			return "Medium";
		}else if(this.size == 'L'||this.size == 'l') {
			return "Large";
		}else {
			return null;
		}
	}
}
