package com.engine.sandbox.state;

public interface ILoadProcess {

    /**
     * @return A message describing the state of the process
     */
    String getMessage();

    /**
     * Runs a single step.
     *
     * @return Whether the overall process is finished
     */
    boolean step();

    /**
     * Begins the loading
     *
     * @return The total number of expected steps for this LoadProcess, 0 if nothing to do
     */
    void begin();

    /**
     * @return The progress of the process, between 0f and 1f inclusive
     */
    float getProgress();

}
