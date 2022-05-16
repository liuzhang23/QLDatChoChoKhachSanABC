
public class Phongdon extends Phong{
	
	public Phongdon(String maphong, int giatien, String mota ) {
		super(maphong,giatien,mota);
	}
	
	public String toString() {
		return "Maphong: " +getMaphong() + "Gia tien: " +getGiatien() + "Mo ta: " +getMota();
	}

}
