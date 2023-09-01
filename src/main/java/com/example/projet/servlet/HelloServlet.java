package com.example.projet.servlet;


import com.example.projet.entity.User;

import java.io.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/welcome")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        req.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();


        try {
            User user = em.find(User.class, username); // Récupérer l'utilisateur par le nom d'utilisateur

            if (user != null && user.getPassword().equals(password)) {
                resp.getWriter().write("Connexion réussie !");
                resp.sendRedirect("login");
            } else {
                resp.getWriter().write("Échec de la connexion. Veuillez vérifier vos informations.");
                resp.sendRedirect("welcome");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }




    public void destroy() {
    }
}