package Class_Task.JsonObjectParsing;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private EmployeeDepartment employeeDepartment;
	private String office;
	private List<String> skills;
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
	public EmployeeDepartment getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(EmployeeDepartment employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", employeeDepartment=" + employeeDepartment + ", office="
				+ office + ", skills=" + skills + "]";
	}
	
	
}
