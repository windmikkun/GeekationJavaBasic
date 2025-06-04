package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.
		int a = 38;
		int b = 25;
		
		boolean aIsBigger = a > b;
		
		System.out.println(aIsBigger);
		
		//2.
		boolean isSunny = true;
		boolean isWarm = true;
		
		if ( isWarm && isSunny ) 
			System.out.println(true);
		else 
			System.out.println(false);
		
		//3.
		int x = 15;
		int y = 24;
		
		if ( x >= 0 && y % 2 == 0 ) 
			System.out.println(true);
		else
			System.out.println(false);
		
		
		//4.
		boolean hasPermission = false;
		
		if (!hasPermission) 
			System.out.println(true);
		else
			System.out.println(false);
	}

}
