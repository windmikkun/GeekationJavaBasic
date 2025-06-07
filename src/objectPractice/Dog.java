package objectPractice;

public class Dog {
	private String name;
	  private String breeds;
	  private double weight;

	  Dog(String name, String breeds, double weight) {
	    this.name = name;
	    this.breeds = breeds;
	    this.weight = weight;
	  }

	  public void greeting() {
	    System.out.println("こんにちは！ 私の名前は" + this.name + "です。");
	    System.out.println("種類は" + this.breeds + "です。");
	    System.out.println("体重は" + this.weight + "kgです。");
	  }
}
