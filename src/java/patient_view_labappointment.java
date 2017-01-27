/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DoctorAppointment;
import model.LabAppointment;
import model.Patient;
import model.PatienttestDetail;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rishabh
 */
public class patient_view_labappointment extends HttpServlet {

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
            Session ss = sf.getCurrentSession();
            Transaction tr = ss.beginTransaction();
            HttpSession hs = request.getSession();

            if (hs.getAttribute("patient") != null) {

                Patient p1 = (Patient) hs.getAttribute("patient");

                Criteria cr = ss.createCriteria(LabAppointment.class);
                cr.add(Restrictions.eq("pId", p1));
                ArrayList<LabAppointment> la = (ArrayList<LabAppointment>) cr.list();
                if (la.size() > 0) {
                    ArrayList<ArrayList<PatienttestDetail>> testarray = new ArrayList<ArrayList<PatienttestDetail>>(la.size());
                    for (int i = 0; i < la.size(); i++) {
                        LabAppointment la1 = la.get(i);
                        Criteria cr1 = ss.createCriteria(PatienttestDetail.class);
                        cr1.add(Restrictions.eq("laId", la1));
                        ArrayList<PatienttestDetail> tests = (ArrayList<PatienttestDetail>) cr1.list();
                        testarray.add(tests);
                    }
                    request.setAttribute("la", la);
                    if (testarray.size() > 0) {
                        request.setAttribute("ptest", testarray);
                    }

                    System.out.println(testarray);
                }
                RequestDispatcher rd = request.getRequestDispatcher("patient_view_labappointment.jsp");
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
