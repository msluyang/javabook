package online.javabook.pattern.gof.behavioral.patterns7.state3.workflow.context;

import online.javabook.pattern.gof.behavioral.patterns7.state3.workflow.flowstate.ActivityState;

public class Activity {

    private ActivityState state;

    public ActivityState getState() {
        return state;
    }

    public void setState(ActivityState state) {
        this.state = state;
    }
}
