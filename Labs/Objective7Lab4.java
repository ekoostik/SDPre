public class Objective7Lab4 {
	public static void main(String[] args){
		int count = 0;
		int sum = 0;

		while (count <= 20){
			count = count + 1;
			sum = sum + count;

			if (sum == 210) {
				System.out.println(sum);
			}
		}
	}
}