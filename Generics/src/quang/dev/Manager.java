package quang.dev;

import java.util.ArrayList;
import java.util.List;
import quang.dev.model.MyGenerics;
import quang.dev.model.Student;

public class Manager implements MyGenerics<Student> {
	List<Student> studentList = new ArrayList<>();

	@Override
	public void add(Student d) {
		// TODO Auto-generated method stub
		studentList.add(d);
	}

	@Override
	public void edit(Student e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(e.getId())) {
				studentList.set(i, e);
				break;
			}
		}
	}

	@Override
	public void remove(String r) {
		// TODO Auto-generated method stub
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(r)) {
				studentList.remove(i);
				System.out.println("Đã xóa sinh viên có mã " + r);
			}else {
				System.out.println("Không tìm thấy sinh viên có mã " + r);
				
			}
		}
	}

	@Override
	public void all(Student p) {
		// TODO Auto-generated method stub
		for (Student student : studentList) {
            System.out.println(student);
        }
	}

}
