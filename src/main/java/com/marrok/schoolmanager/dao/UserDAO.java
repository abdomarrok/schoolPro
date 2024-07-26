package com.marrok.schoolmanager.dao;

import com.marrok.schoolmanager.model.User;
import com.marrok.schoolmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAO  implements GenericDAO<User>{

    @Override
    public void save(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public User getById(int id) {
        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            user = session.get(User.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        Transaction transaction = null;
        List<User> users = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            users = session.createQuery("from User", User.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void delete(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
                System.out.println("User is deleted");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
