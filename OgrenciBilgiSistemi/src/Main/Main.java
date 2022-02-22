package Main;


public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Ak ", "05555555550 ", "FZK " );
		Teacher t2 = new Teacher("Ayþe Yýlmaz", "05055555551", "KMY");
		Teacher t3 = new Teacher("Mesut Gül", "065545455", "MAT");
		Course matematik = new Course("matematik", "Mat101", "MAT");
		Course fizik = new Course("fizik", "Fiz102", "FZK");
		Course kimya = new Course("kimya", "Kim103", "KMY");
		Course Tarih = new Course("Tarih", "trh104", "TRH");
		Course edebiyat = new Course("Edebiyat", "EDB108", "EDB");
		
		matematik.addTeacher(t3);
		fizik.addTeacher(t1);
		kimya.addTeacher(t2);
		
		Student s1 = new Student("Derya Ersoy", "100", 5, matematik,  fizik, kimya );
	    s1.addBulkExamNote(80, 40, 90, 60, 70, 80);
		s1.isPass();
		Student s2 = new Student("Sevgi Erilmez", "101", 5, matematik ,fizik,kimya);
		s2.addBulkExamNote(90, 70, 50, 60, 30, 40);
		s2.isPass();
		Student s3 = new Student("Yasemin Aslan", "200", 5, matematik,fizik,kimya);
		s3.addBulkExamNote(50, 40, 30, 40, 100, 90);
		s3.isPass();

	}

}


