package Converter;/*
 * Assignment 08
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 * Date: 3/12/2022
 */

import java.util.Comparator;

class Module implements Comparable<Module>{
	private String title;
	private String lecturer;
	private int hours;

	Module(String t, String l, int h){
		title = t; lecturer = l; hours = h;
	}

	public String title(){
		return title;
	}
	String lecturer(){
		return lecturer;
	}

	int hours(){
		return hours;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Module))
			return false;
		Module m = (Module)ob;
		return title.equals(m.title);
	}

	public int hashCode(){
		return title.hashCode();
	}

	public String toString(){
		return title+" "+lecturer+" "+hours;
	}
	//add compare to behaviour
	public int compareTo (Module m){
		//comparing tile as done in equals() method
		return this.title.compareTo(m.title());
	}
	//add comparator behaviour
	public static Comparator<Module> lectCompare= new Comparator<Module>() {
		@Override
		public int compare(Module o1, Module o2) {
			//compareTo method to return int
			return o1.lecturer().compareTo(o2.lecturer());
		}
	};

}
