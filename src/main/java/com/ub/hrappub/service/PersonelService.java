/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.service;

import com.ub.hrappub.util.HRException;
import com.ub.hrappub.entity.Personel;
import com.ub.hrappub.service.IBaseService;
import com.ub.hrappub.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author uberkun
 */
public class PersonelService implements IBaseService<Personel>{

    @Override
    public boolean save(Personel entity) throws Exception {
        if(entity.getAdSoyad() == null || entity.getAdSoyad().trim().equals("")) {
            throw new HRException("Ad boş olamaz");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Personel entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Personel entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Personel> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Personel.class);
        if(query!=null){
            criteria.add(Restrictions.or(Restrictions.ilike("isim", query,MatchMode.ANYWHERE)));
        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Personel getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Personel.class);
        criteria.add(Restrictions.eq("id", id));
        return (Personel) criteria.uniqueResult();
    }
    
    
}
