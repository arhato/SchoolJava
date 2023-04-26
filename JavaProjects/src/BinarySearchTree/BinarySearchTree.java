/*
 * Assignment 08
 *
 * Name: Arrhat Maharjan
 * Student Number: 3091663
 *
 */
package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BinarySearchTree<E extends Comparable<E>> {
    private BNode<E> root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public void add(E x) {
        if (x == null) return;
        if (root == null) {
            root = new BNode<>(x);
            count = 1;
        } else add(root, x);
    }

    private void add(BNode<E> rt, E x) {
        if (x.compareTo(rt.getData()) < 0) {
            if (rt.getLeft() == null) {
                rt.setLeft(new BNode<>(x));
                count++;
            } else {
                add(rt.getLeft(), x);
            }
        } else if (x.compareTo(rt.getData()) > 0) {
            if (rt.getRight() == null) {
                rt.setRight(new BNode<>(x));
                count++;
            } else {
                add(rt.getRight(), x);
            }
        } else ; //x present, ignore
    }

    public boolean contains(E x) {
        return contains(root, x);
    }

    private boolean contains(BNode<E> rt, E x) {
        if (rt == null) {
            return false;
        } else {
            if (rt.getData().equals(x)) {
                return true;
            } else if (x.compareTo(rt.getData()) < 0) {
                return contains(rt.getLeft(), x);
            } else {
                return contains(rt.getRight(), x);
            }
        }
    }

    public ArrayList<E> inOrder() {
        ArrayList<E> lst = new ArrayList<>();
        inOrder(root, lst);
        return lst;
    }

    private void inOrder(BNode<E> rt, ArrayList<E> lst) {
        if (rt != null) {
            inOrder(rt.getLeft(), lst); //process left sub-tree
            lst.add(rt.getData()); //process the root
            inOrder(rt.getRight(), lst); //process right sub-tree
        }
    }

    public ArrayList<E> preOrder() {
        ArrayList<E> lst = new ArrayList<>();
        preOrder(root, lst);
        return lst;
    }

    private void preOrder(BNode<E> rt, ArrayList<E> lst) {
        if (rt != null) {
            lst.add(rt.getData()); //process root
            preOrder(rt.getLeft(), lst); //process left sub-tree
            preOrder(rt.getRight(), lst); //process right sub-tree
        }
    }

    public ArrayList<E> postOrder() {
        ArrayList<E> lst = new ArrayList<>();
        postOrder(root, lst);
        return lst;
    }

    private void postOrder(BNode<E> rt, ArrayList<E> lst) {
        if (rt != null) {
            postOrder(rt.getLeft(), lst); //process left sub-tree
            postOrder(rt.getRight(), lst); //process right-subtree
            lst.add(rt.getData()); //process root
        }
    }

    public int size() {
        return count;
    }

    public void remove(E x) {
        root = remove(root, x);
    }

    private BNode<E> remove(BNode<E> rt, E x) {
        if (rt == null) {
            return null;
        } else if (x.compareTo(rt.getData()) < 0) {
            rt.setLeft(remove(rt.getLeft(), x));
        } else if (x.compareTo(rt.getData()) > 0) {
            rt.setRight(remove(rt.getRight(), x));
        } else {
            //if it's the leaf node delete/set as null
            if (rt.getLeft() == null && rt.getRight() == null) {
                count--;
                rt = null;
                //if left node null then return right sub-tree
            } else if (rt.getLeft() == null) {
                count--;
                rt = rt.getRight();
                //if right node null then return left sub-tree
            } else if (rt.getRight() == null) {
                count--;
                rt = rt.getLeft();
            } else {
                //replace node value with value of rightmost element in its left sub-tree;
                BNode<E> rightmost = rightMost(rt.getLeft());
                rt.setData(rightmost.getData());
                //remove duplicate node
                rt.setLeft(remove(rt.getLeft(), rightmost.getData()));
            }
        }
        return rt;
    }

    private BNode<E> rightMost(BNode<E> rt) {
        //return node if the right node is null
        if (rt.getRight() == null) {
            return rt;
        } else {
            //recursive call with the right node until the right node is null
            return rightMost(rt.getRight());
        }
    }

    public int height() {
        if (root == null) {
            return 0;
        } else return (height(root) - 1); //root has height 0
    }

    private int height(BNode<E> rt) {
        if (rt == null) {
            return 0;
        } else {
            return 1 + max(height(rt.getLeft()), height(rt.getRight()));
        }
    }

    private int max(int a, int b) {
        return Math.max(a, b);
    }

    public E maxElement() {
        //since its a binary tree the rightmost is the largest
        return rightMost(root).getData();
    }

    public ArrayList<E> leafNodes() {
        //initialize a new Array list
        ArrayList<E> leafs = new ArrayList<>();
        //call helper method
        leafNodes(root, leafs);
        //return list
        return leafs;
    }

    private void leafNodes(BNode<E> rt, ArrayList<E> leafs) {
        //if root is null break
        if (rt == null) {
            return;
        } else if (rt.getRight() == null && rt.getLeft() == null) {
            //if both right and left child is null/ is leaf node
            //add to list
            leafs.add(rt.getData());
        }
        //recursive call for both the right subtree and left subtree
        leafNodes(rt.getRight(), leafs);
        leafNodes(rt.getLeft(), leafs);
    }


    public List<E> get(Predicate<E> pr) {
        //initial list
        List<E> getArray = new ArrayList<>();
        //call helper method
        get(root, pr, getArray);
        //return list
        return getArray;
    }

    private void get(BNode<E> rt, Predicate<E> pr, List<E> lst) {
        //if current node is null return
        if (rt == null) {
            return;
        }
        //recursive call for left subtree
        get(rt.getLeft(), pr, lst);
        //check with Predicate
        if (pr.test(rt.getData())) {
            //add to list if true
            lst.add(rt.getData());
        }
        //recursive call for right subtree
        get(rt.getRight(), pr, lst);
    }

}