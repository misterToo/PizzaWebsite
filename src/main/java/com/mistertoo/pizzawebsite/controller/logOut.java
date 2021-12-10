package com.mistertoo.pizzawebsite.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Log Out Servlet
 */
@WebServlet(name = "logOut", value = "/logOut")
public class logOut extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //grab and invalidate session
        HttpSession session = request.getSession(false);
        logger.info("Logging out " + session.getAttribute("userName"));
        session.invalidate();

        //redirect to home
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);

    }
}
