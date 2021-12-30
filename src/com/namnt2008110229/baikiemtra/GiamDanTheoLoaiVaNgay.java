package com.namnt2008110229.baikiemtra;
import java.util.Comparator;

import com.namnt2008110229.baikiemtra.HangHoa;
public class GiamDanTheoLoaiVaNgay implements Comparator<HangHoa>  {
    @Override
	public int compare(HangHoa o1, HangHoa o2) {
		if(!o1.getLoaiHang().equalsIgnoreCase(o2.getLoaiHang())) {
			return o2.getLoaiHang().compareTo(o1.getLoaiHang());
			
		}else {
			return  o2.getNgayNhapKho().compareTo(o1.getNgayNhapKho());
		}
		
		 
	}
	    
}
