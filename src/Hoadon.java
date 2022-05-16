
public class Hoadon {
	private String tenkhachhang;
	private Ngay ngayden;
	private Ngay ngaydi;
	private int soluong;
	private Phong phong;
	public Hoadon(String tenkhachhang, Ngay ngayden, Ngay ngaydi, int soluong, Phong phong) {
		super();
		this.tenkhachhang = tenkhachhang;
		this.ngayden = ngayden;
		this.ngaydi = ngaydi;
		this.soluong = soluong;
		this.phong = phong;
	}
	public String getTenkhachhang() {
		return tenkhachhang;
	}
	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}
	public Ngay getNgayden() {
		return ngayden;
	}
	public void setNgayden(Ngay ngayden) {
		this.ngayden = ngayden;
	}
	public Ngay getNgaydi() {
		return ngaydi;
	}
	public void setNgaydi(Ngay ngaydi) {
		this.ngaydi = ngaydi;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	 
	public String toString() {
		return "Ten khach hang: " + getTenkhachhang() + "Ngay den: " + getNgayden() + "Ngay di: " + getNgaydi() + 
				"So luong phong: " + getSoluong() + "Phong: " + getPhong();
	}
	
	
	
}
