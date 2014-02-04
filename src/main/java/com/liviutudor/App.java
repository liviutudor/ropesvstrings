package com.liviutudor;

import java.util.concurrent.TimeUnit;

import org.perf4j.LoggingStopWatch;
import org.perf4j.StopWatch;

/**
 * Test Ropes vs Strings.
 */
public class App {
    public static void main(String[] args) {
        BasicTest t = null;

        t = new StringsBasicTest();
        runTest(t, "String");

        t = new StringBuilderTest();
        runTest(t, "StringBuilder");

        t = new RopesBasicTest();
        runTest(t, "Ropes");
    }

    /* TEST CONSTANTS */
    /**
     * Initial string to initialize ropes/strings with when creating them. 200
     * chars.
     */
    public static final String INIT_STRING = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
                                                   + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

    public static final char   CONCAT_C    = 'X';

    /** String to concatenate with. 100 chars. */
    public static final String CONCAT_STR  = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

    /** Substring to find. */
    public static final String SUBSTR      = "789";

    /** Repeat each test 100 times. */
    public static final int    N_REPEAT    = 100000;

    public static void runTest(BasicTest t, String label) {
        StopWatch stopWatch = new LoggingStopWatch(label + "Create");
        t.create(N_REPEAT, INIT_STRING);
        stopWatch.stop();

        stopWatch = new LoggingStopWatch(label + "ConcatenateChar");
        t.concatenate(N_REPEAT, INIT_STRING, CONCAT_C);
        stopWatch.stop();

        stopWatch = new LoggingStopWatch(label + "ConcatenateString");
        t.concatenate(N_REPEAT, INIT_STRING, CONCAT_STR);
        stopWatch.stop();

        stopWatch = new LoggingStopWatch(label + "Find");
        t.find(N_REPEAT, INIT_STRING, SUBSTR);
        stopWatch.stop();

        // give the JVM a chance to cleanup
        // System.out.print("cleanup... ");
        sleep(3);
        System.gc();
        sleep(10);
    }

    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
