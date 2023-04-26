package Rational;//Name: Arrhat Maharjan
//Id: 3091663
//Date: 11/11/2022

class Rational implements Operations
{
    private int num; //our numerator
    private int den;//our denominator

    public Rational(int n, int d) //assume d != 0
    {
        if(n < 0 && d < 0)
        {
            n = -n;
            d = -d;
        }
        else if(d < 0)
        {
            n = -n;
            d = -d;
        }
        //ensures that d never negative and n positive
        // e.g., 1/-2 is changed to -1/23
        int g = gcd( Math.abs(n) , Math.abs(d));
        this.num = n/g;
        this.den = d/g;
    }

    public Rational(int n) // where d == 1
    {
        if(n < 0)  //only need to check the numerator
        {
            n = -n;
        }
        int g = gcd(Math.abs(n) , Math.abs(1)); //d==1
        this.num = n/g;
        this.den = 1/g;
    }

    public int num()
    {
        return this.num;
    }

    public int den()
    {
        return this.den;
    }

    public String toString()
    {
        return(this.num +"/" + this.den);  //return value in form
    }

    private int gcd(int a, int b)
    {
        //gets the greatest common denominator (gcd)
        if(b == 0)
            return a;
        else
            return gcd(b,a%b);
    }

    @Override
    public Rational add(Rational q) {
        //use the formula and return a new object with both numerator and denominator
        int n=(this.num * q.den + this.den * q.num);
        int d=(this.den * q.den);
        return (new Rational(n,d));
    }

    @Override
    public Rational sub(Rational q) {
        //use the formula and return a new object with both numerator and denominator
        int n=(this.num * q.den - this.den * q.num);
        int d=(this.den * q.den);
        return (new Rational(n,d));
    }

    @Override
    public Rational multiply(Rational q) {
        //use the formula and return a new object with both numerator and denominator
        int n=(this.num * q.num);
        int d=(this.den * q.den);
        return (new Rational(n,d));
    }

    @Override
    public Rational multiplyByInt(int k) {
        //use the formula and return a new object with both numerator and denominator
        int n=(this.num * k);
        int d=(this.den);
        return (new Rational(n,d));
    }

    @Override
    public Rational divide(Rational q) {
        //use the formula and return a new object with both numerator and denominator
        int n=(this.num * q.den);
        int d=(this.den * q.num);
        return (new Rational(n,d));
    }

    @Override
    public Rational divideByInt(int k) {
        //use the formula and return a new object with both numerator and denominator
        int n=(this.num);
        int d=(this.den * k);
        return (new Rational(n,d));
    }

    @Override
    public boolean equals(Rational q) {
        //check numerator and denominator of both objects
        return (this.num == q.num && this.den == q.den);
    }
}
