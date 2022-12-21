package id.ac.undiksha.siak.entities;

public class staff extends Person {

	private String 	nip;
	private String 	faculty;
	
	public staff() {
		super();
		this.nip 				= "<invalid nip>";
		this.faculty 			= "<invalid faculty>";
	}
	
	
	/*public staff(String nip, String name, String address, boolean gender, String faculty) {
		super();
		this.nip = nip;
		this.faculty = faculty;
	}*/
	
	
	
	public staff(String name, String address, boolean gender, String nip, String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.faculty = faculty;
	}


	public void printAllInfo() {
		System.out.println("NIP: " 				+ this.nip);
		System.out.println("Name: " 			+ getName());
		System.out.println("Address: " 			+ getAddress());
		System.out.println("Faculty: " 			+ this.faculty);
		
		System.out.println("Gender: " + 
				(getGender() ? "Male" : "Female"));
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
}
