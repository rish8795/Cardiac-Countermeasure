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
import model.Addressdetails;
import model.Doctor;
import model.Login;
import model.Qualification;
import model.Speciality;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rishabh
 */
public class docreg extends HttpServlet {

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
            String path="refresh_page.jsp";
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            
            Speciality sp = new Speciality();
            sp.setSpecName(request.getParameter("spec_name"));
            ss.save(sp);
            
            Qualification qf = new Qualification();
            qf.setQualificationName(request.getParameter("qualification_name"));
            ss.save(qf);
            
            Addressdetails ad = new Addressdetails();
            ad.setLine1(request.getParameter("line1"));
            ad.setLine2(request.getParameter("line2"));
            ad.setState(request.getParameter("state"));
            ad.setCity(request.getParameter("city"));
            ad.setPincode(request.getParameter("pincode"));
            ss.save(ad);
            
            Login lo = new Login();
            lo.setUsername(request.getParameter("user_id"));
            lo.setPassword(request.getParameter("password"));
            lo.setRole("doctor");
            ss.save(lo);
            
            Doctor dc = new Doctor();
            dc.setDFirstname(request.getParameter("d_firstname"));
            dc.setDLastname(request.getParameter("d_lastname"));
            dc.setEmailId(request.getParameter("email_id"));
            dc.setContactnum(request.getParameter("Cont_num"));
            dc.setGender(request.getParameter("gender"));
            dc.setStatus("not_active");
            dc.setBirthDate(request.getParameter("birth_date"));
            dc.setAddressid(ad);
            dc.setQualificationId(qf);
            dc.setSpecialityId(sp);
            dc.setUserId(lo);
            ss.save(dc);
            
            
            
            tr.commit();
            
               RequestDispatcher rd = request.getRequestDispatcher(path);
              rd.forward(request, response);
            
            out.println("success");
        }
        
        catch(Exception e)
        {
            out.println(e.getMessage());
        }
        
        finally {
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
