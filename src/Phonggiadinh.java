
public class Phonggiadinh extends Phong {
	private int succhua;

	public Phonggiadinh(String maphong, int giatien, String mota, int succhua) {
		super(maphong, giatien, mota);
		this.succhua = succhua;
	}

	public int getSucchua() {
		return succhua;
	}

	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}

	public String toString() {
		return "Maphong: " +getMaphong() + "Gia tien: " +getGiatien() + "Mo ta: " +getMota() + "Suc chua: " +getSucchua();
	}
}
