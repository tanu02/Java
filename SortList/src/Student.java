
public class Student implements Comparable<Student> {
	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}

}
