package objectExercise;

//共通部分
public class Property {
	private String name; //物件名
	private String ownerName; //物件所有者名
	private String type; //物件種別
	private int price; //物件価格
	
	public Property( String name, String ownerName, String type, int price) { 
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.price = price;
	}
	//ゲッター・セッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getownerName() {
		return ownerName;
	}
	public void setownerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	//出力
	public void printOut() {
	 System.out.println("=============================");
	 System.out.println("物件名:" + name);
	 System.out.println("物件所有者名:" + ownerName);
	 System.out.println("物件価格:" + price + "円");
	 System.out.println("物件種別:" + type );
	}
}


