
public class Trainer1 
{
	//state or attributes
		int id;
		String name;
		String skills;
	//Behaviour
		void train()
		{
			System.out.println("The training is going on...!!!");
		}
		void solveproblems()
		{
			System.out.println("Problem is Solved");
		}
		void giveData(int id,String name,String skills)
		{
			this.id=id;
			this.name=name;
			this.skills=skills;
		}

}
