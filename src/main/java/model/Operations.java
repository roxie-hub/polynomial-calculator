package model;

import java.util.ArrayList;

public class Operations {
    static public Polynomial add(Polynomial a , Polynomial b)
    {
        int i = a.getMonomials().get(0).getDegree();
        int j = b.getMonomials().get(0).getDegree();
        if(j>i) i=j;

        Polynomial result = new Polynomial(i);

        for(Monomial n : result.getMonomials()){
            for(Monomial m : a.getMonomials()){
                if(n.getDegree()==m.getDegree())
                n.setCoefficient(n.getCoefficient()+m.getCoefficient());
            }

            for(Monomial m : b.getMonomials()){
                if(n.getDegree()==m.getDegree())
                    n.setCoefficient(n.getCoefficient()+m.getCoefficient());
            }

        }
        for(int l = 0; l < result.getMonomials().size(); ) {
            if (result.getMonomials().get(l).getCoefficient() == 0) {
                result.getMonomials().remove(l);
            }
            if(l<result.getMonomials().size())
            if (result.getMonomials().get(l).getCoefficient() != 0) {
                l++;
            }
        }
        if(result.getMonomials().size()==0)
            result.getMonomials().add(new Monomial(0,0));
        return result;
    }

    static public Polynomial sub(Polynomial a , Polynomial b){
        int i = a.getMonomials().get(0).getDegree();
        int j = b.getMonomials().get(0).getDegree();
        if(j>i) i=j;
        Polynomial result = new Polynomial(i);
        for(Monomial n : result.getMonomials()){

            for(Monomial m : a.getMonomials()){
                if(n.getDegree()==m.getDegree())
                    n.setCoefficient(n.getCoefficient()+m.getCoefficient());
            }

            for(Monomial m : b.getMonomials()){
                if(n.getDegree()==m.getDegree())
                    n.setCoefficient(n.getCoefficient()-m.getCoefficient());
            }
        }
        for(int l = 0; l < result.getMonomials().size(); ) {
            if (result.getMonomials().get(l).getCoefficient() == 0) {
                result.getMonomials().remove(l);
            }
            if(l<result.getMonomials().size())
                if (result.getMonomials().get(l).getCoefficient() != 0) {
                    l++;
                }
        }
        if(result.getMonomials().size()==0)
            result.getMonomials().add(new Monomial(0,0));
        return result;
    }

    static public Polynomial mul(Polynomial a , Polynomial b){
        int i = a.getMonomials().get(0).getDegree();
        int j = b.getMonomials().get(0).getDegree();
        Polynomial result = new Polynomial(i+j);
        for(Monomial m : a.getMonomials()){
            for(Monomial m1 : b.getMonomials()){
                for(Monomial n : result.getMonomials())
                {
                    if(n.getDegree()==m.getDegree()+m1.getDegree())
                    n.setCoefficient(n.getCoefficient()+m.getCoefficient()*m1.getCoefficient());
                }
            }
        }
        for(int l = 0; l < result.getMonomials().size(); ) {
            if (result.getMonomials().get(l).getCoefficient() == 0) {
                result.getMonomials().remove(l);
            }
            if(l<result.getMonomials().size())
                if (result.getMonomials().get(l).getCoefficient() != 0) {
                    l++;
                }
        }
        if(result.getMonomials().size()==0)
            result.getMonomials().add(new Monomial(0,0));
        return result;
    }

    static public Polynomial der(Polynomial a){
        for(Monomial m : a.getMonomials()){
                if(m.getDegree()!=0)
                {m.setCoefficient(m.getCoefficient()*m.getDegree());
                 m.setDegree(m.getDegree()-1);}
                else {
                    m.setCoefficient(m.getCoefficient()*m.getDegree());
                    m.setDegree(m.getDegree());
            }
        }

        for(int l = 0; l < a.getMonomials().size(); ) {
            if (a.getMonomials().get(l).getCoefficient() == 0) {
                 a.getMonomials().remove(l);
            }
            if(l<a.getMonomials().size())
                if (a.getMonomials().get(l).getCoefficient() != 0) {
                    l++;
                }
        }
        if(a.getMonomials().size()==0)
            a.getMonomials().add(new Monomial(0,0));

        return a;
    }
    static public Polynomial integ(Polynomial a){
        for(Monomial m : a.getMonomials()){
           m.setCoefficient(m.getCoefficient()/(m.getDegree()+1));
           m.setDegree(m.getDegree()+1);
        }
        return a;
    }
}
