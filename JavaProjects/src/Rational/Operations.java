package Rational;//Name: Arrhat Maharjan
//Id: 3091663
//Date: 11/11/2022

interface Operations
{
    //all methods are override in Rational.Rational class
    public Rational add(Rational q);
    public Rational sub(Rational q);
    public Rational multiply(Rational q);
    public Rational multiplyByInt(int k);
    public Rational divide(Rational q);
    public Rational divideByInt(int k);
    public boolean equals(Rational q); //returns true if this equals q
}

