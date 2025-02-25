package java_Lab10;

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
		return this.name;
	}
	public String getGender(){
		if(this.gender == 'F') {
			return "Female";
		}else if(this.gender == 'M') {
			return "Male";
		}else {return " ";}
	}
	
}