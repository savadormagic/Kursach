package logic;

import EntityC.Educator;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EducatorDaoIml implements Dao<Educator, Integer>{

    private final SessionFactory factory;

    public EducatorDaoIml(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Educator educator) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(educator);
            session.getTransaction().commit();
        }
    }

    @Override
    public Educator read(Integer integer) {
        try(final Session session = factory.openSession()){
            final Educator result = session.get(Educator.class, integer);
            return result != null ? result : new Educator();
        }
    }

    @Override
    public void update(Educator educator) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(educator);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Educator educator) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(educator);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Educator> getAll() {
        try(final Session session = factory.openSession()){
            return session.getSession().createQuery("from Educator ").list();
        }
    }
}
