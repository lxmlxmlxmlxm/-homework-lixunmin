package com_nf.web;


import com_nf.dao.PhoneIM;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/PhoneDe")
public class PhoneDe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int s= Integer.parseInt(req.getParameter("id"));
        PhoneIM p=new PhoneIM();
        p.delete(s);
        resp.sendRedirect("/index.jsp");

    }
}
