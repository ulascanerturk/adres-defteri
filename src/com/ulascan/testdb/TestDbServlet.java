package com.ulascan.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String kullaniciAdi = "kisi";
		String sifre = "root";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/adres_defteri?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Database bağlanıyor: " + jdbcUrl);
			
			Class.forName(driver);
			Connection baglan = DriverManager.getConnection(jdbcUrl, kullaniciAdi, sifre);
			
			out.println("Başarılı");
			
			baglan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		
	}

}
