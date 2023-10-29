
public class TrainerApp {

	public static void main(String[] args) 
	{
		//State
		Trainer t1=new Trainer();
		t1.id=1234;
		t1.name="Arun";
		t1.skills="Java";
		System.out.println("ID= " + t1.id + " , Name= " + t1.name + " , Skills= " + t1.skills);
		t1.train();
		t1.solveproblems();
		
		Trainer t2=new Trainer();
		t2.id=1234;
		t2.name="Yash";
		t2.skills="Manual Testing";
		System.out.println("ID= " + t2.id + " , Name= " + t2.name + " , Skills= " + t2.skills);
		t2.train();
		t2.solveproblems();
	}

}
