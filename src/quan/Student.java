package quan;

public class Student {
	
	
	private String name;
	private String country;
	
	
	public Student(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Country: " + this.country + ", Name: " + this.name;
	}
	
	@Override
	public boolean equals(Object object) {
		Student student = (Student)object;
		if(this.name.equals(student.name) && this.country.equals(student.country))
			return true;
		return false;
	}

}
