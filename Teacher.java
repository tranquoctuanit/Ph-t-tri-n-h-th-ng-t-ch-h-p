package Tuan1;

import java.util.Objects;

public class Teacher extends Human{
	private Integer idTeacher;

	

	public Teacher(String fistName, String lastName, String sex, Integer idTeacher) {
		super(fistName, lastName, sex);
		this.idTeacher = idTeacher;
	}

	public Teacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}

	public Integer getIdTeacher() {
		return idTeacher;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(idTeacher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(idTeacher, other.idTeacher);
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"fistName='" + fistName + '\'' +
				", lastName='" + lastName + '\'' +
				", sex='" + sex + '\'' +
				", idTeacher=" + idTeacher +
				'}';
	}
}