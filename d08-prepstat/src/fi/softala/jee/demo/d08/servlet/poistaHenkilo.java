package fi.softala.jee.demo.d08.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.softala.jee.demo.d08.dao.HenkiloDAO;


@WebServlet("/poistaHenkilo")
public class poistaHenkilo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public poistaHenkilo() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paikka = request.getParameter("paikkaID");
		String action = request.getParameter("action");
		System.out.println(paikka);
		if(action.equalsIgnoreCase("poista")){
			try {
					HenkiloDAO hDao = new HenkiloDAO();
					hDao.poista(paikka);
			} catch (Exception e) {
				throw new ServletException(e);
			}finally{
				action = "0";
			}
		}
		response.sendRedirect("henkilot");
		
	}

}
