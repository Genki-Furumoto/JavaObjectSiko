package objectExercise;

public class Land extends Property {
	
	private String size;

	// コンストラクタ
	Land(String name, String owner, String type, String price, String size) {
		super(name, owner, type, price);
		this.size = size;
	}
	
	// 出力
	public void display() {
		super.display();
		
		System.out.println("広さ：" + this.size);
		System.out.println("=============================");
	}

	// ゲッター・セッター
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
