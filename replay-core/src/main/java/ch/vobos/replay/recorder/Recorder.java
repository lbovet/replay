package ch.vobos.replay.recorder;

import ch.vobos.replay.model.Scenario;

public interface Recorder {

    void start();

    Scenario stop();

}
