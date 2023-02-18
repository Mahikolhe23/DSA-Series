package stack_que;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bcode;
	private String bname;
	private double bprice;

	public Book(int bcode, String bname, double bprice) {
		this.bcode = bcode;
		this.bname = bname;
		this.bprice = bprice;
	}

	@Override
	public String toString() {
		return "Book [bcode=" + bcode + ", bname=" + bname + ", bprice=" + bprice + "]";
	}

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

}
