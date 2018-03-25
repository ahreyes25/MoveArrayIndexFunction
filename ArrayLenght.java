import java.util.*;

public class ArrayLenght {
	public static void main(String[] args) {
		char[] myArray   = {'a', 'l', 'e', 'x'};
		int currentIndex = 0;
		int numToMove    = 0;
		Scanner input    = new Scanner(System.in);

		System.out.println("Current array is of size: " + myArray.length);
		System.out.println("What is your current index?");
		currentIndex = input.nextInt();

		System.out.println("How far do you want to move the current index? Positive or Negative?");
		numToMove = input.nextInt();

		int newIndex = GetNewIndex(currentIndex, numToMove, myArray);
		System.out.println("With an array of size: " + myArray.length + " and an old index at: "
			+ currentIndex + "\nMoving that index by " + numToMove + " results in a new index at: " + newIndex);
	}

	public static int GetNewIndex(int ci, int nm, char[] a) {
		return (ci + (a.length + (Math.abs(nm) * (int)Math.signum(nm))) % a.length);
	}
}