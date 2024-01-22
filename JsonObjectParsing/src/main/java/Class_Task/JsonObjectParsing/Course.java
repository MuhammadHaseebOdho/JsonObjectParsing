package Class_Task.JsonObjectParsing;

import java.util.List;

public class Course{

	
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	
	
	
	
}
