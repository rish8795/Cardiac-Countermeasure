/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


import model.Addressdetails;
import model.City;
import model.Lab;
import model.Login;
import model.State;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.output.*;
import org.hibernate.Criteria;
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
            throws ServletException, IOException, FileUploadException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
             
             String lab_name="", website="",cont_num="",line1="",line2="",state="",city="",pincode="",user_id="",pwd="",email="",cn="";
             String photo="1";
             
             
               FileItemFactory factory = new DiskFileItemFactory();
            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            //get the list of all fields from request
            List<FileItem> fields= upload.parseRequest(request);
            // iterates the object of list
            Iterator<FileItem> it = fields.iterator();
            //getting objects one by one
            
              while (it.hasNext())
            {
                //assigning coming object if list to object of FileItem
                FileItem fileItem = it.next();
                //check whether field is form field or not
                boolean isFormField = fileItem.isFormField();
                
                if (isFormField)
                {
                    //get the filed name 
                    String fieldName=fileItem.getFieldName();
                    if(fieldName.equals("lab_name"))
                    {
                        //getting value of field
                        lab_name=fileItem.getString();
                        
                    }
                    else if(fieldName.equals("website"))
                    {
                        website = fileItem.getString();
                    }
                    else if(fieldName.equals("state"))
                    {
                        state= fileItem.getString();
                    }
                    else if(fieldName.equals("city"))
                    {
                        city= fileItem.getString();
                    }
                    else if(fieldName.equals("line1"))
                    {
                        line1= fileItem.getString();
                    }
                    else if(fieldName.equals("line2"))
                    {
                        line2= fileItem.getString();
                    }
                    else if(fieldName.equals("pincode"))
                    {
                        pincode= fileItem.getString();
                    }
                    else if(fieldName.equals("user_id"))
                    {
                        user_id= fileItem.getString();
                    }
                     else if(fieldName.equals("password"))
                    {
                        pwd= fileItem.getString();
                    }
                    else if(fieldName.equals("cont_num"))
                    {
                        cont_num= fileItem.getString();
                    }
                    
                    else if(fieldName.equals("email_id"))
                    {
                        email= fileItem.getString();
                    }
                    else if(fieldName.equals("Cont_num"))
                    {
                        cn= fileItem.getString();
                    }
                   
                    
                }
                else
                {
                    //getting name of file
                    photo = new File(fileItem.getName()).getName();
                    //get the extension of file by diving name into substring
//                    String extension=photo.substring(photo.indexOf(".")+1,photo.length());;
//                    //rename file...concate name and extension
//                    photo=pname+"."+extension;
                    
                    try {
                    String filePath= "C:\\Users\\rishabh\\Documents\\NetBeansProjects\\SamplePro\\web\\images\\lab\\certi\\";
                    fileItem.write( new File(filePath + photo));
                        } catch (Exception ex)
                          {
                         out.println(ex.toString());
                          }

                }
                

            }
          
             String path="refresh_page.jsp";
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();

            
            State s1 = new State();
            s1.setStateName(state);
            ss.save(s1);
            
            City ci = new City();
             ci.setCityName(city);
             ci.setStateId(s1);
             ss.save(ci);
          
             
            Addressdetails ad = new Addressdetails();
            ad.setLine1(line1);
            ad.setLine2(line2);
            
            ad.setSId(s1);
            ad.setCityId(ci);
            ad.setPincode(pincode);
            ss.save(ad);
            
            Login lo = new Login();
            lo.setUsername(user_id);
            lo.setPassword(pwd);
            lo.setRole("Laboratory");
            ss.save(lo);
            
            
            Lab la = new Lab();
            la.setLabName(lab_name);
            la.setWebsite(website);
            la.setContactNum(cont_num);
            la.setAddressid(ad);
            la.setStatus("not Active");
            la.setUserId(lo);
            la.setImageName(photo);
            ss.save(la);
            
            
            tr.commit();
            
            
             RequestDispatcher rd = request.getRequestDispatcher(path);
              rd.forward(request, response);
            
            
            out.println("success");
            
        }
        
        catch(Exception he)
        {
            out.println(he.getMessage());
        }
        
        finally{
            
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(labreg.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(labreg.class.getName()).log(Level.SEVERE, null, ex);
        }
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
