package lab_exercise_6_11;

/**
===========================================================================================
 CLASS NAME	: TestPersonTree
 DESCRIPTION: A class that tests the person, student, employee, 
 				faculty, and staff classes
 AUTHOR		: Gillian E. Florin
 COPYRIGHT	: Created 11/28/2022
 REVISION HISTORY:
 Date:				By:				Description:
===========================================================================================
 */

public class TestPersonTree {

	public static void main(String[] args) {
		Person p1 = new Person("Gillian", "Talamban", "09455992619", 
				"gil@email.com");
		System.out.println(p1.toString());
		System.out.println("Address: " + p1.getAddress() + "\tPhoneNum: " + p1.getPhoneNum()
				+ "\tEmail: " + p1.getEmail() +	"\n" );
		
		Student st1 = new Student("Student_Sample", "Student_Address", "Student_Number", 
				"student@email.com", "Class_Status");
		System.out.println(st1.toString());
		System.out.println("Address: " + st1.getAddress() + "\tPhoneNum: " + st1.getPhoneNum()
		+ "\tEmail: " + st1.getEmail() );
		System.out.println("Class Status: " + st1.getClassStatus()  +"\n");
		
		Employee e1 = new Employee("Employee_Sample", "Employee_Address", "Employee_Number", 
				"employee@email.com", "Employee_Office", 30000.00, new MyDate(3,18,2022));
		System.out.println(e1.toString());
		System.out.println("Address: " + e1.getAddress() + "\tPhoneNum: " + e1.getPhoneNum() + 
				"\tEmail: " + e1.getEmail() );
		System.out.println("Office: " + e1.getOffice() +"\t\tSalary: " +e1.getSalary() + 
				"\t\t\tDate Hired: " + e1.getDateHired().toString() +"\n");
		
		Faculty f1 = new Faculty("Faculty_Sample", "Faculty_Address", "Faculty_Number", 
				"faculty@email.com", "Faculty_Office", 20000.00, new MyDate(3,18,2022),
				"7:30 - 10:30", "Faculty_Rank");
		System.out.println(f1.toString());
		System.out.println("Address: " + f1.getAddress() + "\tPhoneNum: " + f1.getPhoneNum() + 
				"\tEmail: " + f1.getEmail() );
		System.out.println("Office: " + f1.getOffice() +"\t\tSalary: " +f1.getSalary() + 
				"\t\t\tDate Hired: " + f1.getDateHired().toString());
		System.out.println("Hours: " + f1.getOfficeHours() +"\t\tRank: " +f1.getRank() +"\n");
		
		
		Staff s1 = new Staff("Staff_Sample", "Staff_Address", "Staff_Number", 
				"staff@email.com", "Staff_Office", 1000.00, new MyDate(3,18,2022),
				"Staff_title");
		System.out.println(s1.toString());
		System.out.println("Address: " + s1.getAddress() + "\t\tPhoneNum: " + s1.getPhoneNum() + 
				"\tEmail: " + s1.getEmail());
		System.out.println("Office: " + s1.getOffice() +"\t\tSalary: " +s1.getSalary() + 
				"\t\t\tDate Hired: " + s1.getDateHired().toString());
		System.out.println("Hours: " + s1.getTitle());
	}
}
