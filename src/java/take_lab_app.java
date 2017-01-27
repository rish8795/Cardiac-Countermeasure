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
import model.Lab;
import model.LabAppointment;
import model.Labtest;
import model.Patient;
import model.PatienttestDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rishabh
 */
public class take_lab_app extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            HttpSession hs = request.getSession();
            if (hs.getAttribute("patient") != null) {
                
                
                
                if (request.getParameter("labid") != null) {
                    Patient p = (Patient) hs.getAttribute("patient");
                    int l1 = Integer.parseInt(request.getParameter("labid"));
                   
                    Lab l = new Lab(l1);
                    
                    String[] tlist = null;
                    if (request.getParameterValues("testlist") != null) {
                        tlist = request.getParameterValues("testlist");
                    
                    if (tlist.length > 0) {

                        LabAppointment lappo = new LabAppointment();
                        lappo.setPId(p);
                        lappo.setStatus("Pending");
                        
                        lappo.setLId(l);
                        ss.save(lappo);

                        for (int i = 0; i < tlist.length; i++) {
                            int ltid = Integer.parseInt(tlist[i]);
                            Labtest lt = new Labtest(ltid);
                            PatienttestDetail ptd = new PatienttestDetail();
                            ptd.setLtId(lt);
                            ptd.setLaId(lappo);
                            ss.save(ptd);
                        }
                    
                        request.setAttribute("msg", "Your Appointment has been booked..!");
//                        where it view list of his/her appointmmmmm
                        
                    }
                    }
                    else {
                        tr.commit();
                        request.setAttribute("msg", "Please select atlist one test.!");
                        System.out.println("Go Take test.!");
                        RequestDispatcher rd = request.getRequestDispatcher("take_test?labid="+request.getParameter("labid")+""); //take_test
                        rd.forward(request, response);
                    }
                }
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("consult_lab.jsp");
                rd.forward(request, response);

            } else {
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
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
