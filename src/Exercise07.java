
public class Exercise07 {

	public static void main(String[] args) {
		System.out.println("N\t10*N\t100*N\t1000*N");
		int value = 0;
		for (int i = 0; i < 5; i++) {
			value = i+1;
			System.out.println(value + "\t"+ value*10 +"\t" + value*100 + "\t" +value*1000);
		}

	}

}
