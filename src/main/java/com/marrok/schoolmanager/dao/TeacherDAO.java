package com.marrok.schoolmanager.dao;

import com.marrok.schoolmanager.model.Teacher;
import com.marrok.schoolmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TeacherDAO implements GenericDAO<Teacher> {

    @Override
    public void save(Teacher teacher) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(teacher);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Teacher teacher) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(teacher);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Teacher getById(int id) {
        Transaction transaction = null;
        Teacher teacher = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            teacher = session.get(Teacher.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return teacher;
    }

    @Override
    public List<Teacher> getAll() {
        Transaction transaction = null;
        List<Teacher> teachers = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            teachers = session.createQuery("from Teacher", Teacher.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return teachers;
    }

    @Override
    public void delete(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Teacher teacher = session.get(Teacher.class, id);
            if (teacher != null) {
                session.delete(teacher);
                System.out.println("Teacher is deleted");
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
