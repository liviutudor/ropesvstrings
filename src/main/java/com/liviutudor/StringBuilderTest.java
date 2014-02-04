package com.liviutudor;

/**
 * Test which uses instances of <code>StringBuilder</code>.
 *
 * @author Liviu Tudor http://about.me/liviutudor
 */
public class StringBuilderTest extends AbstractTest<StringBuilder> {

    @Override
    public StringBuilder create(String init) {
        return new StringBuilder(init);
    }

    @Override
    public StringBuilder concatenate(StringBuilder current, char c) {
        return current.append(c);
    }

    @Override
    public StringBuilder concatenate(StringBuilder current, String s) {
        return current.append(s);
    }

    @Override
    public int find(StringBuilder current, String substring, int startAt) {
        return current.indexOf(substring, startAt);
    }
}
