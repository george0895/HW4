package P15;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
	}

}

class Car{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
}
