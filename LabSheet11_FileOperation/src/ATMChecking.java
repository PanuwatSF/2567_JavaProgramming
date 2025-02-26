import java.io.*;

public class ATMChecking extends ATMData {
	private int money;
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	public boolean  checkBookBank() throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//ATMBookBank.txt"));
		String temp =""
	}
	
}
