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
public class doc_view_approved_appointment extends HttpServlet {

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
            HttpSession hs = request.getSession();

            if (hs.getAttribute("doctor") != null) {
                Doctor a = (Doctor) hs.getAttribute("doctor");

                if (request.getParameter("status") != null && request.getParameter("appoid") != null) {

                    int apid = Integer.parseInt(request.getParameter("appoid"));
                    DoctorAppointment doc1 = (DoctorAppointment) ss.get(DoctorAppointment.class, apid);
                    if (request.getParameter("status").equals("cancel")) {
                        doc1.setStatus("CANCELLED");
                        ss.update(doc1);
                        
                        String subject = "Appointment Canceled.!";
                        String content = "Hi, " + doc1.getPId().getPFirstname() + " "
                                + "Your appointment has been Canceled by Dr." + doc1.getDId().getDFirstname() +" due to some reasons and we are sorry for that kindly take new appointment ASAP."+ ".\n ";
                        String mail = doc1.getPId().getEmailId();

                        String[] recipients = new String[]{mail};
                        //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                        if (new MailUtil().sendMail(recipients, subject, content)) {

                        }
                        request.setAttribute("msg", "Appointment cancelled..!");
                    } else if (request.getParameter("status").equals("update")) {
//                        doc1.setStatus("CANCELLED");
                        doc1.setDate(request.getParameter("apdate"));
                        doc1.setTime(request.getParameter("aptime"));
                        ss.update(doc1);
                        
                        String subject = "Appointment time changed.!";
                        String content = "Hi, " + doc1.getPId().getPFirstname() + " "
                                + "Your appointment has been rescheduled by Dr." + doc1.getDId().getDFirstname() +" due to some reasons kindly note new time"+"  "+ "Date : " + doc1.getDate()+"\n" 
                                + "Time : " + doc1.getTime()+"\n";
                        String mail = doc1.getPId().getEmailId();

                        String[] recipients = new String[]{mail};
                        //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                        if (new MailUtil().sendMail(recipients, subject, content)) {

                        }
                        request.setAttribute("msg", "Appointment Updated..!");
                    }

                }

                Criteria cr = ss.createCriteria(DoctorAppointment.class);
                cr.add(Restrictions.eq("dId", a));
                cr.add(Restrictions.eq("status", "APPROVED"));
                ArrayList<DoctorAppointment> da = (ArrayList<DoctorAppointment>) cr.list();
                if (da.size() > 0) {
                    request.setAttribute("da", da);
                }

                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("doc_approved_appointment.jsp");
                rd.forward(request, response);
            } else {
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }

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
