/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DoctorAppointment;
import model.Login;
import model.Patient;
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
public class changepassword extends HttpServlet {

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
        String original_password = null;
        try {

            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.getCurrentSession();
            Transaction tr = ss.beginTransaction();
            HttpSession hs = request.getSession();

            String old_password = request.getParameter("current");
            String new_password = request.getParameter("new");

            if (hs.getAttribute("patient") != null) {

                Patient p1 = (Patient) hs.getAttribute("patient");
                Login l1 = (Login) ss.get(Login.class, p1.getUsedId().getUserId());
                original_password = l1.getPassword();
               // out.println(original_password);

                if (original_password.equals(old_password)) {

                    l1.setPassword(new_password);
                    ss.update(l1);
                    
                    p1.setUsedId(l1);
                    hs.setAttribute("patient", p1);
                    //  hs.setAttribute("patient", l1);
                    tr.commit();
                    request.setAttribute("msg", "Your password is updated.!");
                    RequestDispatcher rd = request.getRequestDispatcher("changepassword_patient.jsp");
                    rd.forward(request, response);

                }
                else
                {
                    request.setAttribute("msg1", "enter your current password correctly");
                     RequestDispatcher rd = request.getRequestDispatcher("changepassword_patient.jsp");
                    rd.forward(request, response);
                    
                }
            } else {
                tr.commit();
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
