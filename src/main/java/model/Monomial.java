package model;

import java.util.Objects;

public class Monomial {
    private float coefficient;
    private int degree;

    public Monomial(int coefficient, int degree){
        this.coefficient = coefficient;
        this.degree = degree;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monomial monomial = (Monomial) o;
        return Float.compare(monomial.coefficient, coefficient) == 0 && degree == monomial.degree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficient, degree);
    }
}
