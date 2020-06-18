package statements;

public class LoopStatements {

	public static void main(String[] args) {
		
		LoopStatements loopObj = new LoopStatements();
//		loopObj.printAllBetween(5,15);
//		System.out.println();
//		loopObj.printAllBetweenUsingDoWhile(100,110);
//		System.out.println();
//		loopObj.printAllBetweenUsingForLoop(200,210);
		
		loopObj.printAllBetweenUsingNestedForLoop(5);
	}
	
	public void printAllBetween(int valueUntilWhichItHasToPrint, int threshold) {
		
		while(valueUntilWhichItHasToPrint <= threshold) {
			System.out.println("Current Value is " + valueUntilWhichItHasToPrint);
			valueUntilWhichItHasToPrint++;
		}
	}
	
	public void printAllBetweenUsingDoWhile(int valueUntilWhichItHasToPrint, int threshold) {
		
		do {
			System.out.println("Current Value is " + valueUntilWhichItHasToPrint);
			valueUntilWhichItHasToPrint++;
		} while(valueUntilWhichItHasToPrint <= threshold);
	}
	
	public void printAllBetweenUsingForLoop(int valueUntilWhichItHasToPrint, int threshold) {
		
		for(int i = valueUntilWhichItHasToPrint; i <= threshold; i++) {
			System.out.println("Current Value is " + i);
		}
	}
	
	//pattern
	public void printAllBetweenUsingNestedForLoop(int threshold) {
		
		int[][] twoDimensionalIntegerArray = new int[threshold][threshold];
		
		for(int i = 1; i <= threshold; i++) {
//			System.out.println("Current ith value is " + i);
			for(int j = 1; j <= i; j++) {
//				System.out.print("Current jth value is " + j + " : ");
//				twoDimensionalIntegerArray[i][j];
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
