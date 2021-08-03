package br.edu.infnet.model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
  public AllunoController() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email= request.getParameter("email");
		String curso = request.getParameter("curso");
		String regiao = request.getParameter("regiao");
		String [] disciplinas = request.getParameterValues("disciplinas");
		
	}

}
