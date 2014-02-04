package com.liviutudor;

/**
 * Basic test "suite" ran.
 *
 * @author Liviu Tudor http://about.me/liviutudor
 */
public interface BasicTest {
    /**
     * Create a rope/string.
     *
     * @param ntimes
     *            Number of times to run the operation
     * @param init
     *            string used for initialization
     */
    void create(int ntimes, String init);

    /**
     * Repeatedly concatenates <code>init</code> with <code>c</code>.
     *
     * @param ntimes
     *            number of times to repeat the concatenation
     * @param init
     *            starting string
     * @param c
     *            char to keep appending
     */
    void concatenate(int ntimes, String init, char c);

    /**
     * Repeatedly concatenates <code>init</code> with <code>s</code>.
     *
     * @param ntimes
     *            number of times to repeat the concatenation
     * @param init
     *            starting string
     * @param s
     *            string to keep appending
     */
    void concatenate(int ntimes, String init, String s);

    /**
     * Finds all the occurences of <code>substring</code> in <code>init</code>.
     *
     * @param ntimes
     *            number of times to repeate the operation
     * @param init
     *            string to search in
     * @param substring
     *            string to search for.
     */
    void find(int ntimes, String init, String substring);
}
