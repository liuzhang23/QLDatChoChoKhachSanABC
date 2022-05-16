
public class Main {
	public static void main(String[] args) {
		Danhsachcailoaiphong dsp=new Danhsachcailoaiphong();
		
		Phong phongdon = new Phongdon("PDon", 200000, "Phong 1 nguoi");
		Phong phongdoi = new Phongdoi("PDoi", 350000, "Phong 2 nguoi");
		Phong phonggiadinh = new Phonggiadinh("PGiaDinh", 500000, "Phong 4 - 5", 5);
		
		dsp.Themphongvaods(phongdon);
		dsp.Themphongvaods(phongdoi);
		dsp.Themphongvaods(phonggiadinh);
		
		dsp.XacdinhloaiPhong();
		
		dsp.Kiemtradondatphongcodatphonggiadinh(phonggiadinh);
	}
}
