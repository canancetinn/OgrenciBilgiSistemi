package Main;

public class Student {

	String name, stuNo;
	int classes;
	Course matematik;
	int matematiksozlu;
	Course fizik;
	int fiziksozlu;
	Course kimya;
	int kimyasozlu;
	double fizikav;
	double kimyaav;
	double matav;
	double avarage;
	boolean isPass;
	public Student(String name, String stuNo, int classes, Course matematik,Course fizik, Course kimya) {
		this.name =name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.matematik = matematik;
	    this.fizik = fizik;
		this.kimya = kimya;
		calcAvarage();
		this.isPass = false;
	}
	public void addBulkExamNote(int matematik,int matematiksozlu, int fizik,int fiziksozlu, int kimya, int kimyasozlu) {
		if(matematik >=0 && matematik <=100) {
			this.matematik.note = matematik;
		}
		if(matematiksozlu >=0 && matematiksozlu <=100) {
			this.matematiksozlu = matematiksozlu;
		}
		if(fizik >= 0 && fizik <=100) {
			this.fizik.note = fizik;
		}
		if(fiziksozlu >=0 && fiziksozlu <=100) {
			this.fiziksozlu = fiziksozlu;
		}
		if(kimya >= 0 && kimya <=100) {
			this.kimya.note = kimya;
		}
		if(kimyasozlu >=0 && kimyasozlu <=100) {
			this.kimyasozlu = kimyasozlu;
		}
	}
	public void isPass() {
		if(this.matematik.note == 0 || this.fizik.note== 0 || this.kimya.note == 0) {
			System.out.println("Notlar henüz girilmemiþ");
		}else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("ortalama: " + this.avarage);
			if(this.isPass) {
				System.out.println("Sýnýfý Geçti");
			}else {
				System.out.println("Sýnýfta Kaldý");
			}
		}
	}
	
	public void calcAvarage() {
		this.matav = (this.matematik.note * 0.80) + (this.matematiksozlu * 0.20);
		this.kimyaav = (this.kimya.note * 0.80) + (this.kimyasozlu * 0.20);
		this.fizikav =(this.fizik.note * 0.80) + (this.fiziksozlu * 0.20);
		this.avarage = (this.matav + this.kimyaav + this.fizikav)/3;
	}
	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}
	public void printNote() {
		System.out.println("========================================");
		System.out.println("Öðrenci: "+ this.name);
		System.out.println("Matematik Notu:"+ this.matematik);
		System.out.println("Matematik sozlu:" + this.matematiksozlu);
		System.out.println("Matematik ortalama: "+ this.matav);
		System.out.println("Fizik Notu: "+ this.fizik);
		System.out.println("Fizik sozlu: "+ this.fiziksozlu);
		System.out.println("Fizik Ortalama: "+ this.fizikav);
		System.out.println("Kimya Notu:"+ this.kimya);
		System.out.println("Kimya sozlu:" + this.kimyasozlu);
		System.out.println("Kimya Ortalama: "+ this.kimyaav);
		
		
	}

}
