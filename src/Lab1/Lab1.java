package Lab1;

public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println("1:" + sumOfNumbers(1));
		System.out.println("1:" + sumOfNumbers(2));
		System.out.println("1:" + sumOfNumbers(3));

		
		
	}
	
	public static int sumOfNumbers (int number) {
		int sum = 0;
		for (int i=1;i<=number;i++ ) {
			sum += i;	
		}
		return sum;
	}
	
	public static int factorial (int number) {
		if (number ==  0 || number == 1) {
			return 1;
		}
		
	}
		
		 

}
