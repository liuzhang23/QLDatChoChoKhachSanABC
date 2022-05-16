import java.util.ArrayList;
public class Danhsachcailoaiphong {
	private ArrayList<Phong> danhSachPhong = new ArrayList<Phong>();
	private Phong phong;
	public void  Themphongvaods(Phong phong) {
		this.danhSachPhong.add(phong);
	}
	
	public void XacdinhloaiPhong() {	
		System.out.println("Phong don: ");
		for (int i = 0; i < this.danhSachPhong.size(); i++) {
			if (this.danhSachPhong.get(i).getMaphong() == "PDon") {
				System.out.println(this.danhSachPhong.get(i));
			}
		}
		
		System.out.println("Phong doi: ");
		for (int i = 0; i < this.danhSachPhong.size(); i++) {
			if (this.danhSachPhong.get(i).getMaphong() == "PDoi") {
				System.out.println(this.danhSachPhong.get(i));
			}
		}
		
		System.out.println("Phong gia dinh: ");
		for (int i = 0; i < this.danhSachPhong.size(); i++) {
			if (this.danhSachPhong.get(i).getMaphong() == "PGiaDinh") {
				System.out.println(this.danhSachPhong.get(i));
			}
		}
	}
	
	public boolean Kiemtradondatphongcodatphonggiadinh(Phong phong) {
		if(phong.getMaphong()=="PGiaDinh") {
			System.out.println("Co dat phong gia dinh.");
		}else {
			System.out.println("Kong dat phong gia dinh.");
		}
	}	
		
}
