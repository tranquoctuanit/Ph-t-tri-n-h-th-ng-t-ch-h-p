package Tuan1;

import java.util.Objects;

public class Student extends Human{
	private Integer idStudent;

	public Student(String fistName, String lastName, String sex, Integer idStudent) {
		super(fistName, lastName, sex);
		this.idStudent = idStudent;
	}


	public Student(int idStudent) {
		this.idStudent = idStudent;
	}

	public Student(String fistName, String lastName, String sex) {
		super(fistName, lastName, sex);
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return idStudent.equals(student.idStudent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idStudent);
	}

	@Override
	public String toString() {
		return "Student{" +
				"fistName='" + fistName + '\'' +
				", lastName='" + lastName + '\'' +
				", sex='" + sex + '\'' +
				", idStudent=" + idStudent +
				'}';
	}
}