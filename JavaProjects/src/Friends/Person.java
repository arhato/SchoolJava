package Friends;

/*
 * Assignment 10
 *
 * GradeAssistant.Student name: Arrhat Maharjan
 * GradeAssistant.Student number: 3091663
 * Date: 17/12/2022
 */
final class Person implements Comparable<Person>{
    private final String sName;
    private final String fName;

    Person(String fn, String sn){fName = fn; sName = sn;}
    public String sName(){return sName;}
    public String fName(){return fName;}
    public String toString(){return fName+" "+sName;}
    public boolean equals(Object ob){
        if(!(ob instanceof Person)) return false;
        Person p = (Person)ob;
        return sName.equals(p.sName) && fName.equals(p.fName);
    }
    public int compareTo(Person p){
        //if first names are equal, compare surnames
        if (this.fName.compareTo(p.fName) == 0) {
            // return surname comparison
            return this.sName.compareTo(p.sName);
        } else {
            //if first names are not equal, return firstname comparison
            return this.fName.compareTo(p.fName);
        }
    }
    public int hashCode(){
        return 41 * sName.hashCode() * fName.hashCode();
    }
}
