	

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.CookieList;

import DAO.ShowDatabase;
import DaoVoClass.RegisterDetailsVo;

import com.google.gson.Gson;

/**
 * Servlet implementation class AjaxForm
 */
@WebServlet("/AjaxForm")
public class AjaxForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("submit")==null){
		Gson gs = new Gson();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
			List<RegisterDetailsVo> regforms = ShowDatabase.regFormAjax();
			System.out.println(regforms);
			String json = gs.toJson(regforms);
			HttpSession session = request.getSession();
			request.setAttribute("regform", json);
			out.append(json);
			System.out.println(regforms);
		}
		else{
			System.out.println("No");
		}
		
			
		
	}

}
