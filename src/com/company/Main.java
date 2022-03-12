package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        Integer[] array2 = {0, 1, 2};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        Collections.addAll(hashSet2, array2);
        Collections.addAll(hashSet, array);
        System.out.println(hashSet);
        System.out.println(hashSet2);

        System.out.println("Озгочолугу: " + symmetricDifference(hashSet,hashSet2));

        System.out.println("Разность: " + symmetricDifference2(hashSet,hashSet2));

    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> hashSet3 = new HashSet<>();
        for (Integer integer: set1) {
            if (!set2.contains(integer)){
                hashSet3.add(integer);
            }
        }
        for (Integer i:set2) {
            if (!set1.contains(i)){
                hashSet3.add(i);
            }
        }
        return hashSet3;
    }
    // Башка жолу
    public static Set<Integer> symmetricDifference2 (Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> hashSet = new HashSet<>(set1);
        hashSet.removeAll(set2);
        set2.removeAll(set1);
        hashSet.addAll(set2);
        return hashSet;
    }
}
