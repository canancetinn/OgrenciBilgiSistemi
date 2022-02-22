package Main;

public class Teacher {
	String name;
	String mpno;
	String branch;
	Teacher(String name, String mpno, String branch){
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
		
	}
	void print() {
		System.out.println("Adý: " + this.name);
		System.out.println("Telefon numarasý: " + this.mpno);
		System.out.println("Bölüm: " + this.branch);
		
		
	}


}
