package com.globoforce.entity;

import org.apache.log4j.Logger;

public class TrafficLight {
	
	private static Logger logger = Logger.getLogger(TrafficLight.class);

	private StateEnum state = StateEnum.GREEN;

	public void changeState(){
		this.state = this.state.changeState();
		logger.info(getState());
	}

	public StateEnum getState() {
		return state;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}
}

enum StateEnum implements StateInterface {
	GREEN("Green"){
		public StateEnum changeState() {
			return StateEnum.ORANGE;
		}
	}, ORANGE("Orange"){
		public StateEnum changeState() {
			return StateEnum.RED;
		}
	}, RED("Red"){
		public StateEnum changeState() {
			return StateEnum.GREEN;
		}
	};
	
	private String description;

	private StateEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}

interface StateInterface{
	StateEnum changeState();
}
