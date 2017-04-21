package methodsAndArraysJavaProject;

public class methodsAndArraysJavaClass {

	public static void main(String[] args) {
		System.out.println("Hello Class.");
		
		// Enter number of numbers sum
		int sumUpTo = 4;
		int[] arrayOfNumbers = new int[(sumUpTo + 1)];
		int sumOfArray = 0;
		
		// custom method to fill the array with these numbers.
		cmFillArray(arrayOfNumbers);
		
		// custom method to sum the array.
		sumOfArray = cmSumArray(arrayOfNumbers);
		
		// custom method to print the sum
		cmPrintSumOfArray(sumOfArray);
		
		// custom method to check the sum with a for loop.
		cmCheckSumWithForLoop(sumOfArray, sumUpTo);

	}

	private static void cmFillArray(int[] arrayOfNumbers) {
		for(int i = 0; i < arrayOfNumbers.length; i++)
		{
			arrayOfNumbers[i] = i;
		}
		
	}

}
