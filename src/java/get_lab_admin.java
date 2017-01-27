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
import model.Lab;
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
public class get_lab_admin extends HttpServlet {

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
        
        try{
          
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            String code = "";

            Criteria cr = ss.createCriteria(Lab.class);
            ArrayList<Lab> all = (ArrayList<Lab>) cr.list();
            
            Criteria cr1 = ss.createCriteria(Lab.class);
             cr1.add(Restrictions.eq("status", "ACTIVE"));
            if (request.getParameter("sort") != null) {
                String so = request.getParameter("sort");
                if (so.equals("1")) {
                    cr1.addOrder(Order.asc("labName"));
                } else if (so.equals("2")) {
                    cr1.addOrder(Order.desc("labName"));
                }
                //.add( Restrictions.like("name", "F%")
                //.addOrder( Order.asc("name") )
                //.addOrder( Order.desc("age") )
                //.setMaxResults(50)

//                cr.add(Restrictions.eq("password", request.getParameter("password")));
            }
            if (request.getParameter("search") != null) {
                String so = request.getParameter("search");
                cr1.add(Restrictions.like("labName", so + "%"));
            }
            ArrayList<Lab> all1 = (ArrayList<Lab>) cr1.list();
            if (all1.size() > 0) {
                for (int i = 0; i < all1.size(); i++) {
                    Lab dd = all1.get(i);
                    out.println("<li class=\"author-comments\" style=\"margin-top: 36px\">\n"
                            + "                                <div class=\"media\">\n"
                            + "                                    <div class=\"media-left\">    \n"
                            + "                                        <img alt=\"img\" src=\"images/Lab-Icon-245x300.png\" class=\"media-object news-img\">      \n"
                            + "                                    </div>\n"
                            + "                                    <div class=\"media-body\">\n"
                            + "                                        <h4 class=\"author-name\">" + dd.getLabName() + "</h4>\n"
                            + "                                        <a target='_blank' href='http://" + dd.getWebsite() + "'> <span class=\"comments-date\">" + dd.getWebsite() + "</span> </a>\n"
                            + "                                        <p>" + dd.getAddressid().getCityId().getCityName() + "</p>\n"
                            + "                                        <p>" + dd.getStatus() + "</p>\n"
                            + "                                        <div class=\"ui heart rating\" data-rating=\"1\" data-max-rating=\"3\"></div>\n"
                            + "                                        <a class=\"reply-btn\" href=\"view_labprofile_admin?lid=" + dd.getLId() + "\">View Profile</a>\n"
                            + "                                    </div>\n"
                            + "                                </div>\n"
                            + "                            </li>");
                }

          
        }
            request.setAttribute("dlist", all);
        
        }
        
        catch(HibernateException he)
        {
            out.println(he.getMessage());
        }
        finally
        {
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
