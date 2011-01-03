package org.xsalefter.openidservlet.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.expressme.openid.Authentication;
import org.expressme.openid.OpenIdManager;

/**
 * @author xsalefter
 */
public class DisplayServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        System.out.println("Nonce: " + request.getParameter("openid.response_nonce"));

        HttpSession session = request.getSession();

        byte[] mac_key = (byte[]) session.getAttribute("openid_mac");
        String alias = (String) session.getAttribute("openid_alias");

        OpenIdManager manager = new OpenIdManager();
        manager.setReturnTo("http://localhost:8080/openid-servlet/display");
        Authentication authentication = manager.getAuthentication(request, mac_key, alias);

        request.setAttribute("authentication", authentication);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/display.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
