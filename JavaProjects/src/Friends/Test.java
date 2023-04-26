package Friends;

import Friends.Friends;

/*
 * Assignment 10
 *
 * GradeAssistant.Student name: Arrhat Maharjan
 * GradeAssistant.Student number: 3091663
 * Date: 17/12/2022
 */
// Do not edit this code
public class Test {
    public static void main(String[] args) {
        Friends f = new Friends();
        Person p1 = new Person("Joe", "Bloggs");
        f.add(p1);
        f.add(new Person("Rosella", "Murphy"));
        f.add(new Person("Mary", "O Keefe"));
        f.display();
        System.out.println();
        Person notThere = new Person("JJ", "Byrne");
        System.out.println("Search for JJ Byrne");
        System.out.printf("Person %s should not be there, so false: %b\n",notThere.toString(),f.search(notThere));
        System.out.println("Search for Joe Bloggs");
        System.out.printf("Person %s should be there, so true:%b\n",p1.toString(),f.search(p1));
        System.out.println();
        System.out.printf("There should be 3 friends: %d\n",f.size());
        System.out.println();
        f.add(new Person("Rosella", "O Keefe"));
        System.out.println("Rosella O Keefe added");
        System.out.printf("There should be 2 people with the surname 'O Keefe: %s", f.getSurname("O Keefe").toString());
        System.out.println();
        System.out.println();
        f.add(new Person("Rosella", "O Keefe"));
        System.out.printf("There should be 2 people with the firstname 'Rosella':%s\n", f.getFirstname("Rosella").toString());
        System.out.println();
        System.out.printf("There should be 1 person called 'Joe':%d\n",f.getFreq("Joe"));
        System.out.println("Joe Bloggs added again");
        f.add(new Person("Joe", "Bloggs"));
        System.out.printf("There should still be 1 person called 'Joe':%d\n",f.getFreq("Joe")); // unique
        System.out.println("Joe BloggsEile added");
        f.add(new Person("Joe", "BloggsEile"));
        System.out.printf("There should be 2 people called 'Joe':%d\n",f.getFreq("Joe"));
        System.out.println();
        f.display();
        System.out.println("Joe Bloggs removed");
        f.del(p1);
        System.out.println();
        System.out.println("4 people should be left");
        f.display();
        System.out.println();
        System.out.printf("Sorted list of friends:%s\n",f.sort().toString());
    }
} 