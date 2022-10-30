package student;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Scanner;

public class listStudent extends Student{
	private ArrayList<Student> danhSach;
	Scanner input = new Scanner(System.in);
	
	
	Student u = new Student();



	public listStudent() {
		this.danhSach = new ArrayList<Student>();
	}



	public listStudent(ArrayList<Student> danhSach) {
		
		this.danhSach = danhSach;
	}
	
	public void addStudent(Student st) {
		
		
		this.danhSach.add(st);	
		
	}
	
	public void showStudent() {
		for (Student student : danhSach) {
			System.out.println(student);
		}
	}
	
	

	
	
	
}
