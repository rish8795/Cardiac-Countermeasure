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
public class forgotpassword extends HttpServlet {

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
            String mail = request.getParameter("mail");
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Transaction tr = s.beginTransaction();

            Criteria c = s.createCriteria(Patient.class);
            c.add(Restrictions.eq("emailId", mail));
            ArrayList<Patient> al = (ArrayList<Patient>) c.list();
            
            String name = "";
            if (al.size() > 0) {
                Patient p = al.get(0);
                Login l = p.getUsedId();
                name = l.getPassword();

                //name=l.getPassword();
                System.out.println("---------------------" + name);
                String subject = "Forgot Password - Cardiac:";
                String content = "Your password" + name;

                String[] recipients = new String[]{mail};
                //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                if (new MailUtil().sendMail(recipients, subject, content)) {
                     RequestDispatcher rd = request.getRequestDispatcher("forgetpassword_refresh.jsp");
                    rd.forward(request, response);
                }
            } else {
                
                String msg = "plz enter the correct email";
                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("forgotpassword.jsp");
                rd.forward(request, response);
            }
            tr.commit();
        } catch (HibernateException he) {
            out.println(he.getMessage());
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
