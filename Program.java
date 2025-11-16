import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private double marks;

	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String toString() {
		return "ID: " + id + " | Name: " + name + " | Marks: " + marks;
	}
	
	
}

public class Program {
	static ArrayList<Student> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	
	public static void addStudent() {
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Marks: ");
		double marks = sc.nextDouble();

		list.add(new Student(id, name, marks));
		System.out.println("Student added successfully!");
	}

	
	public static void viewStudents() {
		if (list.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		System.out.println("\n--- Student Records ---");
		for (Student s : list) {
			System.out.println(s);
		}
	}

	
	public static void updateStudent() {
		System.out.print("Enter student ID to update: ");
		int id = sc.nextInt();
		sc.nextLine();

		for (Student s : list) {
			if (s.getId() == id) {
				System.out.print("Enter new name: ");
				String name = sc.nextLine();

				System.out.print("Enter new marks: ");
				double marks = sc.nextDouble();

				s.setName(name);
				s.setMarks(marks);

				System.out.println("Student updated successfully!");
				return;
			}
		}
		System.out.println("Student not found!");
	}

	
	public static void deleteStudent() {
		System.out.print("Enter student ID to delete: ");
		int id = sc.nextInt();

		for (Student s : list) {
			if (s.getId() == id) {
				list.remove(s);
				System.out.println("Student deleted successfully!");
				return;
			}
		}
		System.out.println("Student not found!");
	}
	
	public static void main(String[] args) {
		
		
		while (true) {
			System.out.println("\n===== Student Record Management =====");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudent();
				break;
			case 2:
				viewStudents();
				break;
			case 3:
				updateStudent();
				break;
			case 4:
				deleteStudent();
				break;
			case 0:
				System.out.println("Exiting... Thank you!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice! Try again.");
			}
			
		}
		
	}
	
}





