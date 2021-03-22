package logic;

import EntityC.Group;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class GroupsDaoImpl implements Dao<Group, Integer> {

    private final SessionFactory factory;

    public GroupsDaoImpl(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(@NotNull final Group group) {
        try(final Session session = factory.openSession()){
            session.beginTransaction();
            session.save(group);
            session.getTransaction().commit();
        }
    }

    @Override
    public Group read(@NotNull final Integer integer) {
        try(final Session session = factory.openSession()){
            final Group group = session.get(Group.class, integer);
            return group != null ? group : new Group();
        }
    }

    @Override
    public void update(@NotNull final Group group) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(group);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Group group) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(group);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Group> getAll() {
        try(final Session session = factory.openSession()){
            return session.getSession().createQuery("from Group ").list();
        }
    }
}
