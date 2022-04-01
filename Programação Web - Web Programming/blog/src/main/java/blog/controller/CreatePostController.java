package blog.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import blog.model.Post;
import blog.persistence.PostDAO;

@WebServlet(urlPatterns = {"/post"})
public class CreatePostController extends HttpServlet {
	private PostDAO dao = new PostDAO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("./WEB-INF/form.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tt = req.getParameter("title");
		String tx = req.getParameter("text");
		String au = req.getParameter("author");
		Post post = new Post();
		post.setTitle(tt);
		post.setText(tx);
		post.setAuthor(au);	
		dao.save(post);
		resp.sendRedirect("index");
		}

}
