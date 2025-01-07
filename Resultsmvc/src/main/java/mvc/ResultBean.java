package mvc;

import java.io.Serializable;

public class ResultBean implements Serializable {
	private int Hno;
	private String Name;
	private int C;
	private int Cpp;
	private int Java;
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String i) {
		Name = i;
	}
	public int getC() {
		return C;
	}
	public void setC(int c) {
		C = c;
	}
	public int getCpp() {
		return Cpp;
	}
	public void setCpp(int cpp) {
		Cpp = cpp;
	}
	public int getJava() {
		return Java;
	}
	public void setJava(int java) {
		Java = java;
	}
	
}
