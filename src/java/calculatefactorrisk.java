/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AbsoluteRiskFemale;
import model.AbsulateRiskMale;
import model.Calculationmeteredata;
import model.DoctorAppointment;
import model.FactorDetails;
import model.FactorOption;
import model.Patient;
import model.PatientfactorAnswer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rishabh
 */
public class calculatefactorrisk extends HttpServlet {

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

                Patient p1 = (Patient) hs.getAttribute("patient");
                int metervalue = 0;
                double rmetervalue = 0;
                int facindex = 0;
                int points = 0;
                String[] chartdata = new String[4];
                chartdata[0] = "5";
                chartdata[1] = "12";
                chartdata[2] = "25";
                chartdata[3] = "60";
                ArrayList<PatientfactorAnswer> finalans = new ArrayList<PatientfactorAnswer>();

                if (request.getParameter("facindex") != null && request.getParameter("ans") != null) {

                    if (hs.getAttribute("metervalue") != null) {
                        metervalue = (Integer) hs.getAttribute("metervalue");
                    }
                    if (hs.getAttribute("finalans") != null) {
                        finalans = (ArrayList<PatientfactorAnswer>) hs.getAttribute("finalans");
                    }
                    if (request.getParameter("ans").equals("15")) {
                        hs.setAttribute("gender", "MALE");
                        hs.setAttribute("agefactor", null);
                    }
                    if (request.getParameter("ans").equals("16")) {
                        hs.setAttribute("gender", "FEMALE");
                        hs.setAttribute("agefactor", null);
                    }

                    facindex = Integer.parseInt(request.getParameter("facindex"));
                    if (request.getParameter("next") != null) {

                        int ansid = Integer.parseInt(request.getParameter("ans"));
                        FactorOption ansfo = (FactorOption) ss.get(FactorOption.class, ansid);
                        if (ansfo.getFactorId().equals(new FactorDetails(2))) {
                            hs.setAttribute("agefactor", ansfo);
                        }

                        PatientfactorAnswer currentans = new PatientfactorAnswer();
                        currentans.setFactorId(ansfo.getFactorId());
                        currentans.setFactorOptionId(ansfo);
                        currentans.setPId(p1);

                        if (finalans.size() > 0) {
                            ArrayList<PatientfactorAnswer> finalans1 = finalans;
                            for (int i1 = 0; i1 < finalans1.size(); i1++) {
                                PatientfactorAnswer c1 = finalans.get(i1);
                                if (c1.getFactorId().equals(currentans.getFactorId())) {
                                    finalans.remove(i1);
                                }
                            }
                        }
                        finalans.add(facindex, currentans);

//                        System.out.println(finalans.get(0).getFactorOptionId());
//                        System.out.println(finalans.get(1).getFactorOptionId());
//                        System.out.println(finalans.get(2).getFactorOptionId());
                        System.out.println("size : " + finalans.size());
                        facindex = facindex + 1;
                    } else if (request.getParameter("prev") != null) {
                        if (facindex > 0) {
                            facindex = facindex - 1;
                        }
                    }

                    if (finalans.size() > 0) {
                        String gender = "MALE";
                        if (hs.getAttribute("gender") != null) {
                            gender = (String) hs.getAttribute("gender");
                        }
                        if (gender.equals("MALE") && hs.getAttribute("agefactor") != null) {

                            FactorOption agefac = (FactorOption) hs.getAttribute("agefactor");

                            for (PatientfactorAnswer c1 : finalans) {
                                points = points + c1.getFactorOptionId().getMen();
                            }
                            if (points < 0) {
                                points = 0;
                            }
                            if (points > 14) {
                                points = 14;
                            }
                            //                Count risk on point
                            Criteria cr2 = ss.createCriteria(AbsulateRiskMale.class);
                            cr2.add(Restrictions.eq("foptionid", agefac));
                            cr2.add(Restrictions.eq("point", points));
                            ArrayList<AbsulateRiskMale> riskdata = (ArrayList<AbsulateRiskMale>) cr2.list();
                            if (riskdata.size() > 0) {
                                AbsulateRiskMale risk = riskdata.get(0);
                                if (risk.getGreen() != null) {
                                    metervalue = risk.getGreen();
                                } else if (risk.getViolet() != null) {
                                    metervalue = risk.getViolet();
                                } else if (risk.getYellow() != null) {
                                    metervalue = risk.getYellow();
                                } else if (risk.getRed() != null) {
                                    metervalue = risk.getRed();
                                }
                                if (risk.getRGreen()!= null) {
                                    rmetervalue = risk.getRGreen();
                                } else if (risk.getRViolet() != null) {
                                    rmetervalue = risk.getRViolet();
                                } else if (risk.getRYellow() != null) {
                                    rmetervalue = risk.getRYellow();
                                } else if (risk.getRRed() != null) {
                                    rmetervalue = risk.getRRed();
                                }
//                                System.out.println("Risk data : " + risk);
                            }
                            System.out.println("Meter value : " + metervalue);
                            System.out.println("RMeter value : " + rmetervalue);
//                        Set Chart Data    
                            Criteria cr01 = ss.createCriteria(AbsulateRiskMale.class);
                            cr01.add(Restrictions.eq("foptionid", agefac));
                            cr01.setProjection(Projections.max("green"));
                            if (cr01.uniqueResult() != null) {
                                chartdata[0] = cr01.uniqueResult().toString();
                            }
                            Criteria cr02 = ss.createCriteria(AbsulateRiskMale.class);
                            cr02.add(Restrictions.eq("foptionid", agefac));
                            cr02.setProjection(Projections.max("violet"));
                            if (cr02.uniqueResult() != null) {
                                chartdata[1] = cr02.uniqueResult().toString();
                            }
                            Criteria cr03 = ss.createCriteria(AbsulateRiskMale.class);
                            cr03.add(Restrictions.eq("foptionid", agefac));
                            cr03.setProjection(Projections.max("yellow"));
                            if (cr03.uniqueResult() != null) {
                                chartdata[2] = cr03.uniqueResult().toString();
                            }
                            chartdata[3] = "54";
                        }
                        if (gender.equals("FEMALE") && hs.getAttribute("agefactor") != null) {

                            FactorOption agefac = (FactorOption) hs.getAttribute("agefactor");

                            for (PatientfactorAnswer c1 : finalans) {
                                points = points + c1.getFactorOptionId().getWomen();
                            }
                            if (points < 0) {
                                points = 0;
                            }
                            if (points > 17) {
                                points = 17;
                            }
                            //                Count risk on point
                            Criteria cr2 = ss.createCriteria(AbsoluteRiskFemale.class);
                            cr2.add(Restrictions.eq("foptionid", agefac));
                            cr2.add(Restrictions.eq("point", points));
                            ArrayList<AbsoluteRiskFemale> riskdata = (ArrayList<AbsoluteRiskFemale>) cr2.list();
                            if (riskdata.size() > 0) {
                                AbsoluteRiskFemale risk = riskdata.get(0);
                                if (risk.getGreen() != null) {
                                    metervalue = risk.getGreen();
                                } else if (risk.getViolet() != null) {
                                    metervalue = risk.getViolet();
                                } else if (risk.getYellow() != null) {
                                    metervalue = risk.getYellow();
                                } else if (risk.getRed() != null) {
                                    metervalue = risk.getRed();
                                }
                                if (risk.getRGreen()!= null) {
                                    rmetervalue = risk.getRGreen();
                                } else if (risk.getRViolet() != null) {
                                    rmetervalue = risk.getRViolet();
                                } else if (risk.getRYellow() != null) {
                                    rmetervalue = risk.getRYellow();
                                } else if (risk.getRRed() != null) {
                                    rmetervalue = risk.getRRed();
                                }
//                                System.out.println("Risk data : " + risk);
                            }
//                            System.out.println("Meter value : " + metervalue);
//                        Set Chart Data    
                            Criteria cr01 = ss.createCriteria(AbsoluteRiskFemale.class);
                            cr01.add(Restrictions.eq("foptionid", agefac));
                            cr01.setProjection(Projections.max("green"));
                            if (cr01.uniqueResult() != null) {
                                chartdata[0] = cr01.uniqueResult().toString();
                            }
                            Criteria cr02 = ss.createCriteria(AbsoluteRiskFemale.class);
                            cr02.add(Restrictions.eq("foptionid", agefac));
                            cr02.setProjection(Projections.max("violet"));
                            if (cr02.uniqueResult() != null) {
                                chartdata[1] = cr02.uniqueResult().toString();
                            }
                            Criteria cr03 = ss.createCriteria(AbsoluteRiskFemale.class);
                            cr03.add(Restrictions.eq("foptionid", agefac));
                            cr03.setProjection(Projections.max("yellow"));
                            if (cr03.uniqueResult() != null) {
                                chartdata[2] = cr03.uniqueResult().toString();
                            }
                            chartdata[3] = "30";
                        }
                    }

                }
                System.out.println("sssss : " + hs.getAttribute("agefactor"));
                Criteria cr = ss.createCriteria(FactorDetails.class);
                ArrayList<FactorDetails> fdlist = (ArrayList<FactorDetails>) cr.list();
                if (fdlist.size() > facindex) {
                    FactorDetails factor = fdlist.get(facindex);

                    Criteria cr1 = ss.createCriteria(FactorOption.class);
                    cr1.add(Restrictions.eq("factorId", factor));
                    ArrayList<FactorOption> folist = (ArrayList<FactorOption>) cr1.list();
                    if (folist.size() > 0) {
                        request.setAttribute("folist", folist);
                    }

//                    metervalue = metervalue + 3;
                    hs.setAttribute("metervalue", metervalue);
                    hs.setAttribute("rmetervalue", rmetervalue);
                    hs.setAttribute("points", points);
                    hs.setAttribute("finalans", finalans);
                    hs.setAttribute("chartdata", chartdata);
                    request.setAttribute("factor", factor);
                    request.setAttribute("facindex", facindex);

                } else {
//                    Save In database final ans
                    ArrayList<PatientfactorAnswer> save = (ArrayList<PatientfactorAnswer>) hs.getAttribute("finalans");
                    Calculationmeteredata cm = new Calculationmeteredata();

                    cm.setFinalpoints((Integer) hs.getAttribute("points"));
                    cm.setMetervalue((Integer) hs.getAttribute("metervalue"));
                    cm.setRmetervalue((Double) hs.getAttribute("rmetervalue"));
                    cm.setDate(new Date().toString());
                    cm.setPId(p1);

                    ss.save(cm);
                    if (cm.getCalculationmeteredataId() != null) {
                        for (PatientfactorAnswer pans : save) {
                            pans.setCalculationmeteredataId(cm);
                            ss.save(pans);
                        }
                    }
                    tr.commit();
                    RequestDispatcher rd = request.getRequestDispatcher("systemgeneratedreport?calcid=" + cm.getCalculationmeteredataId());
                    rd.forward(request, response);
                }

                tr.commit();
                RequestDispatcher rd = request.getRequestDispatcher("heartattack_calculater.jsp");
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
