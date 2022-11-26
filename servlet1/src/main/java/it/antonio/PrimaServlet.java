package it.antonio;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write(""
        		+ "<head>\r\n"
        		+ "\r\n"
        		+ "<title>\r\n"
        		+ "Portfolio\r\n"
        		+ "</title>\r\n"
        		+ "<nav>\r\n"
        		+ "	<center>\r\n"
        		+ "		<table>\r\n"
        		+ "	<tr>\r\n"
        		+ "		<h1>\r\n"
        		+ "<td><a href=\"\"><h1>HOME |</h1></td>\r\n"
        		+ "<td><a href=\"\"><H1>CHI SONO |</H1></td>\r\n"
        		+ "<td><a href=\"\"><H1>SERVIZI |</H1></td>\r\n"
        		+ "<td><a href=\"\"><h1>CONTATTI</h1></td>\r\n"
        		+ "		</h1>\r\n"
        		+ "	</tr>\r\n"
        		+ "		</table>\r\n"
        		+ "	\r\n"
        		+ "</nav>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "<center>\r\n"
        		+ "<table>\r\n"
        		+ "<tr>\r\n"
        		+ "	<td><img src=\"http://localhost/portfolio/blon.png\"></td>\r\n"
        		+ "	<td><h1>Mi chiamo Antonio Formisano <br> Sono nato il 22 Febbraio 1998</h1></td>\r\n"
        		+ "</tr>\r\n"
        		+ "</table>\r\n"
        		+ "</center>\r\n"
        		+ "	\r\n"
        		+ "</body>\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "<footer>\r\n"
        		+ "	<center>\r\n"
        		+ "		<br><br><br><br>\r\n"
        		+ "		<hr><hr>\r\n"
        		+ "		<h4>Copyright by Antonio Formisano 2022/2032</h4>\r\n"
        		+ "	</center>\r\n"
        		+ "	\r\n"
        		+ "</footer>");		 
        w.flush();
        w.close();
    }
	
	
}
