
public class Barista {
	private String name;
	private char gender;
	Barista(String name,char gender){
		this.name = name;
		this.gender = gender;
	}
	Barista(){
		this("",' ');
	}
	public String getName() {
		return this.name = name;
	}
	public String getGender(){
		if(this.gender == 'F' || this.gender == 'f') {
			return "Female";
		}else if(this.gender == 'M' || this.gender == 'm') {
			return "Male";
		}else {
			return " ";
		}
	}
}
