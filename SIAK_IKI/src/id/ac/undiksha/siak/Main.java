package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.staff;
import id.ac.undiksha.siak.entities.Person;

public class Main {

	public static void main(String[] args) {
		
		/*Student std1 = new Student(
				"2115101021",
				"Deindra",
				"Tabanan",
				true,
				"Computer Science",
				"Informatics",
				"FTK"
		);
		std1.printAllInfo();
		
		Lecturer std2= new Lecturer(
				"114553889009",
				"Dewi",
				"Singaraja",
				false,
				"Computer Science",
				"Informatics",
				"FTK"
		);
		std2.printAllInfo();
		
		staff std3= new staff(
				"1234567890",
				"Ayu",
				"Singaraja",
				false,
				"FTK"
		);
		std3.printAllInfo();*/
		
		//Person prs1 = new Person();
		//prs1.setName("Deindra");
		//System.out.println(prs1.getName());
		
		/*Student std1 = new Student();
		std1.setName("Adi");
		System.out.println(std1.getName());
		
		Student std1 = new Student();
		
		std1.setNim("12345");
		std1.printAllInfo();
		*/
		
		//Person siX = new Student();
		
		//siX.getName();
		
		//Person siY = new Person("Ayu", "Karangasem", false);
		//Student siZ = new Student("12345", "ILKOM", "TI", "FTK");
		Student siA = new Student("Caca", "Denpasar", false, "12345", "ILKOM", "TI", "FTK");
		
		siA.printAllInfo();
		
		Lecturer siB = new Lecturer("Ayu", "Bangli", false, "54321", "PTI", "TI", "FTK");
		
		siB.printAllInfo();
		
		staff siC = new staff("Budi", "Tabanan", true, "777888999", "FTK");
		
		siC.printAllInfo();
		
	}

}
