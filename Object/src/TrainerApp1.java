
public class TrainerApp1 {

	public static void main(String[] args) 
	{
		Trainer1 t1=new Trainer1();
		t1.giveData(1234 , "Arun" , "Java");
		System.out.println("ID= " + t1.id + " , Name= " + t1.name + " , Skills= " + t1.skills);
		t1.train();
		t1.solveproblems();
		
		Trainer1 t2=new Trainer1();
		t2.giveData(4567, "Yash" , "ManualTesting");
		System.out.println("ID= " + t2.id + " , Name= " + t2.name + " , Skills= " + t2.skills);
		t2.train();
		t2.solveproblems();


	}

}
