/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvo;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import metier.Abonne;
import metier.EnumGenre;

/**
 *
 * @author bertran95u
 */
public class TestVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Abonne unAb;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestVOPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        unAb = new Abonne("Dupont", "Jean", "Jean.Dupont@ji.fr", "Nancy", new Date(1000000), EnumGenre.homme);
        unAb.setId(1);
        em.persist(unAb);
        em.getTransaction().commit();
        
        em.close();
    }
    
}
