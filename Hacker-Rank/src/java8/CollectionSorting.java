package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSorting {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(5, "mk", "abc", 25000));
		list.add(new Emp(1, "mk", "pcm", 3000));
		list.add(new Emp(31, "MK", "mnp", 15000));
		list.add(new Emp(39, "pk", "mnp", 12000));
		list.add(new Emp(4, "nK", "mnp", 5000));
//		Collections.sort(list);
//		Collections.reverse(list);
//		for (Emp emp : list) {
//			System.out.println(emp);
//		}
//		Collections.sort(list, new SortEmp());
		for (Emp emp : list) {
			System.out.println(emp);
		}
		int i = Collections.binarySearch(list, new Emp(0, "pk", null, 0), new SortEmp());
		System.out.println(i);
		List<Emp> temp = list.stream().filter((emp) -> emp.getId() != 4).collect(Collectors.toList());
		System.out.println(temp);
//		temp=list.stream().map((emp) -> emp.setSal(emp.getSal()*2)
	}
}

class Emp {
	private int id;
	private String name;
	private String email;
	private int sal;

	public Emp() {
	}

	public Emp(int id, String name, String email, int sal) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", sal=" + sal + "]";
	}

//	@Override
//	public int compareTo(Emp o) {
//		return this.id - o.id;
//	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}

class SortEmp implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
