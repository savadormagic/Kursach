package logic;

import EntityC.Kid;

import java.util.List;

public interface Dao<Entity, Key> {

    void create(Entity entity);

    Entity read(Key key);

    void update(Entity entity);

    void delete(Entity entity);

    List<Entity> getAll();
}
