package model.TileSubsystem.Terrains;

import model.TileSubsystem.Visitor.TileVisitor;

/**
 * Created by hankerins on 3/26/17.
 */
public abstract class Terrain {
    abstract protected void accept(TileVisitor v);
}
