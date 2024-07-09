package objectExercise;

public class Property {
	
	// フィールド
	private String name;
	private String owner;
	private String type;
	private String price;
	
	// コンストラクタ
	Property(String name, String owner, String type, String price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}

	// ゲッター・セッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	// 出力
	public void display() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price);
	}
}
