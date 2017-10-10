package com.ksusha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(4,
                new Tree(7,
                        new Tree(1, null, null), new Tree(2,
                        new Tree(3,
                                new Tree(8, null, null), null), null)),
                new Tree(0,
                        new Tree(3,
                                new Tree(5, null, null), new Tree(4, null, null)), null));


//        Tree tree =
//                new Tree(4,
//                        new Tree(4,
//                                new Tree(4, null, null),
//                                new Tree(4,
//                                        new Tree(4,
//                                                new Tree(4, null, null), null), null)),
//                        new Tree(0,
//                                new Tree(3,
//                                        new Tree(5, null, null),
//                                        new Tree(4, null, null)), null));

        countUniqNodes(tree, new ArrayList<>());
        System.out.println(resSet);


    }

    static HashSet<Integer> resSet = new HashSet<>();


    public static HashSet countUniqNodes(Tree tree, ArrayList<Integer> currentList) {

        currentList.add(tree.getX()); // it current list add X

        if (tree.getLeft() != null) { // if we can go futher to the left
            countUniqNodes(tree.getLeft(), currentList); // call countUniqNodes while left = 0
        }

        if (tree.getRight() != null) {
            countUniqNodes(tree.getRight(), currentList);
        }
        HashSet currentList1 = new HashSet(currentList); // create new current list1 catts to HashSet => doubles has removed
        if (currentList1.size() > resSet.size()) {
            resSet.clear(); // we have to clear our resSet before
            resSet.addAll(currentList1); // replace
        }
        currentList.remove(tree.getX()); // unwrup recursion delete emement from list where recursion has stopped

        return currentList1;
    }

}
