/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Doctor;
import model.Login;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rishabh
 */
public class getdoctor extends HttpServlet {

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
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            String code = "";

            Criteria cr = ss.createCriteria(Doctor.class);

            ArrayList<Doctor> all = (ArrayList<Doctor>) cr.list();

            Criteria cr1 = ss.createCriteria(Doctor.class);
            cr1.add(Restrictions.eq("status", "ACTIVE"));
            if (request.getParameter("sort") != null) {
                String so = request.getParameter("sort");
                if (so.equals("1")) {
                    cr1.addOrder(Order.asc("dFirstname"));
                } else if (so.equals("2")) {
                    cr1.addOrder(Order.desc("dFirstname"));
                }
                //.add( Restrictions.like("name", "F%")
                //.addOrder( Order.asc("name") )
                //.addOrder( Order.desc("age") )
                //.setMaxResults(50)

//                cr.add(Restrictions.eq("password", request.getParameter("password")));
            }
            if (request.getParameter("search") != null) {
                String so = request.getParameter("search");
                cr1.add(Restrictions.like("dFirstname", so + "%"));
            }
            ArrayList<Doctor> all1 = (ArrayList<Doctor>) cr1.list();
            if (all1.size() > 0) {
                for (int i = 0; i < all1.size(); i++) {
                    Doctor dd = all1.get(i);
                    out.println("<li class=\"author-comments\" style=\"margin-top: 36px\">\n"
                            + "                                <div class=\"media\">\n"
                            + "                                    <div class=\"media-left\">    \n"
                            + "                                        <img alt=\"img\" src=\"images/doctor-2.jpg\" class=\"media-object news-img\">      \n"
                            + "                                    </div>\n"
                            + "                                    <div class=\"media-body\">\n"
                            + "                                        <h4 class=\"author-name\">Dr. " + dd.getDFirstname() + " " + dd.getDLastname() + "</h4>\n"
                            + "                                        <span class=\"comments-date\"> " + dd.getQualificationId().getQualificationName() + "</span>\n"
                            + "                                        <p>" + dd.getAddressid().getCityId().getCityName().toString() + "</p>\n"
                            + "                                        <p class=\"fa fa-check-circle\" style=\"color: green\">" + dd.getStatus() + "</p>\n"
                            + "                                        <div class=\"ui heart rating\" data-rating=\"1\" data-max-rating=\"3\"></div>\n"
                            + "                                        <a class=\"reply-btn\" href=\"take_doc_app?docid=" + dd.getDId() + "\">Take Appointment</a>\n"
                            + "                                    </div>\n"
                            + "                                </div>\n"
                            + "                            </li>");
                }
            }
                    //   request.setAttribute("dlist", all);

        } catch (HibernateException he) {

            he.getMessage();

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
