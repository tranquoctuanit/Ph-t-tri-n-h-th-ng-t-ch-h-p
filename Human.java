package Tuan1;

public abstract class Human {
	protected String fistName;
	protected String lastName;
	protected String sex;

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Human(String fistName, String lastName, String sex) {
		this.fistName = fistName;
		this.lastName = lastName;
		this.sex = sex;
	}

	public Human() {

	}

}
