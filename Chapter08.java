
public class Chapter08 {
	public static void main(String[] args) {
		int number;
		int i = 1;
		int[] array = {1, 2, 3, 4};
		while (i < 5) {
			number = i * i;
			System.out.println("while: " + number);
			i++;
		}
		
		for (int count = 0; count < array.length; count++) {
			System.out.println("for: " + array[count]);
		}
		
		for (int array1 : array) {
			if (array1 % 2 == 0) {
				continue;
			} 
			System.out.println(array1);
		}
	}

}
