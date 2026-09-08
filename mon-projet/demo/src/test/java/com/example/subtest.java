package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class subtest {

    @Test
    public void testSub() {
        sub calc = new sub();

        int resultat = calc.sub(2, 3);

        assertEquals(-1, resultat);
    }
}