package logic;

import EntityC.Kid;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class KidDaoImpl implements Dao<Kid, Integer>{

    private final SessionFactory factory;

    public KidDaoImpl(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(@NotNull final Kid kid) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(kid);
            session.getTransaction().commit();
        }
    }

    @Override
    public Kid read(@NotNull final Integer certif) {
        try(final Session session = factory.openSession()){
            final Kid result = session.get(Kid.class, certif);
            return result != null ? result : new Kid();
        }
    }

    @Override
    public void update(@NotNull final Kid kid) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(kid);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Kid kid) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(kid);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Kid> getAll() {
        try(final Session session = factory.openSession()){
            return session.getSession().createQuery("from Kid ").list();
        }
    }

/*    @Override
    public List<Kid> getAllKids(){
        try(final Session session = factory.openSession()){
            return session.getSession().createQuery("from Kid ").list();
        }
    }*/

}
