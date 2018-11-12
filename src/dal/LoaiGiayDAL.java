package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.LoaiGiay;

public class LoaiGiayDAL extends ConnectionClass {
	public LoaiGiayDAL() {
	}
	public List<LoaiGiay> getListLoaiGiay() throws SQLException, ClassNotFoundException {
		List<LoaiGiay> loaiGiays = new ArrayList<LoaiGiay>();
		initConnection();
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
		return loaiGiays;
	}
	
}
