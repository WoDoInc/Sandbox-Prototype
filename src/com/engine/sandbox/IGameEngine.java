package com.engine.sandbox;

import com.engine.sandbox.state.IGameState;

public interface IGameEngine {

    /**
     * Initializes the engine
     */
    void init();

    /**
     * Runs the engine, which will block the thread.
     * Invalid for a disposed engine
     */
    void run(IGameState initialState);

    /**
     * Request the engine to stop running
     */
    void shutdown();

    /**
     * Cleans up the engine. Can only be
     */
    void dispose();

    /**
     * @return Whether the engine is running
     */
    boolean isRunning();

    /**
     * @return Whether the engine has been disposed
     */
    boolean isDisposed();

    /**
     * Clears all states, replacing them with newState
     *
     * @param newState
     */
    void changeState(IGameState newState);

    /**
     * Submits a task to be run concurrent with the main thread
     *
     * @param name
     * @param task
     */
    void submitTask(String name, Runnable task);

    /**
     * @return Count of currently active tasks
     */
    int getActiveTaskCount();

    boolean isHibernationAllowed();

    void setHibernationAllowed(boolean allowed);

    // TODO: This probably should be elsewhere?

    /**
     * @return Whether the game window currently has focus
     */
    boolean hasFocus();

    /**
     * @return Whether the game window controls if the mouse is captured.
     */
    boolean hasMouseFocus();

    void setFocus(boolean focused);

    void subscribeToStateChange(IStateChangeSubscriber subscriber);

    void unsubscribeToStateChange(IStateChangeSubscriber subscriber);
}