package online.javabook.pattern.gof.structural.patterns2.bridge.game.role.impl.bad;

import online.javabook.pattern.gof.structural.patterns2.bridge.game.role.api.bad.IRole;

public class Role4WithKnife implements IRole {

    @Override
    public void fire() {
        System.out.println("Role4 is cutting");
    }
}
