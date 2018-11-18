package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.LoaiGiay;

public class LoaiGiayService extends ConnectionClass {

	public LoaiGiayService() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<LoaiGiay> getListLoaiGiay() throws SQLException, ClassNotFoundException {
		List<LoaiGiay> loaiGiays = new ArrayList<LoaiGiay>();
		PreparedStatement pstmt = connection.prepareStatement("select * from loaigiay");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			LoaiGiay loaiGiay = new LoaiGiay();
			loaiGiay.setMaLoai(rs.getInt("maloai"));
			loaiGiay.setTen(rs.getString("ten"));

			loaiGiays.add(loaiGiay);
		}
		rs.close();
		pstmt.close();
		closeConnection();
		return loaiGiays;
	}

}
