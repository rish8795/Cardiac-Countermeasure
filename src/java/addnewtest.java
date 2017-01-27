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
import model.Lab;
import model.Labtest;
import model.Login;
import model.Test;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class addnewtest extends HttpServlet {

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
            if (hs.getAttribute("lab") != null) {
                Lab lb = (Lab) hs.getAttribute("lab");

                if (request.getParameter("price") != null && request.getParameter("tid") != null) {
                    int tid = Integer.parseInt(request.getParameter("tid"));
                    Double price = Double.parseDouble(request.getParameter("price"));
                    Labtest lt = new Labtest();
                    lt.setLId(lb);
                    lt.setTId(new Test(tid));
                    lt.setTestFees(price);
                    ss.save(lt);
                    request.setAttribute("msg", "Test added to your test list.!");
                }

                Criteria cr = ss.createCriteria(Test.class);
                ArrayList<Test> alltest = (ArrayList<Test>) cr.list();
                ArrayList<Test> alltest1 =alltest; 
                if (alltest.size() > 0) {
                    Criteria cr1 = ss.createCriteria(Labtest.class);
                    cr1.add(Restrictions.eq("lId", lb));
                    ArrayList<Labtest> ltest = (ArrayList<Labtest>) cr1.list();
                    if (ltest.size() > 0) {
                        for (int i = 0; i < ltest.size(); i++) {
                            for (int j = 0; j < alltest.size(); j++) {
                                if (ltest.get(i).getTId().equals(alltest.get(j))) {
                                    alltest1.remove(j);
                                }
                            }
                        }
                    }
                    request.setAttribute("alltest", alltest1);
                }
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("lab_addnewtest.jsp");
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
