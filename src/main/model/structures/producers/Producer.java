package model.structures.producers;

import model.Managers.ResourceManager;
import model.TileSubsystem.Sector;
import model.resources.Resource;
import model.structures.Structure;
import model.structures.producers.Visitor.PrimaryProducerVisitor;
import model.structures.producers.primary.PrimaryProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cduica on 4/8/17.
 */
public abstract class Producer extends Structure {

    private ResourceManager resourceManager;
    private List<Resource> forRemoval;

    public Producer(ResourceManager resourceManager){
        this.resourceManager = resourceManager;
        this.forRemoval = new ArrayList<>();
    }

    public abstract void produce(Sector l);

    protected void addToResourceManager( Sector l, Resource r ){
        resourceManager.add(l, r);
    }

    protected void removeFromResourceManager( Resource r ){
        resourceManager.remove(r);
    }

}
