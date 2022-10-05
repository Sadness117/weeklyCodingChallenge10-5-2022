package problems;

public class Problem2 {
	public Problem2() {
		
	}
	public boolean isFactorial(int input){
		int result = 1;
		for(int i = 1; i< input;i++) {
			result *= i;
			if(result>input) {
				return false;
			}else if(result == input) {
				return true;
			}
		}
		
		
		return false;
	}
}
