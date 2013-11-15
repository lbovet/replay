package ch.vobos.replay.tester;

import ch.vobos.replay.model.Scenario;

public interface Tester {

    void start(Scenario scenario);

    void stop();
}
