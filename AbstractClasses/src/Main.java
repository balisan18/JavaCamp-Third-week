
public class Main {

	public static void main(String[] args) {
		WomanGameCalculater womanGameCalculater =new WomanGameCalculater();
		womanGameCalculater.hesapla();
		womanGameCalculater.gameOver();
		//abstract sınıflar asla new lenemez.
		
		GameCalculater gameCalculaters = new KidsGameCalculater();
		gameCalculaters.hesapla();
		gameCalculaters.gameOver();
	}

}
