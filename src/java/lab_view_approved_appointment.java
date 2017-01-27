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
import model.Lab;
import model.LabAppointment;
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
public class lab_view_approved_appointment extends HttpServlet {

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
            HttpSession hs = request.getSession();

            if (hs.getAttribute("lab") != null) {
                Lab a = (Lab) hs.getAttribute("lab");

                if (request.getParameter("status") != null && request.getParameter("appoid") != null) {

                    int apid = Integer.parseInt(request.getParameter("appoid"));
                    LabAppointment lab1 = (LabAppointment) ss.get(LabAppointment.class, apid);
                    if (request.getParameter("status").equals("cancel")) {
                        lab1.setStatus("CANCELLED");
                        ss.update(lab1);
                        request.setAttribute("msg", "Appointment cancelled..!");
                    } else if (request.getParameter("status").equals("update")) {
//                        doc1.setStatus("CANCELLED");
                        lab1.setDate(request.getParameter("apdate"));
                        lab1.setTime(request.getParameter("aptime"));
                        ss.update(lab1);
                        request.setAttribute("msg", "Appointment Updated..!");
                    }

                }

                Criteria cr = ss.createCriteria(LabAppointment.class);
                cr.add(Restrictions.eq("lId", a));
                cr.add(Restrictions.eq("status", "APPROVED"));
                ArrayList<LabAppointment> da = (ArrayList<LabAppointment>) cr.list();
                if (da.size() > 0) {
                    request.setAttribute("da", da);
                }

                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("Lab_Approved_appointment.jsp");
                rd.forward(request, response);
            } else {
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }

            
            
        }
        
        catch(HibernateException he)
        {
            he.getMessage();
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
