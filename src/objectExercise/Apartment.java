package objectExercise;

//マンション
public class Apartment extends Property {
	private String layout;
	
	public Apartment(String name, String ownerName, int price, String layout) {
		super(name, ownerName, "マンション", price);
		this.layout = layout;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public String getLayout() {
		return layout;
	}
	public void setlayout(String layout) {
		this.layout = layout;
	}
	
	@Override
	public void printOut() {
		super.printOut();
		System.out.println("間取り:" + layout);
		System.out.println("=============================");
	}
}
