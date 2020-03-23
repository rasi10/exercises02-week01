import java.util.Arrays;
import java.util.Random;

public class Exercise018 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arrayofIntegers = new int[10];
		int counter = 0;
		int greatest = -100;
		
		while (counter < arrayofIntegers.length) {
			arrayofIntegers[counter] = random.nextInt(100);
			counter++;
		}
		System.out.println(Arrays.toString(arrayofIntegers));				
		counter = 0;
		while (counter < arrayofIntegers.length) {
			if (arrayofIntegers[counter] > greatest) {
				greatest = arrayofIntegers[counter];
			}
			counter++;
		}
		System.out.println("The greatest value stored in the array is: "+ greatest);
	}
}
