package com.namnt2008110229.baikiemtra;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import com.namnt2008110229.baikiemtra.HangHoa;
public class Functions {
/*Hàm chuyển đổi String sang Date
	 * - Sử dụng đối tượng SimpleDateFormat để chuyển đổi kiểu chuỗi và trả về một giá trị kiểu ngày.
	 *  
	 */
	public static Date stringToDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(date);
	}
	
	/* Hàm thêm một Hàng Hóa vào Mảng
	 * Tạo một mảng hàng hóa mới với độ dài là mảng cũ + 1
	 * Cho chạy vòng lặp mảng mới , add các phần tử của mảng cũ vào mảng mới
	 * phần tử cuối cùng của mảng mới sẽ là phần tử được thêm
	 * 
	 * */
	
	public static HangHoa[] them(HangHoa arrHangHoa[],HangHoa entity) {
		HangHoa[] newArrHangHoa = new HangHoa[arrHangHoa.length + 1];

		for(int i = 0 ; i < arrHangHoa.length ; i++) {
			newArrHangHoa[i] = arrHangHoa[i];
		}

		newArrHangHoa[newArrHangHoa.length - 1] = entity;

		return newArrHangHoa;
	}
	

	/* Hàm xóa một Hàng Hóa vào Mảng
	 * Tạo một mảng hàng hóa mới với độ dài là mảng cũ - 1
	 * Cho chạy vòng lặp mảng mới , add các phần tử của mảng cũ vào mảng mới, nếu phần tử bị xóa trùng với
	 * tham số mã cần xóa thì bỏ qua việc add phần tử đó vào mảng mới.
	 * 
	 * Trả Về 1 mảng mới đã được remove phần tử theo mã
	 *
	 * 
	 * */
	
	public static HangHoa[] xoa(HangHoa arrHangHoa[],int ma) {
		HangHoa[] newArrHangHoa = new HangHoa[arrHangHoa.length - 1];

		for(int i = 0 ,k =0 ; i < arrHangHoa.length ; i++) {
			if(ma == arrHangHoa[i].getMaHang()) {
				continue;
			}
			newArrHangHoa[k++] = arrHangHoa[i];
		}

		return newArrHangHoa;
	}
	
	
	/* Hàm sửa một Hàng Hóa 
	 * 
	 * Mã Hàng Hóa không đổi nên set tham số entity sẽ giữ nguyên mã
	 * 
	 * Cho chạy vòng lặp để tìm kiếm Hàng Hóa cần sửa dựa theo mã , nếu tìm thấy thì thay đổi đối tượng trong mảng thành entity
	 * 
	 * Trả về mảng sau khi đã sửa phần tử
	 * 
	 * */
	public static HangHoa[] sua(HangHoa arrHangHoa[],int ma,HangHoa entity) {
		
		entity.setMaHang(ma);
		
		for(int i = 0 ; i < arrHangHoa.length ; i++) {
			if(ma == arrHangHoa[i].getMaHang()) {
				arrHangHoa[i] = entity;
			}
			
		}

		return arrHangHoa;
	}
	
	/* Hàm tìm kiếm theo Loại Hàng Hóa 
	 * 
	 * Gọi biến cờ False.
	 * Chạy vòng lặp từng đối tượng trong mảng , nếu thuộc tính loại hàng trùng với tham số loai thì in ra kết quả và
	 * biến cờ trở thành true.
	 * 
	 * Nếu kết thúc vòng lặp biến cờ vẫn giữ nguyên giá trị là false thì in ra câu thông báo.
	 * */
	
	public static void timKiemTheoLoai(HangHoa arrHangHoa[],String loai) {
		boolean flag = false;
		for(HangHoa hang : arrHangHoa) {
			if(loai.equalsIgnoreCase(hang.getLoaiHang())) {
				System.out.println("Đã tìm thấy mặt hàng");
				System.out.println(hang);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Không tìm thấy mặt hàng");
		}
		
	}
	
	/* Hàm tìm kiếm theo khoảng giá
	 * 
	 * Chạy vòng lặp , nếu có phần tử nằm trong range giá thì tăng biến đếm lên .
	 * 
	 * Tạo một mảng mới với kích thước bằng với biến đếm.
	 * 
	 * Chạy vòng lặp lần 2 với mục đích tìm kiếm các phần tử thỏa mãn range giá , sau đó truyền vào mảng mới.
	 * 
	 * Cuối cùng in ra các phần tử trong mảng mới thỏa với điều kiện đề bài .
	 *
	 * */
	
	public static void timKiemTheoGia(HangHoa arrHangHoa[],double gia1,double gia2) {
		int dem = 0;
		
		for(HangHoa hang : arrHangHoa) {
			if(hang.getGiaNhap() >= gia1 && hang.getGiaNhap() <= gia2) {
				dem++;
			}
		}
		HangHoa[] result = new HangHoa[dem];
		
		for(int i = 0,k = 0 ; i < arrHangHoa.length; i++) {
			if(arrHangHoa[i].getGiaNhap() >= gia1 && arrHangHoa[i].getGiaNhap() <= gia2) {
				result[k] = arrHangHoa[i]; 
				k++;
			}
		}
		
		for(HangHoa r : result) {
			System.out.println(r);
			System.out.println();
		}

	}
	
	/* Hàm tìm kiếm theo khoảng ngày
	 * 
	 * Giống như tìm range giá , chỉ thay đổi điều kiện tìm kiếm khoảng ngày.
	 * 
	 * 
		
	 * */

	public static void timKiemTheoNgay(HangHoa arrHangHoa[],String dateString1,String dateString2) throws ParseException {
		int dem = 0;
		
		
		Date date1 = stringToDate(dateString1);
		Date date2 = stringToDate(dateString2);
		
		
		for(HangHoa hang : arrHangHoa) {
			if(date1.compareTo(hang.getNgayNhapKho()) * hang.getNgayNhapKho().compareTo(date2) >= 0) {
				dem++;
			}
		}
		HangHoa[] result = new HangHoa[dem];
		
		for(int i = 0,k = 0 ; i < arrHangHoa.length; i++) {
			
			if(date1.compareTo(arrHangHoa[i].getNgayNhapKho()) * arrHangHoa[i].getNgayNhapKho().compareTo(date2) >= 0) {
				result[k] = arrHangHoa[i]; 
				k++;
			}
		}
		
		for(HangHoa r : result) {
			System.out.println(r);
			System.out.println();
		}

	}
	
	
	/* Hàm sắp xếp tăng dần theo giá.
	 * 
	 * Gọi phương thức Arrays.sort , tham số là một mảng cần sắp xếp và một đối tượng điều kiện sắp xếp.
		
		Đối tượng điều kiện sắp xếp cần được tạo ra và implements interface Comparator.
		
		Các phương thức sắp xếp bên dưới tương tự
	 *
	 * */
	public static void sapXepTangDanTheoGia(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa,new HangHoaGiaTangDan());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h );
		}
	}
	
	
	
	public static void sapXepGiamDanTheoGia(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa,new HangHoaGiaGiamDan());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h );
		}
	}
	
	public static void sapXepGiamDanTheoNgay(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa,new HangHoaGiamTheoNgay());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h );
		}
	}
	
	public static void sapXepTangDanTheoNgay(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa,new HangHoaTangTheoNgay());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h);
		}
	}
	
	public static void sapXepTangDanTheoLoaiVaGia(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa, new TangDanTheoLoaiVaGia());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h);
		}
	}
	
	public static void sapXepGiamDanTheoLoaiVaGia(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa, new GiamDanTheoLoaiVaGia());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h);
		}
	}
	
	public static void sapXepTangDanTheoLoaiVaNgay(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa, new TangDanTheoLoaiVaNgay());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h);
		}
	}
	
	public static void sapXepGiamDanTheoLoaiVaNgay(HangHoa arrHangHoa[]) {
		Arrays.sort(arrHangHoa, new GiamDanTheoLoaiVaNgay());
		for(HangHoa h : arrHangHoa) {
			System.out.println(h);
		}
	}
	
	
	
	public static double tongGiaTriNhapKho(HangHoa arrHangHoa[]) {
		double tong = 0;
		
		for(HangHoa hang : arrHangHoa) {
			tong+= hang.getGiaNhap();
		}
		
		return tong;
	}
	
	public static void soLuongTungLoaiHang(HangHoa arrHangHoa[]) {
		int soThucPham = 0;
		int soSanhSu = 0;
		int soDienMay = 0;
		
		for(HangHoa hang : arrHangHoa) {
			if(hang.getLoaiHang().equalsIgnoreCase("Thực Phẩm")) {
				soThucPham++;
			}else if(hang.getLoaiHang().equalsIgnoreCase("Sành Sứ")) {
				soSanhSu++;
			}else if(hang.getLoaiHang().equalsIgnoreCase("Điện Máy")) {
				soDienMay++;
			}
		}
		
		System.out.println("Số Lượng sản phẩm thực phẩm là : "+soThucPham);
		System.out.println("Số Lượng sản phẩm sành sứ là : "+soSanhSu);
		System.out.println("Số Lượng sản phẩm điện máy là : "+soDienMay);
		
	}
	
	public static void thongKe(HangHoa arrHangHoa[]) {
		System.out.println("Tổng số lượng hàng hóa là : "+arrHangHoa.length);
		System.out.println("Tổng giá trị nhập kho là : "+tongGiaTriNhapKho(arrHangHoa));
		soLuongTungLoaiHang(arrHangHoa);
	}
	
	
	
	    
}
