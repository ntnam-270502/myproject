package com.namnt2008110229.baikiemtra;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.namnt2008110229.baikiemtra.HangHoa;
import com.namnt2008110229.baikiemtra.Functions;
public class Main {
/* Hàm tạo sẵn data 
	 * 
	 * Trả về data bao gồm 5 phần tử để test , có thể thêm tùy ý.
	 * 
	 * */
	public static HangHoa[] daTa() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String date = "26/11/2022";
		String date2 = "13/11/2019";
		String date3 = "27/12/2020";
		String date4 = "26/11/2021";
		String date5 = "12/10/2021";

		HangHoa[] arrHangHoa = new HangHoa[5];
		HangHoa hh1 = new HangHoa("Thực phẩm",123,"Xúc xích",3000,30, sdf.parse(date));
		HangHoa hh2 = new HangHoa("Sành Sứ",456, "Chén đĩa", 4000, 20, sdf.parse(date3));
		HangHoa hh3 = new HangHoa("Điện Máy",789, "Ti vi", 60000,40, sdf.parse(date2));
		HangHoa hh4 = new HangHoa("Điện máy",1123, "Tủ lạnh", 60000,40, sdf.parse(date));
		HangHoa hh5 = new HangHoa("Điện máy",1124, "Tủ lạnh", 60000,40, sdf.parse(date));

		arrHangHoa[0] = hh1;
		arrHangHoa[1] = hh2;
		arrHangHoa[2] = hh3;
		arrHangHoa[3] = hh4;
		arrHangHoa[4] = hh5;


		return arrHangHoa;

	}
	
	/* Hàm dùng để nhập dữ liệu cho chức năng thêm 1 Hàng hóa vào trong danh sách.
	 * 
	 * 
	 * */
	
	public static HangHoa nhapThem() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Mời bạn nhập vào mã hàng cần thêm");
		int maHang = new Scanner(System.in).nextInt();
		
		System.out.println("Mời bạn nhập vào loại hàng cần thêm");
		String loaiHang = new Scanner(System.in).nextLine();
		
		System.out.println("Mời bạn nhập vào tên hàng cần thêm");
		String tenHang = new Scanner(System.in).nextLine();
		
		System.out.println("Mời bạn nhập vào giá hàng cần thêm");
		double gia = new Scanner(System.in).nextDouble();
		
		System.out.println("Mời bạn nhập vào số lượng tồn kho cần thêm");
		int slTon = new Scanner(System.in).nextInt();
		
		System.out.println("Mời bạn nhập vào ngày nhập kho cần thêm");
		String dateS = new Scanner(System.in).nextLine();
		Date date = sdf.parse(dateS);
		
		HangHoa hh = new HangHoa(loaiHang, maHang, tenHang, gia, slTon, date);
		
		return hh;
	}
	
	
	/* Hàm nhập dữ liệu dùng để thực hiện chức năng sửa trong danh sách.
	 * 
	
	 * */
	
	public static HangHoa nhapSua() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Mời bạn nhập vào loại hàng cần sửa");
		String loaiHang = new Scanner(System.in).nextLine();
		
		System.out.println("Mời bạn nhập vào tên hàng cần sửa");
		String tenHang = new Scanner(System.in).nextLine();
		
		System.out.println("Mời bạn nhập vào giá hàng cần sửa");
		double gia = new Scanner(System.in).nextDouble();
		
		System.out.println("Mời bạn nhập vào số lượng tồn kho cần sửa");
		int slTon = new Scanner(System.in).nextInt();
		
		System.out.println("Mời bạn nhập vào ngày nhập kho cần sửa");
		String dateS = new Scanner(System.in).nextLine();
		Date date = sdf.parse(dateS);
		
		HangHoa hh = new HangHoa(loaiHang, tenHang, gia, slTon, date);
		
		
		return hh;
	}
	
	/* Hàm in ra tất cả phần tử trong danh sách.

	 * */
	public static void xuat(HangHoa arr[]) {
		for(HangHoa hang : arr) {
			System.out.println(hang);
			System.out.println();
		}
	}

	public static void main(String[] args) throws ParseException {

		HangHoa data[] = daTa();
		int chon = 0;

	
		HangHoa hh = new HangHoa();
		hh.setMaHang(123);



		while(chon != -1) {


			System.out.println("1.Thêm Hàng Hóa");
			System.out.println("2.Xóa Hàng Hóa Theo Mã");
			System.out.println("3.Sửa Hàng Hóa Theo Mã");
			System.out.println("4.Tìm Kiếm Hàng Hóa Theo Loại");
			System.out.println("5.Tìm Kiếm Hàng Hóa Theo Khoảng Giá");
			System.out.println("6.Tìm Kiếm Hàng Hóa Theo Khoảng Ngày");
			System.out.println("7.Sắp xếp tăng dần theo giá nhập");
			System.out.println("8.Sắp xếp giảm dần theo giá nhập");
			System.out.println("9.Sắp xếp tăng dần theo ngày nhập");
			System.out.println("10.Sắp xếp giảm dần theo ngày nhập");
			System.out.println("11.Sắp xếp tăng dần theo loại và theo ngày nhập");
			System.out.println("12.Sắp xếp giảm dần theo loại và theo ngày nhập");
			System.out.println("13.Sắp xếp tăng dần theo loại và theo giá");
			System.out.println("14.Sắp xếp giảm dần theo loại và theo giá");
			System.out.println("15.Thống kê");
			System.out.println("16.In ra tất cả hàng hóa");
			System.out.println();
			System.out.println("Mời bạn chọn chức năng");
			chon = new Scanner(System.in).nextInt();

			switch (chon) {
			case 1:
				data = Functions.them(data, nhapThem());
				System.out.println();
				break;
			case 2:
				System.out.println("Mời bạn nhập vào mã hàng cần xóa");
				int maHang = new Scanner(System.in).nextInt();
				data = Functions.xoa(data, maHang);
				break;
			case 3:
				System.out.println("Mời bạn nhập vào mã hàng cần sửa");
				int maHangSua = new Scanner(System.in).nextInt();
				data = Functions.sua(data, maHangSua, nhapSua());
				break;
			
			case 4:
				System.out.println("Mời bạn nhập vào loại hàng cần tìm");
				String loai = new Scanner(System.in).nextLine();
				Functions.timKiemTheoLoai(data, loai);
				System.out.println();
				break;
			
			case 5:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Mời bạn nhập giá thứ 1");
				int gia1 = sc2.nextInt();
				System.out.println("Mời bạn nhập giá thứ 2");
				int gia2 = sc2.nextInt();
				
				Functions.timKiemTheoGia(data, gia1, gia2);
				System.out.println();
				break;
			
			case 6:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Mời bạn nhập vào ngày 1");
				String date1 = sc3.nextLine();
				System.out.println("Mời bạn nhập vào ngày 2");
				String date2 = sc3.nextLine();
				
				Functions.timKiemTheoNgay(data, date1, date2);
				System.out.println();
				break;
			
			case 7:
				Functions.sapXepTangDanTheoGia(data);
				System.out.println();
				break;
			
			case 8:
				Functions.sapXepGiamDanTheoGia(data);
				System.out.println();
				break;
			
			case 9:
				Functions.sapXepTangDanTheoNgay(data);
				System.out.println();
				break;
			
			case 10:
				Functions.sapXepGiamDanTheoNgay(data);
				System.out.println();
				break;
			
			case 11:
				Functions.sapXepTangDanTheoLoaiVaNgay(data);
				System.out.println();
				break;
			
			case 12:
				Functions.sapXepGiamDanTheoLoaiVaNgay(data);
				System.out.println();
				break;
			
			case 13:
				Functions.sapXepTangDanTheoLoaiVaGia(data);
				System.out.println();
				break;
			
			case 14:
				Functions.sapXepGiamDanTheoLoaiVaGia(data);
				System.out.println();
				break;
			
			case 15:
				Functions.thongKe(data);
				System.out.println();
				break;
			
			case 16:
				xuat(data);
				break;
			
			default:
				break;
			}
		
	

		}

	}
    
}
