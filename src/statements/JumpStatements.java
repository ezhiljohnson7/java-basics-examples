package statements;

public class JumpStatements {
	
//	int[] registerNos1 = new int[10];
//						 0   1  2  3  4  5......    9
	int[] registerNos = {10, 8, 9, 7, 6, 5, 3, 4, 2, 1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpStatements jumpObj = new JumpStatements();
//		jumpObj.forLoopTest();
//		jumpObj.findSpecificRegisterNumbersIndex(7);
//		System.out.println(jumpObj.findSpecificRegisterNumbersIndexAndReturn(7));
//		jumpObj.findSpecificRegisterNumbersIndexAndBreak(7);
		jumpObj.ignoreSpecificRegisterNumbersIndexAndContinue(6);
	}
	
	public void forLoopTest() {
		
		for(int i = 0; i <registerNos.length; i++) {
			
			System.out.println("Register no array '"+ i +"' value is : " + registerNos[i]);
		}
	}
	
	public void findSpecificRegisterNumbersIndex(int registerNo) {
		
		for(int i = 0; i <registerNos.length; i++) {
			
			if(registerNos[i] == registerNo) {
				System.out.println("Found the index of "+ registerNo +" and it is " + i);
			}
			System.out.println("Checking the index " + i);
		}
	}

	public int findSpecificRegisterNumbersIndexAndReturn(int registerNo) {
		
		for(int i = 0; i <registerNos.length; i++) {
			
			if(registerNos[i] == registerNo) {
				System.out.println("Found the index of "+ registerNo +" and it is " + i);
				return i;
			}
			System.out.println("Checking the index " + i);
		}
		return 0;
	}
	
	public void findSpecificRegisterNumbersIndexAndBreak(int registerNo) {
		
		for(int i = 0; i <registerNos.length; i++) {
			
			if(registerNos[i] == registerNo) {
				System.out.println("Found the index of "+ registerNo +" and it is " + i);
				break;
			}
			System.out.println("Checking the index " + i);
		}
	}
	
	public void ignoreSpecificRegisterNumbersIndexAndContinue(int registerNo) {
		
		for(int i = 0; i <registerNos.length; i++) {
			
			if(registerNos[i] == registerNo) {
				continue;
			}
			System.out.println("Checking if the value is " + registerNo + " but found " + registerNos[i]);
		}
	}
	
	public void sendEmail(String userName[], String passWord[], String messageBody[], String reciepientEmailID[]) {
		
		for(int i = 0; i <reciepientEmailID.length; i++){
			//Login(username, password)
			//CreateEmail(messageBody)
			//SendEmail(receipientEmailId)
		}
		
		//10 --> 2failed, 8passed

	}
}
