package ch.vobos.replay.mock;


import ch.vobos.replay.model.Scenario;

public interface Mocker {

    void start(Scenario scenario);

    void stop();

}
