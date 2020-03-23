public class Exercise015 {
	public static void main(String[] args) {
		int counter = 0;
		int sum = 0;
		do {
			if (counter % 2 != 0) {
				sum += Math.pow(counter, 2);
			}
			counter++;
		}while(counter < 11);
		System.out.println("The sum of the squares of the odd values between 0 and 10 is: "+ sum);
	}

}
