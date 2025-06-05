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
		
		int[] results = {add, sub, mult, div};
		
		for (int i = 0; i < results.length; i++) {
            output(results[i]);
        }
		

	}
	//1.
	public static int addNumber(int a, int b) {
		return a + b;
	}
	//2.
	public static int subNumber(int a, int b) {
		return a - b;
		
	}
	//3.
	public static int multNumber(int a, int b) {
		return  a * b;
	}
	//4. 
	public static int divNumber(int a, int b) {
		return a / b;
	}
	//5.
	public static void output(int result) {
			String msg = "計算結果は{%d}です。";
			String msgOut = String.format(msg, result);
			System.out.println(msgOut);
	}
}
