/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Blog;
import model.Doctor;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rishabh
 */
public class writeblog extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss1 = sf.getCurrentSession();
            Transaction tr1 = ss1.getTransaction();
            tr1.begin();
            HttpSession hs = request.getSession();
            if (hs.getAttribute("doctor") != null) {

                Doctor pi = (Doctor) hs.getAttribute("doctor");

                if (request.getParameter("subject") != null && request.getParameter("content") != null) {

                    String sub = request.getParameter("subject");
                    String con = request.getParameter("content");
                    request.setAttribute("msg", "Blog Created..!");
                    Blog b = new Blog();
                    if (request.getParameter("updateblogid") != null) {
                        b.setBlogId(Integer.parseInt(request.getParameter("updateblogid")));
                        request.setAttribute("msg", "Blog Updated..!");
                    }
                    b.setBlogname(sub);
                    b.setBlogdescription(con);
                    b.setDId(pi);
                    b.setBlogView(20);
                    b.setImageUrl("abc.jpg");
                    b.setBlogDate(new Date().toString());
                    ss1.saveOrUpdate(b);
                }

                if (request.getParameter("blogid") != null) {

                    Blog b = (Blog) ss1.get(Blog.class, Integer.parseInt(request.getParameter("blogid")));
                    request.setAttribute("editblog", b);
                }

                Criteria cr1 = ss1.createCriteria(Blog.class);
                cr1.add(Restrictions.eq("dId", pi));
                ArrayList<Blog> dblog = (ArrayList<Blog>) cr1.list();
                if (dblog.size() > 0) {
                    request.setAttribute("dblog", dblog);
                }

                tr1.commit();
                RequestDispatcher rd = request.getRequestDispatcher("doctor_write_blog1.jsp");
                rd.forward(request, response);

            } else {
                tr1.commit();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }

        } catch (HibernateException he) {
            out.println(he.getMessage());
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
