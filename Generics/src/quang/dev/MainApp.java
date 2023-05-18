package quang.dev;

import java.util.Scanner;

import quang.dev.model.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		select(manager);
	}

	private static void select(Manager manager) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("========Menu=============");
			System.out.println("   1.Thêm sinh viên");
			System.out.println("   2.Hiển thị danh sách");
			System.out.println("   3.Sửa ");
			System.out.println("   4.Xóa");
			System.out.println("   0.Thoát chương trình");
			System.out.println("=========================");
			System.out.println("Nhập lựa chọn :");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				manager.add(addStuden(sc));
				break;
			case 2:
				print(manager);
				break;
			case 3:
				System.out.println("Nhập ID muốn sửa");
				String editId = sc.next();
				
				break;
			case 4:
				System.out.println("Nhập id muốn xóa");
				String r = sc.next();
				manager.remove(r);
				break;
			case 0:
				System.out.println("Đã thoát");
				System.exit(0);
				break;

			default:
				System.out.println("Vui lòng nhập lại");
				break;
			}

		} while (choice != 5);

	}

	
	private static void print(Manager manager) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Mã", "Tên", "Tuổi", "Địa chỉ", "Điểm");
		for (int i = 0; i < manager.studentList.size(); i++) {
			  Student student = manager.studentList.get(i);
			System.out.printf("%-10s%-10s%-10d%-10s%-10.1f\n", student.getId(),student.getName(),student.getAge(),student.getAddrees(),student.getPoint());
		}
	}

	private static Student addStuden(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("----Nhập thông tin----");
		System.out.println("Nhập ID");
		String id = sc.next();
		System.out.println("Nhập tên SV");
		String name = sc.next();
		System.out.println("Nhập tuổi");
		int age = sc.nextInt();
		System.out.println("Nhập địa chỉ");
		String address = sc.next();
		System.out.println("Nhập điểm TB");
		double point = sc.nextDouble();
		return new Student(id, name, age, address, point);
	}
}
