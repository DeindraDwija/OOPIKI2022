package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setName("Deindra");
		std1.setAddress("Tabanan");
		std1.setNim("2115101021");
		std1.setStudyProgram("Computer Science");
		
		std1.printAllInfo();
		
		Student std2 = new Student(
				"1234567",
				"Ari",
				"Tabanan",
				true,
				"Computer Science",
				"Informatics",
				"FTK"
		);
		
		std2.printAllInfo();
		
	}

}
