package online.javabook.pattern.gof.creational.patterns3.factorymethod.editor.creator.impl;

import online.javabook.pattern.gof.creational.patterns3.factorymethod.editor.creator.api.Editor;
import online.javabook.pattern.gof.creational.patterns3.factorymethod.editor.product.api.Document;
import online.javabook.pattern.gof.creational.patterns3.factorymethod.editor.product.impl.PngDocument;

public class PngEditor extends Editor {

    protected Document createDocument(String file) {
        Document document = new PngDocument();
        document.setFile(file);
        return document;
    }
}
