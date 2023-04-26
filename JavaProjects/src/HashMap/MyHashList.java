package HashMap;
/**
 * student name: Arrhat Maharjan
 * student number: 3091663
 */

import java.util.*;
import java.util.function.*;

class MyHashList<E> implements Iterable<E> {
    private ArrayList<LinkedList<E>> table;

    public MyHashList(int n) {
        // n = the number of lists to create -
        // it does NOT limit the number of elements in the table
        table = new ArrayList<>();
        for (int j = 0; j < n; j++)
            table.add(new LinkedList<>());
    }

    private int hashC(E x) {
        int k = x.hashCode();
        //an alternative is to mask the minus using
        //int k = x.hashCode() & 0x7fffffff;
        int h = Math.abs(k % table.size());
        return (h);
    }

    public void add(E x) {
        int index = hashC(x);
        table.get(index).addFirst(x);
    }

    public boolean contains(E x) {
        int index = hashC(x);
        return (table.get(index).contains(x));
    }

    public boolean remove(E x) {
        int index = hashC(x);
        return table.get(index).remove(x);
    }

    public int size() {
        int count = 0;
        for (int j = 0; j < table.size(); j++) {
            count += table.get(j).size();
        }
        return count;
    }

// Assignment Methods Start

    public LinkedList<E> getList(E x) {
        //initialize new list
        LinkedList<E> result = new LinkedList<>();
        //get hashcode of parameter
        int hashCode = x.hashCode();
        //traverse all the elements in the table
        for (E e : this) {
            //check elements hashcode with the parameter hashcode
            if (e.hashCode() == hashCode) {
                //add element to list
                result.add(e);
            }
        }
        //return list
        return result;
    }

    public void remove(List<E> ls) {
        //traverse the table
        for (E e : this) {
            //loop the parameter list
            for (E l : ls) {
                //check if table element is equals to parameter element
                if (e.hashCode() == l.hashCode()) {
                    //remove the element if it exists
                    this.remove(e);
                }
            }
        }
    }


    public List<E> get(Predicate<E> pr) {
        //initialize a new list
        List<E> preList = new LinkedList<>();
        //invoke iterator
        Iterator<LinkedList<E>> it = table.iterator();
        //traverse the table
        while (it.hasNext()) {
            //store the nested list
            LinkedList<E> list = it.next();
            //traverse the nested list
            for (E e : list) {
                //test the predicate
                if (pr.test(e)) {
                    //add to new list if true
                    preList.add(e);
                }
            }
        }
        //return list
        return preList;
    }

// Assignment Methods End

    public Iterator<E> iterator() {
        ArrayList<E> items = new ArrayList<E>();
        int ind = 0;
        while (ind < table.size()) {
            Iterator<E> it = table.get(ind).iterator();
            while (it.hasNext()) items.add(it.next());
            ind++;
        }
        return items.iterator();
    }

    public String toString() {
        return table.toString();
    }


//==================================================================
//Methods that provide information about the state of the hashtable Q1 Part b

    public double percentUsed() {
        //initialize the count
        int count = 0;
        //traverse the table
        for (int j = 0; j < table.size(); j++) {
            if (table.get(j).size() > 0) count++;
        }
        //get in percentage
        double p = count * 100.0 / table.size();
        return p;
    }

    public int largestBucket() {
        //initialize variable to store the max bucket
        int max = 0;
        //traverse the table
        for (int j = 0; j < table.size(); j++) {
            if (table.get(j).size() > max) {
                //set the size of nested linked-list if its larger
                max = table.get(j).size();
            }
        }
        //return the variable
        return max;

    }

    public int smallestBucket() {
        //initialize variable to store the min bucket
        int min = table.get(0).size();
        //traverse the table
        for (int j = 1; j < table.size(); j++) {
            if (table.get(j).size() < min) {
                //set the size of nested linked-list if its smaller
                min = table.get(j).size();
            }
        }
        //return variable
        return min;
    }


    public int[] listSizes() {
        int n = largestBucket();
        //initialize array
        int[] d = new int[n + 1];
        for (int j = 0; j < d.length; j++) {
            d[j] = 0;
        }
        //traverse table
        for (LinkedList<E> es : table) {
            //get nested array size
            int m = es.size();
            //add size to the array
            d[m] = d[m] + 1;
        }
        //return array
        return d;

    }

    public int empty() {
        //initialize the count
        int count = 0;
        //travers the table
        for (LinkedList<E> es : table)
            if (es.size() == 0) {
                //increase count if the value is 0
                count++;
            }
        //return count
        return count;
    }

}

