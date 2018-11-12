package dao;

public class LoaiGiay {
	private int maLoai;
	private String ten;
	public LoaiGiay() {
		
	}
	public LoaiGiay(int maLoai, String ten) {
		this.maLoai = maLoai;
		this.ten = ten;
	}
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

}
