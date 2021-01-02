package online.javabook.pattern.gof.creational.patterns2.abstractfactory.widget.product.impl.windows;

import online.javabook.pattern.gof.creational.patterns2.abstractfactory.widget.product.api.ICheckbox;

public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
