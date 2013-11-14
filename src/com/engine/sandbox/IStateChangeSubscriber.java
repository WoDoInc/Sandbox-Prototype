package com.engine.sandbox;

public interface IStateChangeSubscriber
{
	/**
	 * Given a state change, update the subscriber.
	 */
    void onStateChange();
}