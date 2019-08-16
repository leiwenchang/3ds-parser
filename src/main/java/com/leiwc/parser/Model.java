package com.leiwc.parser;

import java.util.LinkedList;

/**
 * Representation of the 3d model loaded from the 3ds file
 *
 * @author Kjetil �ster�s
 */
public class Model {

    public LinkedList<ModelObject> objects = new LinkedList<ModelObject>();

    public ModelObject newModelObject(String name) {
        ModelObject object = new ModelObject(name);
        objects.push(object);
        return object;
    }
}
