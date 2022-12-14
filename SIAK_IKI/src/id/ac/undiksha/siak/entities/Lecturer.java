package id.ac.undiksha.siak.entities;

public class Lecturer {
	
	private String 	nip;
	private String 	name;
	private String 	address;
	private boolean gender;
	private String 	studyProgram;
	private String 	department;
	private String 	faculty;

	public Lecturer() {
		this.name 				= "<ivalid name>";
		this.address 			= "<ivalid address>";
		this.nip 				= "<ivalid nip>";
		this.studyProgram 		= "<ivalid studyProgram>";
		this.department 		= "<ivalid department>";
		this.faculty 			= "<ivalid faculty>";
	}
	
	public Lecturer(String nip, String name, String address, boolean gender, String studyProgram, String department,
			String faculty) {
		super();
		this.nip = nip;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
	}

	public void printAllInfo() {
		System.out.println("NIP: " 				+ this.nip);
		System.out.println("Name: " 			+ this.name);
		System.out.println("Address: " 			+ this.address);
		System.out.println("Study Program: " 	+ this.studyProgram);
		System.out.println("Department: " 		+ this.department);
		System.out.println("Faculty: " 			+ this.faculty);
		
		System.out.println("Gender: " + 
				(gender ? "Male" : "Female"));
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getName() {
		return this.name;
	}
}
