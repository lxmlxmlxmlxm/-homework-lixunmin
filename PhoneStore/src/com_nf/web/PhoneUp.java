package com_nf.web;

import com_nf.dao.PhoneIM;
import com_nf.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/PhoneUp")

public class PhoneUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
       int id = Integer.parseInt(req.getParameter("id"));
        PhoneIM phoneIM = new PhoneIM();
        Phone p =phoneIM.getPhoneById(id);
        req.setAttribute("phone", p);
        req.getRequestDispatcher("/jsp/phone_update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        int id= Integer.parseInt(req.getParameter("id"));
        double price = Double.parseDouble(req.getParameter("price"));
        Phone phone=new Phone(id,name,price);
        PhoneIM phoneIM = new PhoneIM();
        phoneIM.update(phone);
        resp.sendRedirect("/index.jsp");
    }
}
