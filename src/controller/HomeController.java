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

import model.Giay;
import model.LoaiGiay;
import service.GiayService;
import service.LoaiGiayService;

/**
 * Servlet implementation class HomeController
 */

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private LoaiGiayService loaiGiayService;
	private GiayService giayService;

	private List<LoaiGiay> getLoaiGiay() throws ClassNotFoundException, SQLException {
		loaiGiayService = new LoaiGiayService();
		return loaiGiayService.getListLoaiGiay();

	}

	private List<Giay> getListGiay() throws SQLException, ClassNotFoundException {
		giayService = new GiayService();
		return giayService.getListGiay();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<LoaiGiay> list;
		List<Giay> listGiay;
		try {
			list = getLoaiGiay();
			listGiay = getListGiay();
			request.setAttribute("listLoaiGiay", list);
			request.setAttribute("listGiay", listGiay);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
