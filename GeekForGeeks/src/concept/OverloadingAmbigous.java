package concept;

public class OverloadingAmbigous extends Java8Interface {

	public static void main(String[] args) {
		OverloadingAmbigous obj = new OverloadingAmbigous();
		obj.print(10);
	}

	Test obj = () -> {
		System.out.println("hello");
	};

	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public void print(long i) {
		System.out.println("long");
	}

	@Override
	public void show() {
		super.show();
	}
}
