package com.namnt2008110229.baikiemtra;
import java.util.Comparator;

import com.namnt2008110229.baikiemtra.HangHoa;

public class HangHoaGiamTheoNgay implements Comparator<HangHoa> {
	@Override
	public int compare(HangHoa o1, HangHoa o2) {
		// TODO Auto-generated method stub
		return o2.getNgayNhapKho().compareTo(o1.getNgayNhapKho());
	}
	    
}
