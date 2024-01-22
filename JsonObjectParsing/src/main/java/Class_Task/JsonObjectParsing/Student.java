package Class_Task.JsonObjectParsing;


public class Student {

	private int id;
	private String name;
	private Department department;
	private Course course;
	private String domicile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", course=" + course
				+ ", domicile=" + domicile + "]";
	}

	
	
	
}
