package com.globoforce.entity;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TrafficLightScheduler {
	
	private static final int THREAD_POOL = 1;
	
	private TrafficLight trafficLight;
	
	private Integer seconds;

	public TrafficLightScheduler(TrafficLight trafficLight, Integer seconds) {
		super();
		this.trafficLight = trafficLight;
		this.seconds = seconds;
	}



	public void start(){
    	
    	Executors.newScheduledThreadPool(THREAD_POOL).scheduleAtFixedRate(new Runnable() {
			public void run() {
				trafficLight.changeState();
			}
		}, 0, this.seconds, TimeUnit.SECONDS);
    }
}