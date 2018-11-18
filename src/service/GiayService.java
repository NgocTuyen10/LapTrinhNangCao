package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Giay;
import model.LoaiGiay;

public class GiayService extends ConnectionClass {

	public GiayService() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 * @throws SQLException
	 */
	public List<Giay> getListGiay() throws SQLException {
		List<Giay> listGiay = new ArrayList<Giay>();
		PreparedStatement pstmt = connection.prepareStatement("select * from giay");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Giay giay = new Giay();
			giay.setMaGiay(rs.getInt("magiay"));
			giay.setTen(rs.getString("ten"));
			giay.setGia(rs.getDouble("gia"));
			giay.setMieuTa(rs.getString("mieuta"));
			giay.setHinhAnh(rs.getString("hinhanh"));
			giay.setMaLoai(rs.getInt("maLoai"));
			listGiay.add(giay);
		}
		rs.close();
		pstmt.close();
		closeConnection();
		return listGiay;
	}

	public List<Giay> getListGiayByMaLoai(int maLoai) throws SQLException {
		List<Giay> listGiay = new ArrayList<Giay>();
		PreparedStatement pstmt = connection.prepareStatement("select * from giay where maLoai= ?");
		pstmt.setInt(1, maLoai);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Giay giay = new Giay();
			giay.setMaGiay(rs.getInt("magiay"));
			giay.setTen(rs.getString("ten"));
			giay.setGia(rs.getDouble("gia"));
			giay.setMieuTa(rs.getString("mieuta"));
			giay.setHinhAnh(rs.getString("hinhanh"));
			giay.setMaLoai(rs.getInt("maLoai"));
			listGiay.add(giay);
		}
		rs.close();
		pstmt.close();
		closeConnection();
		return listGiay;
	}
}
