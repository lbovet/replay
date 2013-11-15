package ch.vobos.replay.storage;

import ch.vobos.replay.model.Scenario;

import java.util.List;

public interface ScenarioRepository {

    void put(String name, Scenario scenario);

    Scenario get(String name);

    void delete(String name);

    List<String> list();

}
