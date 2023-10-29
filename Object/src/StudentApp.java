
public class StudentApp {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("--> Before Initializting ");
		System.out.println("ID = " + s1.id  + " ,Name = " + s1.name + " ,cgpa = " + s1.cgpa );
		
		s1.id=1245;
		s1.name= "Puneet";
		s1.cgpa=7.2;
		System.out.println("---> After Initnializting <---");
		System.out.println("ID = " + s1.id + " Name = " + s1.name + " cgpa = " + s1.cgpa );
		System.out.println("--->Behaviour<---");
		s1.study();
		s1.markAttendance();
	
		

	}

}
