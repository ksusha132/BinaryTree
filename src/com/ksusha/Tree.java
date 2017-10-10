package com.ksusha;

/**
 * Created by ksusha on 09.10.17.
 */
public class Tree {
    Integer x;
    Tree left;
    Tree right;

    public Tree(Integer x, Tree left, Tree right) {
        this.x = x;
        this.left = left;
        this.right = right;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}
