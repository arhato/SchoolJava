package ModulePerformance;/*
 * Assignment 09
 *
 * Student name: Arrhat Maharjan
 * Student number: 3091663
 *
 */

import java.util.*;
public class Test {
	public static void main(String[] args) {
		// ModulePerformance.Friends.Test array
		Module[] moduleList = {
			new Module("Programming","Tracey",36),
			new Module("Networks","Faheem",36),
			new Module("Graphics","Barry",36),
			new Module("Web","Ruairi",36),
			new Module("Hardware","Paddy",36),
			new Module("Algorithms","Eoin",36),
			new Module("OOP","Tracey",36),
			new Module("Maths","Paddy",36)
		};
		
		//ArrayList of Modules created
		List<Module> arrList = new ArrayList<Module>();
		arrList.addAll(Arrays.asList(moduleList));

		// ArrayList Insertion
		long startTime = System.nanoTime();
		arrList.add(new Module("BigData","Osama",36));
		long elapsedTime = System.nanoTime() - startTime;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Insertion", "ArrayList", elapsedTime);

		//new object for testing
		Module testModule=new Module("Finance","Adam",36);

		//creating a LinkedList of type ModulePerformance.Module
		System.out.println("=======================================================================");
		LinkedList<Module> arrLinkedList= new LinkedList<>();
		//adding the array modulelist ot the LinkedList
		arrLinkedList.addAll(Arrays.asList(moduleList));
		//adding testModule
		long startTime1 = System.nanoTime();
		arrLinkedList.add(testModule);
		long elapsedTime1 = System.nanoTime() - startTime1;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Insertion", "LinkedList", elapsedTime1);
		//printing LinkedList
		System.out.println("The LinkedList is:");
		System.out.println(arrLinkedList);
		//removing
		long startTime12 = System.nanoTime();
		arrLinkedList.remove(new Module("Programming","Tracey",36));
		long elapsedTime12 = System.nanoTime() - startTime12;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Deletion", "LinkedList", elapsedTime12);
		//searching for testModule
		long startTime13 = System.nanoTime();
		arrLinkedList.contains(new Module("Finance","Adam",36));
		long elapsedTime13 = System.nanoTime() - startTime13;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Searching", "LinkedList", elapsedTime13);

		System.out.println("=======================================================================");
		//creating a Hashset of type ModulePerformance.Module and adding the array moduleList
		HashSet<Module> arrHashSet = new HashSet<>(List.of(moduleList));
		long startTime2 = System.nanoTime();
		//adding the test  object testModule
		arrHashSet.add(testModule);
		long elapsedTime2 = System.nanoTime() - startTime2;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Insertion", "HashSet", elapsedTime2);
		//printing HashSet
		System.out.println("The HashSet is:");
		System.out.println(arrHashSet);
		//removing item
		long startTime22 = System.nanoTime();
		arrHashSet.remove(new Module("Programming","Tracey",36));
		long elapsedTime22 = System.nanoTime() - startTime22;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Deletion", "HashSet", elapsedTime22);
		//checking if the HashSet has the test object testModule
		long startTime23 = System.nanoTime();
		arrHashSet.contains(testModule);
		long elapsedTime23 = System.nanoTime() - startTime23;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Searching", "HashSet", elapsedTime23);

		System.out.println("=======================================================================");
		//creating LinkedHashSet of type ModulePerformance.Module and adding the array moduleList
		LinkedHashSet<Module> arrLinkedHash = new LinkedHashSet<>(List.of(moduleList));
		long startTime3 = System.nanoTime();
		//adding item
		arrLinkedHash.add(testModule);
		long elapsedTime3 = System.nanoTime() - startTime3;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Insertion", "LinkedHashSet", elapsedTime3);
		//printing the LinkedHashSet
		System.out.println("The LinkedHashSet is:");
		System.out.println(arrLinkedHash);
		//removing item
		long startTime32 = System.nanoTime();
		arrLinkedHash.remove(new Module("Programming","Tracey",36));
		long elapsedTime32 = System.nanoTime() - startTime32;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Deletion", "LinkedHashSet", elapsedTime32);
		//searching for testModule
		long startTime33 = System.nanoTime();
		//searching with a new object with the same attributes as the testModule
		arrLinkedHash.contains(new Module("Finance","Adam",36));
		long elapsedTime33 = System.nanoTime() - startTime33;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Searching", "LinkedHashSet", elapsedTime33);

		System.out.println("=======================================================================");
		//creating the TreeSet of type ModulePerformance.Module and adding the array moduleList
		TreeSet<Module> arrTreeSet = new TreeSet<>(List.of(moduleList));
		long startTime4 = System.nanoTime();
		//adding item
		arrTreeSet.add(testModule);
		long elapsedTime4 = System.nanoTime() - startTime4;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Insertion", "TreeSet", elapsedTime4);
		//printing the TreeSet
		System.out.println("The Tree set is: ");
		System.out.println(arrTreeSet);
		//removing item
		long startTime42 = System.nanoTime();
		arrTreeSet.remove(new Module("Programming","Tracey",36));
		long elapsedTime42 = System.nanoTime() - startTime42;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Deletion", "TreeSet", elapsedTime42);
		//searching
		long startTime43 = System.nanoTime();
		//searching with a new object with the same attributes as the testModule
		arrTreeSet.contains(new Module("Finance","Adam",36));
		long elapsedTime43 = System.nanoTime() - startTime43;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Searching", "TreeSet", elapsedTime43);

		System.out.println("=======================================================================");
		//sorting the collections
		long startTime15 = System.nanoTime();
		Collections.sort(arrLinkedList,Module.lectCompare);
		long elapsedTime15 = System.nanoTime() - startTime15;
		System.out.printf("Cost of operation %s on collection %s is %s nano seconds \n" ,
				"Sorting", "LinkedList", elapsedTime15);

		//HashSet cannot be sorted as it doesn't keep any order for its elements
		//It needs to be changed into other collection types to be sorted

		//LinkedHashSet cannot be sorted
		//It needs to be converted into other collection types to be sorted

		//TreeSet are sorted when we initialize it.
		// In this case its sorted according to the attribute "lecture" because of the
		//compareTo method in the class ModulePerformance.Module.
		System.out.println(arrTreeSet.comparator());

		//				  Insertion      Deletion     Searching		Sorting
		//LinkedList		6276		  15579			7476		160787
		//HashSet			1240		  7610			2505		n/a
		//LinkedHashSet		1516		  6551			10800		n/a
		//TreeSet			2619		  13189			9901  		n/a

		// Since LinkedList has two pointer adding a single item,
		// it links it to one of the other elements, which takes more processing time.

		// TreeSet insertion and deletion is slower than HashSet and LinedHashSet,
		// because it uses a comparator to sort on every addition and removal.
	}
}
