package com.liviutudor;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTest<T> implements BasicTest {

    public final void create(int ntimes, String init) {
        List<T> result = new ArrayList<T>(ntimes);
        for (int i = 0; i < ntimes; i++) {
            result.add(create(init));
        }
    }

    public abstract T create(String init);

    public final void concatenate(int ntimes, String init, char c) {
        T current = create(init);
        for (int i = 0; i < ntimes; i++) {
            current = concatenate(current, c);
        }
    }

    public abstract T concatenate(T current, char c);

    public final void concatenate(int ntimes, String init, String s) {
        T current = create(init);
        for (int i = 0; i < ntimes; i++) {
            current = concatenate(current, s);
        }
    }

    public abstract T concatenate(T current, String s);

    public final void find(int ntimes, String init, String substring) {
        T curr = create(init);
        int found = 0;
        for (int i = 0; i < ntimes; i++) {
            do {
                found = find(curr, substring, found) + 1;
            } while (found > 0);
        }
    }

    public abstract int find(T current, String substring, int startAt);

}
