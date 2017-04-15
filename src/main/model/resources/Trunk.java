package model.resources;

import model.resources.Visitor.ResourceVisitor;

/**
 * Created by cduica on 4/9/17.
 */

public class Trunk extends Resource implements PaperMillResource, CoalBurnerResource{
    //testing only
    public String toString(){
        return "Trunk";
    }

    @Override
    public void accept(ResourceVisitor v) {
        v.visitTrunk();
    }
}
