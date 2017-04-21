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
import model.Lab;
import model.Login;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rishabh
 */
public class labreg extends HttpServlet {

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
        try  {
             String path="refresh_page.jsp";
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            
            Addressdetails ad = new Addressdetails();
            ad.setLine1(request.getParameter("line1"));
            ad.setLine2(request.getParameter("line2"));
            ad.setCity(request.getParameter("city"));
            ad.setState(request.getParameter("state"));
            ad.setPincode(request.getParameter("pincode"));
            ss.save(ad);
            
            Login lo = new Login();
            lo.setUsername(request.getParameter("user_id"));
            lo.setPassword(request.getParameter("password"));
            lo.setRole("Laboratory");
            ss.save(lo);
            
            
            Lab la = new Lab();
            la.setLabName(request.getParameter("lab_name"));
            la.setWebsite(request.getParameter("website"));
            la.setContactNum(request.getParameter("cont_num"));
            la.setAddressid(ad);
            la.setStatus("not Active");
            la.setUserId(lo);
            ss.save(la);
            
            tr.commit();
            
            
             RequestDispatcher rd = request.getRequestDispatcher(path);
              rd.forward(request, response);
            
            
            out.println("success");
            
        }
        
        catch(HibernateException he)
        {
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
