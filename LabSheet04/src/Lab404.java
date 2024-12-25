import java.util.*;
public class Lab404 {
	public static void main(String[] args) {
		 inputStudent();
	}//end main() Method
	public static void inputStudent() {
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.print("Enter Student ID (10 digits): ");
			String studentID = input.nextLine();
			
			System.out.print("Enter subject code (7 digits): ");
			String subjectCode = input.nextLine();
			
			boolean isStudentIDValid = isLength(studentID, 10);
			boolean isSubjectCodeValid = isLength(subjectCode, 7);
			
			if(isStudentIDValid && isSubjectCodeValid ) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				System.out.println();
				System.out.print("Student id: "+ studentID+ " ");
				displayData(isITStudent,isITSubject);
				break;
			}
		}
	}//end inputStudent() Method
	public static boolean isLength(String sID, int len) {
		return sID.length() == len;
	}//end isLength() Method
	public static boolean isITStudent(String sID) {
		return sID.substring(0,2).equals("21")&&sID.substring(3,6).equals("311");//ตรวจสอบแลัวถ้าใช่ return ture กลับไป
	}//end isITStuden() Method
	public static boolean isITSubject(String sJC) {
		return sJC.substring(0,2).equals("21")&&sJC.charAt(4)=='1';//ตรวจสอบถ้าใช่ return ture กลับไป
	}//end isITStuden() Method
	public static void displayData(boolean ITStudent, boolean ITSubject) {
		if(ITStudent) {
			System.out.print("1st year student in IT\n");
		}
		else {
			System.out.print("is not 1st year student in IT \n");
		}
		if(ITSubject) {
		System.out.println("Enroll in courses for Year 1");
		}
		else {
		System.out.println("Not enroll in courses for Year 1");
		}
		
	}
}