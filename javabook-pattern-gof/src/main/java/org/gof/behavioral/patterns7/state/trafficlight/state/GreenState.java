package org.gof.behavioral.patterns7.state.trafficlight.state;

import org.gof.behavioral.patterns7.state.trafficlight.context.TrafficLight;

import java.util.concurrent.TimeUnit;

public class GreenState implements ILightState {

    @Override
    public void change(TrafficLight trafficLight) {
        try {
            System.out.println("现在是绿灯 请等待5秒");
            TimeUnit.SECONDS.sleep(5);

            trafficLight.setState(new YellowState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
