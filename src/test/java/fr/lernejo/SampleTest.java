package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    public SampleTest() {
    }

    @Test
    void op()
    {
        int a=2;
        int b=7;
        assertEquals(9,new Sample().op(Sample.Operation.ADD,a,b));
        assertEquals(14,new Sample().op(Sample.Operation.MULT,a,b));

    }

    @Test
    void fact()
    {
        int a=3;
        int b=7;
        assertEquals(5040,new Sample().fact(b));
        assertEquals(6,new Sample().fact(a));

    }
}
