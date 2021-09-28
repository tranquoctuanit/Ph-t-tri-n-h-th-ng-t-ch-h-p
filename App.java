package Tuan1;

import java.util.List;

public class App {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		System.out.println("---------------------Student-----------------------------");
		System.out.println(studentService.add(new Student("Tran","Tuan","nam",1))?"add students successful !":"add students failed");
		System.out.println(studentService.add(new Student("Nguyen","Lan","nu",1))?"add students successful !":"add students failed");
		System.out.println(studentService.add(new Student("Le","Tuyen","nu",3))?"add students successful !":"add students failed");
		System.out.println(studentService.add(new Student("Quoc","Tuan","nam",4))?"add students successful !":"add students failed");
		System.out.println(studentService.add(new Student("Tran","Hades","nam",5))?"add students successful !":"add students failed");
		System.out.println("---------------------------------------------------------");

		for (Student student:studentService.list()) {
			System.out.println(student);
		}
		System.out.println("\n---------------------------------------------------------");
		System.out.println(studentService.delete(1)?"delete student successful !":"delete students failed !");;
		System.out.println("After the delete !");
		System.out.println("---------------------------------------------------------");

		for (Student student:studentService.list()) {
			System.out.println(student);
		}

		System.out.println("\n---------------------------------------------------------");
		System.out.println(studentService.update(new Student("Nguyen","Thanh","Nam"),3)?"update student  successful !":" update students failedg");
		System.out.println("After the update!");
		System.out.println("-------------");

		for (Student student:studentService.list()) {
			System.out.println(student);
		}
		
		System.out.println("\n---------------------------------------------------------");
		if(studentService.get(5)==null) {
			System.out.println("not find !");
		}
		else{
			System.out.println("find !");
			System.out.println(studentService.get(5));
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------\n");
		
		
		TeacherService techService = new TeacherService();
		System.out.println("---------------------Teacher-----------------------------");
		System.out.println(techService.add(new Teacher("Tran","Tuan","nu",6))?"add teacher successful !":"add teacher failed");
		System.out.println(techService.add(new Teacher("Le","Tuyen","nu",6))?"add students successful !":"add students failed");
		System.out.println(techService.add(new Teacher("Nguyen","Lan","nu",7))?"add teacher successful !":"add teacher failed");
		System.out.println(techService.add(new Teacher("Tran","Hades","nam",8))?"add students successful !":"add students failed");
		System.out.println("---------------------------------------------------------");

		for (Teacher teacher:techService.list()) {
			System.out.println(teacher);
		}
		System.out.println("\n---------------------------------------------------------");
		System.out.println(techService.delete(6)?"delete teacher successful !":"delete teacher failed !");;
		System.out.println("After the delete !");
		System.out.println("---------------------------------------------------------");

		for (Teacher teacher:techService.list()) {
			System.out.println(teacher);
		}

		System.out.println("\n---------------------------------------------------------");
		System.out.println(techService.update(new Teacher("Nguyen","Thanh","Nam",7),7)?"update student  successful !":" update students failedg");
		System.out.println("After the update!");
		System.out.println("-------------");

		for (Teacher teacher:techService.list()) {
			System.out.println(teacher);
		}
		
		System.out.println("\n---------------------------------------------------------");
		if(techService.get(8)==null) {
			System.out.println("not find !");
		}
		else{
			System.out.println("find !");
			System.out.println(techService.get(8));
		}
		System.out.println("---------------------------------------------------------");
		
	}

}
