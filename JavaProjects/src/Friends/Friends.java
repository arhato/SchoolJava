package Friends;/*
 * Assignment 10
 *
 * GradeAssistant.Student name: Arrhat Maharjan
 * GradeAssistant.Student number: 3091663
 * Date: 17/12/2022
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Friends {
    //HashSet to store friends
    HashSet<Person> friends = new HashSet<>();

    public void add(Person p) {
        //add person to HashSet
        friends.add(p);
    }

    public boolean search(Person p) {
        //search for person in HashSet
        return friends.contains(p);
    }

    public int size() {
        //return size of HashSet
        return friends.size();
    }

    public HashSet<Person> getSurname(String s) {
        //create new HashSet to store people with same surname
        HashSet<Person> surname = new HashSet<>();
        //loop through HashSet
        for (Person p : friends) {
            //if surname matches, add to HashSet
            if (p.sName().equals(s)) {
                surname.add(p);
            }
        }
        //return HashSet
        return surname;
    }

    public HashSet<Person> getFirstname(String f) {
        //create new HashSet to store people with same firstname
        HashSet<Person> firstname = new HashSet<>();
        for (Person p : friends) {
            //if firstname matches, add to HashSet
            if (p.fName().equals(f)) {
                firstname.add(p);
            }
        }
        //return HashSet
        return firstname;
    }

    public int getFreq(String f) {
        int freq = 0;
        for (Person p : friends) {
            //if firstname matches, increment freq
            if (p.fName().equals(f)) {
                freq++;
            }
        }
        //return freq
        return freq;
    }
    public boolean del(Person p) {
        //remove person from HashSet
        if (friends.contains(p)) {
            friends.remove(p);
            //return true if person was removed
            return true;
        }else{
            //return false if person was not removed
            return false;
        }
    }
    public ArrayList<Person> sort() {
        //create new ArrayList to store sorted friends
        ArrayList<Person> friendsList = new ArrayList<>(friends);
        //sort ArrayList
        Collections.sort(friendsList);
        //return ArrayList
        return friendsList;
    }

    public void display() {
        //loop through HashSet
        for (Person p : friends) {
            //print person
            System.out.println(p.toString());
        }
    }
}


