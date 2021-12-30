package com.namnt2008110229.baikiemtra;
import java.util.Comparator;

import com.namnt2008110229.baikiemtra.HangHoa;
public class TangDanTheoLoaiVaNgay implements Comparator<HangHoa> {
    @Override
	public int compare(HangHoa o1, HangHoa o2) {
		if(!o1.getLoaiHang().equalsIgnoreCase(o2.getLoaiHang())) {
			return o1.getLoaiHang().compareTo(o2.getLoaiHang());
			
		}else {
			return  o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho());
		}
		
		 
	}
	    
}
