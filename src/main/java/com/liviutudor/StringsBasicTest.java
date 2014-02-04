package com.liviutudor;

/**
 * Runs a test using instances of <code>String</code>.
 *
 * @author Liviu Tudor http://about.me/liviutudor
 */
public class StringsBasicTest extends AbstractTest<String> {

    @Override
    public String create(String init) {
        return new String(init);
    }

    @Override
    public String concatenate(String current, char c) {
        return current + c;
    }

    @Override
    public String concatenate(String current, String s) {
        return current + s;
    }

    @Override
    public int find(String current, String substring, int startAt) {
        return current.indexOf(substring, startAt);
    }
}
