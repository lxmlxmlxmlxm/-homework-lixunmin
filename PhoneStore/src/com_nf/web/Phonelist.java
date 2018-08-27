package com_nf.web;

import com_nf.dao.PhoneDao;
import com_nf.dao.PhoneIM;
import com_nf.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//@WebServlet("/index")

public class Phonelist extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PhoneDao p = new PhoneIM();
        List<Phone> phone=p.listAll();
        req.setAttribute("phone",phone);
        req.getRequestDispatcher("/jsp/phone_list.jsp").forward(req, resp);
    }
}
