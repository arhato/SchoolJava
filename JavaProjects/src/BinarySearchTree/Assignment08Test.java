/*
 * Assignment 08
 *
 * Name: Arrhat Maharjan
 * Student Number: 3091663
 *
 */
package BinarySearchTree;

import java.util.*;

public class Assignment08Test {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("~~~ Testing Question 1 ~~~");
        BinarySearchTree<Word> bst = new BinarySearchTree<Word>();
        String[] words = {"allocation", "tent", "deprive", "cheap", " thought", "creation", "deficiency", "credibility", "bag", "satisfactory", "shower", "user", "jet", "stunning", "headline", "intensify", "quota", "country", "pilot", "speed"};
        //test for add()
        System.out.println("Adding String to Word type BInarySearchTree...");
        for (String word : words) {
            bst.add(new Word(word));
        }
        //test for remove()
        System.out.println("Removing 'tent'...");
        bst.remove(new Word("tent"));
        //test for contains()
        System.out.println("Is there 'tent'?: " + bst.contains(new Word("tent")));
        Word search = new Word("bag");
        System.out.println("Is there 'bag'?: " + bst.contains(search));
        //test for preOrder()
        System.out.println("Binary tree pre-order: ");
        ArrayList<Word> pre_order = bst.preOrder();
        for (Word word : pre_order) {
            System.out.printf("%s ", word);
        }
        System.out.println();
        //test for inOrder()
        System.out.println("Binary tree in-order: ");
        ArrayList<Word> in_order = bst.inOrder();
        for (Word word : in_order) {
            System.out.printf("%s ", word);
        }
        System.out.println();
        //test for postOrder()
        System.out.println("Binary tree post-order: ");
        ArrayList<Word> post_order = bst.postOrder();
        for (Word word : post_order) {
            System.out.printf("%s ", word);
        }
        System.out.println();
        //test for height()
        System.out.println("Height of the tree: " + bst.height());
        //test for size()
        System.out.println("Size of the tree: " + bst.size());

        System.out.println();
        System.out.println("~~~ Testing Question 2 ~~~");

        //test for maxElement()
        System.out.println("The largest element is: " + bst.maxElement());
        //test for leafNodes()
        ArrayList<Word> leafs = new ArrayList<>(bst.leafNodes());
        System.out.println("The leaf nodes are: ");
        System.out.println(leafs);
        //test for get(Predicate<E> pr)
        //get a list of Word that starts with s
        List<Word> result=bst.get(x->x.word().startsWith("s"));
        System.out.println("Objects of Word that start with S: ");
        System.out.println(result);
    }
}
