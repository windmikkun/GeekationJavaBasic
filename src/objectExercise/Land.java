package objectExercise;

//土地
public class Land extends Property{
	private double area;
	
	public Land(String name, String ownerName, int price, double area) {
		super(name, ownerName, "土地", price);
		this.area = area;
	}
	public double getArea() {
			return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void printOut() {
		super.printOut();
		System.out.println("広さ:" + area + "㎡");
		System.out.println("=============================");
			
		}
	}
