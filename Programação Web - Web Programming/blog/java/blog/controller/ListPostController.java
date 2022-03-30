package blog.controller;

import java.io.IOException;
import java.util.List;

import blog.model.Post;
import blog.persistence.PostDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/index"})
public class ListPostController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PostDAO dao = new PostDAO();
		List<Post> list = dao.toList();
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("./index.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.sendRedirect("receive.jsp");
		String tt = req.getParameter("title");
		String tx = req.getParameter("text");
		String au = req.getParameter("author");
		req.getSession().setAttribute("text", tx);
		req.getSession().getServletContext().setAttribute("author", au);
		System.out.println("Título: " + tt + "| Texto: " + tx + " | Autor: " + au);
		// resp.getWriter().append("Título: " + tt + "| Texto: " + tx + " | Autor: " + au);
		resp.sendRedirect("receive.jsp");
		// RequestDispatcher dispatcher = req.getRequestDispatcher("./recebe.jsp");
		// dispatcher.forward(req, resp);
	}

}
