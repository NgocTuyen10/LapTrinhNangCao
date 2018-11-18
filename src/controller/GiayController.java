package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import model.Giay;
import service.GiayService;

/**
 * Servlet implementation class GiayController
 */
@WebServlet("/loaigiay")
public class GiayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GiayController() {
		super();
		// TODO Auto-generated constructor stub
	}

	private GiayService giayService;

	private List<Giay> getListGiay(int maloai) throws SQLException, ClassNotFoundException {
		giayService = new GiayService();
		return giayService.getListGiayByMaLoai(maloai);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Giay> listGiay;
		String maloai = (String)request.getParameter("maloai");
		int maLoai = Integer.valueOf(maloai);
		try {
			listGiay = getListGiay(maLoai);
			request.setAttribute("listGiay", listGiay);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
