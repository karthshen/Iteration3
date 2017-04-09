package model.producers.primary;

import model.producers.Product;
import model.resources.Trunk;

/**
 * Created by cduica on 4/8/17.
 */
public class WoodCutter extends PrimaryProducer {
    @Override
    public Product produce() {
        return new Trunk();
    }
}
