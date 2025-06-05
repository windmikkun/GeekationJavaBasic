package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 3;
		int b = 5;
		int add = addNumber(a, b);
		int sub = subNumber(a, b);
		int mult = multNumber(a, b);
		int div = divNumber(a, b);	
		
		output(a, b, add, sub, mult, div);
		
		

	}
	//1.
	public static int addNumber(int a, int b) {
		int addResult = a + b;
		
		return addResult;
	}
	//2.
	public static int subNumber(int a, int b) {
		int subResult = a - b;
		
		return subResult;
	}
	//3.
	public static int multNumber(int a, int b) {
		int multResult = a * b;
		
		return multResult;
	}
	//4. 
	public static int divNumber(int a, int b) {
		int divResult = a / b;
		
		return divResult;
	}
	//5.
	public static void output(int a, int b, int addNumber, int subNumber, int multNumber, int divNumber) {
		int[] result = { addNumber, subNumber, multNumber, divNumber};
		
		for(int i = 0; i < result.length; i++) {
			String msg = "計算結果は{%d}です。";
			String msgOut = String.format(msg, result[i]);
			System.out.println(msgOut);
			
		}
	}
}
