package company;

//CDAC PUNE
import java.util.ArrayList;
import java.util.List;

public class AddTwoList {

	public static void main(String[] args) {
		// list of emp having emp id and emp name
		List<EmpName> empNames = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			empNames.add(new EmpName(i, "Mahi" + i));
		}
		System.out.println(empNames);
		// list of emp having emp id and emp salary
		List<EmpSalary> empSalaries = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			empSalaries.add(new EmpSalary(i, 5000 * i));
		}
		System.out.println(empSalaries);
		// list of emp having emp id , emp name , emp salary ....new class
		List<FinalEmp> finalEmp = new ArrayList<>();
		for (int i = 0; i < empNames.size(); i++) {
			if (empNames.get(i).id == empSalaries.get(i).id) {
				finalEmp.add(new FinalEmp(empNames.get(i).id, empNames.get(i).name, empSalaries.get(i).salary));
			}
		}
		System.out.println(finalEmp);
	}
}

class FinalEmp {
	public int id;
	public String name;
	public double salary;

	public FinalEmp() {
	}

	public FinalEmp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FinalEmp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

class EmpSalary {
	public int id;
	public double salary;

	public EmpSalary() {
	}

	public EmpSalary(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpSalary [id=" + id + ", salary=" + salary + "]";
	}
}

class EmpName {
	public int id;
	public String name;

	public EmpName() {
	}

	public EmpName(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmpName [id=" + id + ", name=" + name + "]";
	}
}
