package com.liviutudor;

import org.ahmadsoft.ropes.Rope;
import org.ahmadsoft.ropes.RopeBuilder;

public class RopesBasicTest extends AbstractTest<Rope> {
    RopeBuilder factory = new RopeBuilder();

    @Override
    public Rope create(String init) {
        return factory.build(init);
    }

    @Override
    public Rope concatenate(Rope current, char c) {
        return current.append(c);
    }

    @Override
    public Rope concatenate(Rope current, String s) {
        return current.append(s);
    }

    @Override
    public int find(Rope current, String substring, int startAt) {
        return current.indexOf(substring, startAt);
    }

}
