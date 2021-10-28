package com.simplilearn.servlets.admin; 
 
import java.io.IOException; import java.io.PrintWriter; 
 
import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse; 
 
/** 
*	Servlet implementation class login 
 */ 
 
@WebServlet("/login") 
public class login extends HttpServlet { 
    /** 
*	 	 */ 
 	private static final long serialVersionUID = 1L;  	public static boolean isLoggedIn = false;     public static String password = "Abhi18@ayaan19";     public static String email = "kumar.abhishek7885@gmail.com"; 
 
    @Override 
    public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {         PrintWriter out = resp.getWriter(); 
 
        String email = req.getParameter("username");         String pass = req.getParameter("password"); 
 
        if (email.equals(login.email) && pass.equals(login.password)){             isLoggedIn = true; 
            out.println("You have LoggedIn"); 
 
            try { 
 	 	 	 	req.getRequestDispatcher("dashboard.html").forward(req, resp); 
 	 	 	} catch (ServletException e) { 
 	 	 	 	// TODO Auto-generated catch block  	 	 	 	e.printStackTrace(); 
 	 	 	} catch (IOException e) { 
 	 	 	 	// TODO Auto-generated catch block  	 	 	 	e.printStackTrace(); 
 	 	 	} 
                     }         else { 
            isLoggedIn = false;             out.println("Login Failed : Incorrect email or Password"); 
                     }
        out.close();
    }
}
