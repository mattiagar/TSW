package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "loginUtenteServlet", value = "/loginUtenteServlet")
public class loginUtenteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        autenticazioneService service = new autenticazioneServiceImpl();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession ssn = null;
        //Se username e password corrispondono ad un utente li metto nella sessione HTTP e reindirizzo alla home
        if (service.doCheckPassword(username, password)) {
            ssn = request.getSession();
            synchronized (ssn) {
                ssn.setAttribute("id", username);
                ssn.setAttribute("password", password);
            }
            response.sendRedirect("home/indexUtente.html");
        }else{
            response.sendRedirect("resources/view/Login/ErroreLogin.html");
        }


    }
}

