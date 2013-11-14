package com.engine.sandbox.state;

import com.engine.sandbox.IGameEngine;

public interface IGameState {

    void init(IGameEngine engine);

    void dispose();

    void handleInput(float delta);

    void update(float delta);

    void render();

    /**
     * @return Whether the game should hibernate when it loses focus
     */
    boolean isHibernationAllowed();
}
