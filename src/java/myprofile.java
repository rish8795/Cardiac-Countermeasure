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
import model.Patient;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rishabh
 */
public class myprofile extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            SessionFactory sf = HibernateUtil.getSessionFactory();
                    Session ss1 = sf.getCurrentSession();
            Transaction tr1 = ss1.getTransaction();
            tr1.begin();
            HttpSession hs = request.getSession();
            if (hs.getAttribute("patient") != null) {
                
                Patient pi = (Patient) hs.getAttribute("patient");
                if (request.getParameter("btn_update") != null) {
                    
                    Addressdetails ad = pi.getAddressid();
                    String line = request.getParameter("line1");
                    ad.setLine1(line.trim());
                    ad.setLine2(request.getParameter("line2").trim());
                    ad.setPincode(request.getParameter("pincode").trim());
                    ss1.update(ad);
                    
                    pi.setPFirstname(request.getParameter("p_firstname").trim());
                    pi.setPLastname(request.getParameter("p_lastname").trim());
                    pi.setGender(request.getParameter("gender").trim());
                    pi.setBirthDate(request.getParameter("birth_date").trim());
                    pi.setContactNum(request.getParameter("contact_num").trim());
                    pi.setEmailId(request.getParameter("email_id").trim());

                    ss1.update(pi);
                    tr1.commit();
                     hs.setAttribute("patient",pi);
                      request.setAttribute("pdata", pi); 
                     RequestDispatcher rd = request.getRequestDispatcher("patient_myprofile.jsp");
                rd.forward(request, response);
                }
                
                else
                {
                   
                request.setAttribute("pdata", pi);                
                RequestDispatcher rd = request.getRequestDispatcher("patient_myprofile.jsp");
                rd.forward(request, response);
                }
            } else {
                
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
