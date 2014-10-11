package html5;

import javax.servlet.annotation.MultipartConfig;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Encoding
 */
@WebServlet("/encoding")
@MultipartConfig
public class Encoding extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    private final static Logger LOGGER = 
            Logger.getLogger(Encoding.class.getCanonicalName());
            
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Encoding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("File name = " + request.getParameter("filename"));
		System.out.println("Text = " + request.getParameter("mytext"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final Part filePart = request.getPart("file");
		if (filePart != null) {
			final String fileName = getFileName(filePart);
		} else {
			throw new RuntimeException("filePart is null");
		}
//		System.out.println("File name = " + request.getParameter("file"));
//		System.out.println("Text = " + request.getParameter("mytext"));
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/plain");
//		Enumeration<String> parameters = request.getParameterNames();
//		while (parameters.hasMoreElements()) {
//            String paramName = parameters.nextElement();
//            out.write(paramName);
//            out.write("n");
//            
//            String[] paramValues = request.getParameterValues(paramName);
//            for (int i = 0; i < paramValues.length; i++) {
//                String paramValue = paramValues[i];
//                out.write("t" + paramValue);
//                out.write("n");
//            }
//
//           // System.out.println("Parameter - " + paramName + ", Value - " + request.getParameter(paramName));
//        }
//        
//        out.close();
	}
	
	private String getFileName(final Part part) {
    final String partHeader = part.getHeader("content-disposition");
    LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);
    for (String content : part.getHeader("content-disposition").split(";")) {
        if (content.trim().startsWith("filename")) {
            return content.substring(
                    content.indexOf('=') + 1).trim().replace("\"", "");
        }
    }
    return null;
}

}
