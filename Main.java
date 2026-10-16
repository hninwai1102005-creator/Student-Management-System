package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Student> students=new ArrayList<>();
	static Scanner scan=new Scanner(System.in);
	public static void viewStudents() {
		for(Student s: students) {
			System.out.println("ID: "+s.getId());
			System.out.println("Name: "+s.getName());
			System.out.println("Age: "+s.getAge());
			System.out.println("------------------");
		}
	}
	public static void addStudent() {
		System.out.println("Enter Student ID: ");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Student Name: ");
		String name=scan.nextLine();
		System.out.println("Enter Student Age: ");
		int age=scan.nextInt();
		students.add(new Student(id,name,age));
		System.out.println("Student added Successfully");
	}
	public static void searchStudent() {
		System.out.println("Enter Student ID:");
		int searchId=scan.nextInt();
		boolean found=false;
		for(Student s:students) {
			if(s.getId()==searchId) {
				System.out.println("ID: "+s.getId());
				System.out.println("Name: "+s.getName());
				System.out.println("Age: "+s.getAge());
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student Not Found!");
		}
	}
	public static void updateStudent() {
		System.out.println("Enter Student ID to update:");
		int updateId=scan.nextInt();
		boolean found=false;
		for(Student s:students) {
			if(s.getId()==updateId) {
				scan.nextLine();
				System.out.println("Enter New Name");
				String Newname=scan.nextLine();
				System.out.println("Enter New Age: ");
				int newAge=scan.nextInt();
				s.setName(Newname);
				s.setAge(newAge);
				System.out.println("Student Updated Successfully!");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student Not Found!");
		}
	}
	public static void deleteStudent() {
		System.out.println("Enter Student ID to delete:");
		int deleteId=scan.nextInt();
		boolean found=false;
		for(Student s:students) {
			if(s.getId()==deleteId) {
				students.remove(s);
				System.out.println("Student Delete Successfully!");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student not Found");
		}
	}
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("\n===== STUDENT MANAGEMENT SYSTEM");
			System.out.println("1. Add Student");
			System.out.println("2. View All Student");
			System.out.println("3. Search Student");
			System.out.println("4.Update Student");
			System.out.println("5. Delete Student");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			choice=scan.nextInt();
			switch(choice) {
			case 1:addStudent();
			break;
			case 2:viewStudents();
			break;
			case 3:searchStudent();
			break;
			case 4:updateStudent();
			break;
			case 5:deleteStudent();
			break;
			case 0:System.out.println("Thank You!");
			break;
			default:System.out.println("Invalid Choiice!");
			}
		}while(choice != 0);
	}
}





