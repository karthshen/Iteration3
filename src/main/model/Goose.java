package model;

/**
 * Created by doug0_000 on 4/9/2017.
 */
public class Goose implements Animal {

    @Override
    public Goose reproduce() {
        return new Goose();
    }
}