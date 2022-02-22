package Main;

public class Course {
	Teacher courseTeacher;
    String name;
	String code;
	int note;
	int snote;
	String prefix;
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.snote = 0;
	}
	public void addTeacher(Teacher t) {
		if(this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println("��lem Ba�ar�l�");
		}else {
			System.out.println(t.name + "Akademisyeni bu dersi veremez.");
		}
	
	}
	public void printTeacher() {
		if(courseTeacher != null) {
			System.out.println(this.name+ "Dersin Akademisyeni: " + courseTeacher.name);
		}else {
			System.out.println(this.name + "Dersine Akademisyen atanmam��t�r.");
		}
	}
}
