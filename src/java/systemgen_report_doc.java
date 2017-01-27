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
import model.AbsoluteRiskFemale;
import model.AbsulateRiskMale;
import model.Calculationmeteredata;
import model.FactorDetails;
import model.FactorOption;
import model.Patient;
import model.PatientfactorAnswer;
import model.TestRecommend;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rishabh
 */
public class systemgen_report_doc extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            HttpSession hs = request.getSession();

           
            if(hs.getAttribute("doctor") != null)
            {
                Patient p1 = (Patient) hs.getAttribute("patient");
                if (request.getParameter("calcid") != null) {

                    int calcid = Integer.parseInt(request.getParameter("calcid"));

                    Calculationmeteredata cm1 = (Calculationmeteredata) ss.get(Calculationmeteredata.class, calcid);
                    String color = "red";

                    if (cm1.getCalculationmeteredataId() != null) {

                        String gender = "MALE";
                        Criteria optcr = ss.createCriteria(PatientfactorAnswer.class);
                        optcr.add(Restrictions.eq("calculationmeteredataId", cm1));
                        ArrayList<PatientfactorAnswer> anslist = (ArrayList<PatientfactorAnswer>) optcr.list();
                        if (anslist.size() > 0) {

                            FactorOption agefac = new FactorOption();
                            for (PatientfactorAnswer opp : anslist) {
                                if (opp.getFactorId().equals(new FactorDetails(1))) {
                                    if (opp.getFactorOptionId().getFoptionId().equals(16)) {
                                        gender = "FEMALE";
                                    }
                                    System.out.println("Gender is :" + gender + opp.getFactorOptionId());
                                }
                                if (opp.getFactorId().equals(new FactorDetails(2))) {
                                    agefac = opp.getFactorOptionId();
                                    System.out.println("Age is :" + agefac.getFactorOption());
                                }
                            }
                            if (gender.equals("MALE")) {
//                        Set Chart Data   
                                String[] chartdata = new String[4];
                                String[] rchartdata = new String[4];

                                Criteria cr01 = ss.createCriteria(AbsulateRiskMale.class);
                                cr01.add(Restrictions.eq("foptionid", agefac));
                                cr01.setProjection(Projections.max("green"));
                                if (cr01.uniqueResult() != null) {
                                    chartdata[0] = cr01.uniqueResult().toString();
                                    int cdata = Integer.parseInt(chartdata[0]);
                                    if (cdata >= cm1.getMetervalue()) {
                                        color = "green";
                                    }
                                }
                                Criteria cr02 = ss.createCriteria(AbsulateRiskMale.class);
                                cr02.add(Restrictions.eq("foptionid", agefac));
                                cr02.setProjection(Projections.max("violet"));
                                if (cr02.uniqueResult() != null) {
                                    chartdata[1] = cr02.uniqueResult().toString();
                                    int cdata = Integer.parseInt(chartdata[1]);
                                    if (cdata >= cm1.getMetervalue()) {
                                        color = "violet";
                                    }
                                }
                                System.out.println(chartdata[1]);
                                System.out.println(color);
                                Criteria cr03 = ss.createCriteria(AbsulateRiskMale.class);
                                cr03.add(Restrictions.eq("foptionid", agefac));
                                cr03.setProjection(Projections.max("yellow"));
                                if (cr03.uniqueResult() != null) {
                                    chartdata[2] = cr03.uniqueResult().toString();
                                    int cdata = Integer.parseInt(chartdata[2]);
                                    if (cdata >= cm1.getMetervalue()) {
                                        color = "yellow";
                                    }
                                }
                                chartdata[3] = "54";
                                
//                                RchartData create
                                Criteria cr010 = ss.createCriteria(AbsulateRiskMale.class);
                                cr010.add(Restrictions.eq("foptionid", agefac));
                                cr010.setProjection(Projections.max("rGreen"));
                                if (cr010.uniqueResult() != null) {
                                    rchartdata[0] = cr010.uniqueResult().toString();
                                }
                                Criteria cr020 = ss.createCriteria(AbsulateRiskMale.class);
                                cr020.add(Restrictions.eq("foptionid", agefac));
                                cr020.setProjection(Projections.max("rViolet"));
                                if (cr020.uniqueResult() != null) {
                                    rchartdata[1] = cr020.uniqueResult().toString();
                                    
                                }
                                System.out.println(chartdata[1]);
                                System.out.println(color);
                                Criteria cr030 = ss.createCriteria(AbsulateRiskMale.class);
                                cr030.add(Restrictions.eq("foptionid", agefac));
                                cr030.setProjection(Projections.max("rYellow"));
                                if (cr030.uniqueResult() != null) {
                                    rchartdata[2] = cr030.uniqueResult().toString();
                                   
                                }
                                rchartdata[3] = "30";

                                request.setAttribute("rchartdata", rchartdata);
                                request.setAttribute("chartdata", chartdata);

                            } else if (gender.equals("FEMALE")) {
//                        Set Chart Data   
                                String[] chartdata = new String[4];
                                String[] rchartdata = new String[4];
                                
                                Criteria cr01 = ss.createCriteria(AbsoluteRiskFemale.class);
                                cr01.add(Restrictions.eq("foptionid", agefac));
                                cr01.setProjection(Projections.max("green"));
                                if (cr01.uniqueResult() != null) {
                                    chartdata[0] = cr01.uniqueResult().toString();
                                    int cdata = Integer.parseInt(chartdata[0]);
                                    if (cdata >= cm1.getMetervalue()) {
                                        color = "green";
                                    }
                                }
                                Criteria cr02 = ss.createCriteria(AbsoluteRiskFemale.class);
                                cr02.add(Restrictions.eq("foptionid", agefac));
                                cr02.setProjection(Projections.max("violet"));
                                if (cr02.uniqueResult() != null) {
                                    chartdata[1] = cr02.uniqueResult().toString();
                                    int cdata = Integer.parseInt(chartdata[1]);
                                    if (cdata >= cm1.getMetervalue()) {
                                        color = "violet";
                                    }
                                }
                                Criteria cr03 = ss.createCriteria(AbsoluteRiskFemale.class);
                                cr03.add(Restrictions.eq("foptionid", agefac));
                                cr03.setProjection(Projections.max("yellow"));
                                if (cr03.uniqueResult() != null) {
                                    chartdata[2] = cr03.uniqueResult().toString();
                                    int cdata = Integer.parseInt(chartdata[2]);
                                    if (cdata >= cm1.getMetervalue()) {
                                        color = "yellow";
                                    }
                                }
                                chartdata[3] = "30";
                                
//                                RchartData create
                                Criteria cr010 = ss.createCriteria(AbsoluteRiskFemale.class);
                                cr010.add(Restrictions.eq("foptionid", agefac));
                                cr010.setProjection(Projections.max("rGreen"));
                                if (cr010.uniqueResult() != null) {
                                    rchartdata[0] = cr010.uniqueResult().toString();
                                }
                                Criteria cr020 = ss.createCriteria(AbsoluteRiskFemale.class);
                                cr020.add(Restrictions.eq("foptionid", agefac));
                                cr020.setProjection(Projections.max("rViolet"));
                                if (cr020.uniqueResult() != null) {
                                    rchartdata[1] = cr020.uniqueResult().toString();
                                    
                                }
                                System.out.println(chartdata[1]);
                                System.out.println(color);
                                Criteria cr030 = ss.createCriteria(AbsoluteRiskFemale.class);
                                cr030.add(Restrictions.eq("foptionid", agefac));
                                cr030.setProjection(Projections.max("rYellow"));
                                if (cr030.uniqueResult() != null) {
                                    rchartdata[2] = cr030.uniqueResult().toString();
                                   
                                }
                                rchartdata[3] = "20";

                                request.setAttribute("rchartdata", rchartdata);
                                request.setAttribute("chartdata", chartdata);
                            }
                            Criteria testcr = ss.createCriteria(TestRecommend.class);
                            testcr.add(Restrictions.eq("color", color));
                            ArrayList<TestRecommend> tlist = (ArrayList<TestRecommend>) testcr.list();
                            if (tlist.size() > 0) {
                                request.setAttribute("testlist", tlist);
                            }

                            request.setAttribute("calcdata", cm1);
                            request.setAttribute("anslist", anslist);
                        }
                    }
                    tr.commit();
                    RequestDispatcher rd = request.getRequestDispatcher("doctor_view_systemreport_full.jsp");
                    rd.forward(request, response);
                }
            }
            else{
                
                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        }
        
        catch(HibernateException he){
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
