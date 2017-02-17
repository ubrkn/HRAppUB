/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.service;

import com.ub.hrappub.entity.Kullanici;
import com.ub.hrappub.service.IBaseService;
import com.ub.hrappub.util.HRException;
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
 * @author Ugur
 */
public class KullaniciService implements  IBaseService<Kullanici>{
 @Override
    public boolean save(Kullanici entity) throws Exception {
        if(entity.getUsername()==null || entity.getUsername().trim().equals("")){
            throw  new HRException("Kullanıcı Adı Boş Olmamalıdır");
        }
        if(entity.getPassword()==null || entity.getPassword().trim().equals("")){
            throw  new HRException("Kullanıcı Şifre Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Kullanici entity) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Kullanici entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Kullanici> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        if(query!=null){
            criteria.add(Restrictions.or(Restrictions.ilike("uname", query,MatchMode.ANYWHERE),
                    Restrictions.ilike("isim", query,MatchMode.ANYWHERE)));
        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Kullanici getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("id", id));
        return (Kullanici) criteria.uniqueResult();
    }

    public Kullanici getUsernameAndPassword(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("uname", username));
        criteria.add(Restrictions.eq("pword", password));
        return (Kullanici) criteria.uniqueResult();
    }
}
