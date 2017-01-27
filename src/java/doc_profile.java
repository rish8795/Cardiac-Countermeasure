/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Addressdetails;
import model.Doctor;
import model.Patient;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rishabh
 */
public class doc_profile extends HttpServlet {

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
            Session ss1 = sf.openSession();
            Transaction tr1 = ss1.beginTransaction();
           // tr1.begin();
            HttpSession hs = request.getSession(true);
            if (hs.getAttribute("doctor") != null) {

                Doctor pi = (Doctor) hs.getAttribute("doctor");
                if (request.getParameter("btn_update") != null) {

                    Doctor dd= (Doctor)ss1.get(Doctor.class, pi.getDId());
                    
                    Addressdetails ad = dd.getAddressid();
                    String line = request.getParameter("line1");
                    ad.setLine1(line.trim());
                    ad.setLine2(request.getParameter("line2").trim());
                    ad.setPincode(request.getParameter("pincode").trim());
                    ss1.saveOrUpdate(ad);

                    dd.setDFirstname(request.getParameter("p_firstname").trim());
                    dd.setDLastname(request.getParameter("p_lastname").trim());
                    dd.setGender(request.getParameter("gender").trim());
                    dd.setBirthDate(request.getParameter("birth_date").trim());
                    dd.setContactnum(request.getParameter("contact_num").trim());
                    dd.setEmailId(request.getParameter("email_id").trim());

                    ss1.saveOrUpdate(dd);
                    pi=dd;
                }
                tr1.commit();
                request.setAttribute("pdata", pi);
                RequestDispatcher rd = request.getRequestDispatcher("Doctor_myprofile.jsp");
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
