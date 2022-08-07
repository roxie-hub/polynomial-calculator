package model;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void add() {
      try{  Polynomial a = new Polynomial("2x^3-1");
        Polynomial b = new Polynomial("1x^3+3x^1+5");
        Polynomial expected = new Polynomial("3x^3+3x^1+4");
        Polynomial acctual = Operations.add(a, b);
        assertEquals(expected, acctual); }catch(Exception e){

      }

    }

    @Test
    void sub() {
       try{ Polynomial a = new Polynomial("2x^3-1");
        Polynomial b = new Polynomial("1x^3+3x^1+5");
        Polynomial expected = new Polynomial("1x^3-3x^1-6");
        Polynomial acctual = Operations.sub(a, b);
        assertEquals(expected, acctual);

        a = new Polynomial("2x^3");
        b = new Polynomial("2x^3");
        expected = new Polynomial("0");
        acctual = Operations.sub(a, b);
        assertEquals(expected, acctual);}catch (Exception e){

       }
    }

    @Test
    void mul() {
      try{  Polynomial a = new Polynomial("2x^1-1");
        Polynomial b = new Polynomial("1x^2");
        Polynomial expected = new Polynomial("2x^3-1x^2");
        Polynomial acctual = Operations.mul(a, b);
        assertEquals(expected, acctual);}catch (Exception e){

      }
    }

    @Test
    void der() {
       try{ Polynomial a = new Polynomial("2x^3-1");
        Polynomial expected = new Polynomial("6x^2");
        Polynomial acctual = Operations.der(a);
        assertEquals(expected, acctual);}catch (Exception e){

       }
    }

    @Test
    void integ() {
        try{Polynomial a = new Polynomial("2x^1-1");
        Polynomial expected = new Polynomial("1x^2-1x^1");
        Polynomial acctual = Operations.integ(a);
        assertEquals(expected, acctual);}catch (Exception e){

        }
    }
}