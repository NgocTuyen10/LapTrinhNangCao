package model;

public class Giay {
	private int maGiay;
	private String ten;
	private double gia;
	private String mieuTa;
	private String hinhAnh;
	private int maLoai;

	public Giay() {

	}

	public Giay(int maGiay, String ten, double gia, String mieuTa, String hinhAnh, int maLoai) {
		this.maGiay = maGiay;
		this.ten = ten;
		this.gia = gia;
		this.mieuTa = mieuTa;
		this.hinhAnh = hinhAnh;
		this.maLoai = maLoai;
	}

	public int getMaGiay() {
		return maGiay;
	}

	public void setMaGiay(int maGiay) {
		this.maGiay = maGiay;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getMieuTa() {
		return mieuTa;
	}

	public void setMieuTa(String mieuTa) {
		this.mieuTa = mieuTa;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public int getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}

}
