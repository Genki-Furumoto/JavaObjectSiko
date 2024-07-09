package objectExercise;

public class Main {
	public static void main(String[] args) {
		Apartment apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", "50000000円", "3LDK");
		Land land = new Land("いい感じの土地", "山田 土地太郎", "土地", "8000000円", "105.2㎡");
		
		apartment.display();
		land.display();
	}
}
