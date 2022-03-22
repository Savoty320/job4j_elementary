package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan175Then86dot25() {
        short in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman172Then71dot3() {
        short in = 172;
        double expected = 71.3;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}