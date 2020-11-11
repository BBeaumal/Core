package com.mycompany.tennis.core.repository;

import com.mycompany.tennis.core.HibernateUtil;
import com.mycompany.tennis.core.entity.Epreuve;
import org.hibernate.Session;

public class EpreuveRepositoryImpl {


    public Epreuve getById(Long idEpreuve) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Epreuve epreuve = session.get(Epreuve.class, idEpreuve);
        System.out.println("Epreuve lue avec succès");
        return epreuve;
    }


}
