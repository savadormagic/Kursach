package logic;

import EntityC.Parent;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ParentDaoImpl implements Dao<Parent, Integer>{

    private final SessionFactory factory;

    public ParentDaoImpl(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(@NotNull final Parent parent) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(parent);
            session.getTransaction().commit();
        }
    }


    @Override
    public Parent read(Integer id) {
        try(final Session session = factory.openSession()){
            final Parent result = session.get(Parent.class, id);
            return result != null ? result : new Parent();
        }
    }


    @Override
    public void update(@NotNull final Parent parent) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(parent);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Parent parent) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(parent);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Parent> getAll() {
        return null;
    }
}
