package problems;

public class Problem1 {

	public Problem1() {
	
	}
	public boolean validate(String input) {
		String input1 = input;
		
		if(input1.length()==4 || input1.length() == 6) {
			try {
				for(int i = 0; i<input.length();i++) {
					int input2 = Integer.parseInt(input1.charAt(i)+"");
				}
				}catch(Exception e) {
					return false;
				}
				
		}else {
			return false;
		}
		
		return true;
	}
}
