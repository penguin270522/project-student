package student;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap lua chon");
		System.out.println("**************************");
		System.out.println("* 1.Add student          *");
		System.out.println("* 2.edit student by id   *");
		System.out.println("* 3.detele student by id *");
		System.out.println("* 4.sort student by gpa  *");
		System.out.println("* 5.show student         *");
		System.out.println("* 0.Exit                 *");
		System.out.println("**************************");
		
		int num;
		listStudent ls = new listStudent();
		Student student = new Student();
		do {
			System.out.println("nhap lua chon cua ban: ");
			num = input.nextInt();
		switch (num) {
		
		case 1:
			System.out.println("id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.println("name: ");
			String name = input.nextLine();
			System.out.println("age: ");
			byte age = input.nextByte();
			System.out.println("address: ");
			input.nextLine();
			String address = input.nextLine();
			System.out.println("gpa: ");
			float gpa = input.nextFloat();
			Student add = new Student(id, name, age, address, gpa);
			ls.addStudent(add);
			
			break;
		case 2:
			
			break;
		case 3:
	
			break;
		case 4:
	
			break;
		case 5:
			ls.showStudent();
			break;
		case 0:
	
			break;
		default:
			break;
		}
		
		}while(num >= 0  && num <= 6);
		System.out.println("exit");
	}
}
