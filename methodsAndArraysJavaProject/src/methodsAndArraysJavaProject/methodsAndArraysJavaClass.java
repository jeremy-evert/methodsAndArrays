package methodsAndArraysJavaProject;

public class methodsAndArraysJavaClass {

	public static void main(String[] args) {
		System.out.println("Hello Class.");
		
		// Enter number of numbers sum
		int sumUpTo = 10;
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

	private static void cmCheckSumWithForLoop(int sumOfArray, int sumUpTo) {
		int arraySumForLoopCheck = 0;
		for(int i = 0; i<= sumUpTo; i++)
		{
			arraySumForLoopCheck = arraySumForLoopCheck + i;
		}
		
		if (arraySumForLoopCheck == sumOfArray)
		{
			System.out.println("The for loop verifies this to be true.");
		} else {
			System.out.println("The for loop questions your result.");
		}
		
	}

	private static void cmPrintSumOfArray(int sumOfArray) {
		System.out.println("The sum of the array is: " + sumOfArray);
		
	}

	private static int cmSumArray(int[] arrayOfNumbers) {
		int arraySum = 0;
		for(int i = 0; i < arrayOfNumbers.length; i++)
		{
			arraySum = arraySum + arrayOfNumbers[i];
		}
		
		return arraySum;
	}

	private static void cmFillArray(int[] arrayOfNumbers) {
		for(int i = 0; i < arrayOfNumbers.length; i++)
		{
			arrayOfNumbers[i] = i;
		}
		
	}

}
