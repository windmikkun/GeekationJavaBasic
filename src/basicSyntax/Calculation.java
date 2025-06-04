package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1.
		int x = 5;
		int y = 10;
		int z = x + y;
		String zMsg = "変数zの値は%dです";
		//String.formatメソッドがPythonのformat関数のようなもの
		String zOutput = String.format(zMsg, z);
		
		System.out.println(zOutput);
		
		
		// 2.
		double a = 5.25;
		
		a += 2.5;
		a *= 3.0;
		
		int b = (int)a;
		b += 10;
		
		String aMsg = "変数aの値は%.2fです";
		String bMsg = "変数bの値は%dです";
		String aOutput = String.format(aMsg, a);
		String bOutput = String.format(bMsg, b);
		
		
		System.out.println(aOutput);
		System.out.println(bOutput);
	}

}
