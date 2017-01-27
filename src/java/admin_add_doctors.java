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
import model.Admin;
import model.Doctor;
import model.DoctorAppointment;
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
public class admin_add_doctors extends HttpServlet {

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
        
        try
        {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            HttpSession hs = request.getSession();
            if (hs.getAttribute("admin") != null)
            {
                Admin a = (Admin) hs.getAttribute("admin");
            
                 if (request.getParameter("status") != null && request.getParameter("dId") != null) {

                    int apid = Integer.parseInt(request.getParameter("dId"));
                    Doctor doc1 = (Doctor) ss.get(Doctor.class, apid);
                    if (request.getParameter("status").equals("approve")) {

                        doc1.setStatus("ACTIVE");
                        
                        ss.update(doc1);

                        String subject = "Your Appointment is Approved.!";
                        String content = "Hi, Dr." + doc1.getDFirstname() +" " +doc1.getDLastname()+"\n" + "Your Request has been approved by Admin"  + ".\n";
                        String mail = doc1.getEmailId();

                        String[] recipients = new String[]{mail};
                        //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                        if (new MailUtil().sendMail(recipients, subject, content)) {

                        }
                        request.setAttribute("msg", "Appointment accepted..!");

                    } else if (request.getParameter("status").equals("reject")) {
                        doc1.setStatus("REJECTED");
                        ss.update(doc1);
                        String subject = "Your Request is Rejected.!";
                        String content = "Hi, " + doc1.getDFirstname() + " "+doc1.getDLastname()
                                + "Your Request to join Cardiac Countermeasure has been rejected by admin" + ".\n anil ";
                        String mail = doc1.getEmailId();

                        String[] recipients = new String[]{mail};
                        //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                        if (new MailUtil().sendMail(recipients, subject, content)) {

                        }
                        request.setAttribute("msg", "Appointment rejected..!");
                    }

                }

                Criteria cr = ss.createCriteria(Doctor.class);
                //cr.add(Restrictions.eq("dId", a));
                cr.add(Restrictions.eq("status", "not_active"));
                ArrayList<Doctor> da = (ArrayList<Doctor>) cr.list();
                if (da.size() > 0) {
                    request.setAttribute("da", da);
                }

                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("admin_add_doctors.jsp");
                rd.forward(request, response);
            } else {
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
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
