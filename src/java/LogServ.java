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
import model.Login;
import model.Patient;
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
public class LogServ extends HttpServlet {

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
               
                String path="";
            
                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session ss = sf.openSession();
                Transaction tr = ss.beginTransaction();
                
                Criteria cr = ss.createCriteria(Login.class);
                cr.add(Restrictions.eq("username",request.getParameter("username")));
                cr.add(Restrictions.eq("password", request.getParameter("password")));
                
                ArrayList<Login> all = (ArrayList<Login>)cr.list();
                Login l = all.get(0);
                String role=l.getRole();
                
                HttpSession hs  = request.getSession();
                hs.setAttribute("l2", l);
                
                tr.commit();
//                Login l1 = (Login)hs.getAttribute("l2");
                
                if(all.size()==0)
                {
                    
                    path="login.jsp";
                    out.println("failed");
                    
                }
                else
                {
                    if(role.equals("patient"))
                    {
                        
                        path = "patienthomepage.jsp";
                        
                    }
                    else if(role.equals("doctor"))
                    {
                        
                        Criteria cr1 = ss.createCriteria(Doctor.class);
                        cr1.add(Restrictions.eq("userId", l));
                        ArrayList<Doctor> dList = (ArrayList<Doctor> )cr1.list();
                        Doctor d = dList.get(0);
                        hs.setAttribute("doctor", d);
                        path = "doctorhomepage.jsp";
                        
                    }
                    else 
                    {
                        Criteria cr1 = ss.createCriteria(Lab.class);
                        cr1.add(Restrictions.eq("userId", l));
                        ArrayList<Lab> lList = (ArrayList<Lab> )cr1.list();
                        Lab L = lList.get(0);
                        hs.setAttribute("lab", L);
                        path = "Labhomepage.jsp";
                        
                    }
                    
                }
               // out.println(role);
               // out.print(path);
              
              RequestDispatcher rd = request.getRequestDispatcher(path);
              rd.forward(request, response);
              
            }
        
        catch(HibernateException ex)
        {
            out.println(ex.getMessage());
            
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
