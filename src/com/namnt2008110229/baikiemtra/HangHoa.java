package com.namnt2008110229.baikiemtra;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangHoa {
    private String loaiHang;
	private int maHang;
	private String tenHangHoa;
	private double giaNhap;
	private int soLuongHangTon;
	private Date ngayNhapKho;
	
	public String getLoaiHang() {
		return loaiHang;
	}
	public void setLoaiHang(String loaiHang) {
		this.loaiHang = loaiHang;
	}
	public String getTenHangHoa() {
		return tenHangHoa;
	}
	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public int getSoLuongHangTon() {
		return soLuongHangTon;
	}
	public void setSoLuongHangTon(int soLuongHangTon) {
		this.soLuongHangTon = soLuongHangTon;
	}
	public Date getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(Date ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}
	public HangHoa(String loaiHang, int maHang, String tenHangHoa, double giaNhap, int soLuongHangTon,
			Date ngayNhapKho) {
		this.loaiHang = loaiHang;
		this.maHang = maHang;
		this.tenHangHoa = tenHangHoa;
		this.giaNhap = giaNhap;
		this.soLuongHangTon = soLuongHangTon;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	
	
	public HangHoa(String loaiHang, String tenHangHoa, double giaNhap, int soLuongHangTon, Date ngayNhapKho) {
		
		this.loaiHang = loaiHang;
		this.tenHangHoa = tenHangHoa;
		this.giaNhap = giaNhap;
		this.soLuongHangTon = soLuongHangTon;
		this.ngayNhapKho = ngayNhapKho;
	}
	public HangHoa() {
		
	}
	
	
	private String convertDateToString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(this.ngayNhapKho);
	}
	
	@Override
	public String toString() {
		return "Mã Hàng : "+this.maHang+"\n"+
				"Loại Hàng : "+this.loaiHang+"\n"+
				"Tên Hàng Hóa : "+this.tenHangHoa+"\n"+
				"Giá Nhập : "+this.giaNhap+"\n"+
				"Số Lượng Hàng Tồn : "+this.soLuongHangTon+"\n"+
				"Ngày Nhập Kho : "+convertDateToString()
				+"\n";
	}
	
	
	
	
	
	    
}
