package com.engine.sandbox;

import com.engine.sandbox.state.IGameState;

public class SandboxGameEngine implements IGameEngine {

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(IGameState initialState) {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDisposed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changeState(IGameState newState) {
		// TODO Auto-generated method stub

	}

	@Override
	public void submitTask(String name, Runnable task) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getActiveTaskCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHibernationAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setHibernationAllowed(boolean allowed) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasFocus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasMouseFocus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFocus(boolean focused) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subscribeToStateChange(IStateChangeSubscriber subscriber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unsubscribeToStateChange(IStateChangeSubscriber subscriber) {
		// TODO Auto-generated method stub

	}

}
