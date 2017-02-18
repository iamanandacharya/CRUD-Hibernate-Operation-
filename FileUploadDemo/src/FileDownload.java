

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDownload
 */
@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDownload() {
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
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		String fileName="cos-multipart.jar";
		String filePath="D:/";
		System.out.println("Succesfully"+ filePath);
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-DISPOSITION","ATTACHMENT; FILENAME=" + fileName);
		int i;
		FileInputStream file = new FileInputStream(fileName+filePath);
		while((i=file.read())!= -1)
		{
			out.write(i);
			out.print("Succesfully Download");
			
		}
		
		file.close();
		out.close();
	}

}
