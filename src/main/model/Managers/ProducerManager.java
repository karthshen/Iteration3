package model.Managers;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hankerins on 4/11/17.
 */
public abstract class ProducerManager<L, P> {
    private HashMap<L, P> managerMap = new HashMap<L, P>();

    protected HashMap<L, P> getManagerMap() {
        return managerMap;
    }

    public void add(L l, P p)
    //TODO: make this impossible when producers exist in other sectors via Abilities
    {
        managerMap.put(l, p);
    }

    public void removeProducer(L l){
        managerMap.remove(l);
    }

    public P getProducer(L l)
    {
        return managerMap.get(l);
    }

    public boolean containsKey(L l){
        return managerMap.containsKey(l);
    }

}