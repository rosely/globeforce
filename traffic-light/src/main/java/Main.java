import com.globoforce.entity.TrafficLight;
import com.globoforce.entity.TrafficLightScheduler;

public class Main {
	
	public static void main(String[] args) {
		
		TrafficLight trafficLight1 = new TrafficLight();
		TrafficLightScheduler scheduler = new TrafficLightScheduler(trafficLight1, 2);
		scheduler.start();
	}

}
