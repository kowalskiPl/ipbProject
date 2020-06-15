package com.project.ipb.ipbProject.hibernateTools;

import com.project.ipb.ipbProject.model.Estimate;
import org.hibernate.Session;

import java.util.List;

/**
 * A class containing database connection functions
 */
public class HibernateDBUtil {

    public static Estimate getEstimate(long Id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from estimate es where es.id = :estimateId", Estimate.class).
        setParameter("estimateId", Id).list().get(0);
    }

    public static List<Estimate> getEstimates() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from estimate ", Estimate.class).list();
    }
}
