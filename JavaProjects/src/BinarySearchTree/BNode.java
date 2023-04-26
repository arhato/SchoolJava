/*
 * Assignment 08
 *
 * Name: Arrhat Maharjan
 * Student Number: 3091663
 *
 */
package BinarySearchTree;

class BNode<E extends Comparable<E>> {
    private E data;
    private BNode<E> left;
    private BNode<E> right;

    public BNode(E d) {
        data = d;
        left = null;
        right = null;
    }

    public E getData() {
        return data;
    }

    public BNode<E> getLeft() {
        return left;
    }

    public BNode<E> getRight() {
        return right;
    }

    public void setData(E x) {
        data = x;
    }

    public void setLeft(BNode<E> k) {
        left = k;
    }

    public void setRight(BNode<E> k) {
        right = k;
    }
}