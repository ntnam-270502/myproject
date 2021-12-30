package com.namnt2008110229.baikiemtra;
import java.util.Comparator;

import com.namnt2008110229.baikiemtra.HangHoa;
public class HangHoaGiaTangDan implements Comparator<HangHoa> {
    @Override
	public int compare(HangHoa o1, HangHoa o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getGiaNhap() - o2.getGiaNhap());
	}
	    
}
