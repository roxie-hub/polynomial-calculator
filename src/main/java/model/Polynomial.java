package model;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {

    private ArrayList<Monomial> monomials;

    public ArrayList<Monomial> getMonomials() {
        return monomials;
    }
    public void setMonomials(ArrayList<Monomial> monomials) {
        this.monomials = monomials;
    }

    static private final String REGEX_POLYNOMIAL = "([+-]?(?:(?:\\d+x\\^\\d+)|(?:\\d+x)|(?:\\d+)|(?:x)))";
    public Polynomial(String p) throws Exception{

        if(p.equals("")) {
            throw new Exception("Error reading!");
        }
                monomials = new ArrayList<Monomial>();
                Pattern P = Pattern.compile(REGEX_POLYNOMIAL);
                Matcher M = P.matcher(p);
                int c = 0;
                int e = 0;
                while(M.find()){
                   String[] s = M.group().split("x\\^");
                    c = Integer.parseInt(s[0]);
                   if(s.length == 2) {
                       e = Integer.parseInt(s[1]);
                   }
                   else
                   {
                       e = 0;
                   }
                   monomials.add(new Monomial(c,e));
                }
        }
        public Polynomial(int grad){
            this.monomials = new ArrayList<Monomial>();
            for( ;grad >= 0; --grad){
                this.monomials.add(new Monomial(0,grad));
            }
        }

    public String toString() {
            String str = "";
            for(Monomial i : monomials){
                if(i.getCoefficient()>0 && i.getDegree()!=0)
                str = str + "+" + i.getCoefficient() + "x^" + i.getDegree();
                else if(i.getCoefficient()<0 && i.getDegree()!=0)
                    str = str + i.getCoefficient() + "x^" + i.getDegree();
                else if(i.getCoefficient()>0 && i.getDegree()==0)
                    str = str + "+" + i.getCoefficient();
                else
                    str = str + i.getCoefficient();
            }
            return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return monomials.equals(that.monomials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monomials);
    }
}
