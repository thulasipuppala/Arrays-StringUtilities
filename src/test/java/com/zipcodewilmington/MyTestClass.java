package rocks.zipcode.io.quiz4.utils;

import rocks.zipcode.io.quiz4.collections.ComparableTreeSet;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class MyTestClass {

    public static <E> Set<Set<E>> findPowerSet(Set<E> set) {
        Set<Set<E>> ret = new TreeSet<>();
        ret.add(set);
        if (set.isEmpty()) {
            return ret;
        }
        Iterator<E> it = set.iterator();
        while (it.hasNext()) {
            Set<E> tmp = (Set)new ComparableTreeSet(set);   //create a copy of current set
            tmp.remove(it.next());              //remove current element from copy set
            ret.add(tmp);                       //add the remaining set to result
            ret.addAll(findPowerSet(tmp));      //recursively find subsets of copy set
        }
        return ret;
    }

    public static void main(String[] args) {
        Set<Character> set = (Set)new ComparableTreeSet<Character>();
        set.add('x');
        set.add('y');
        set.add('z');
        set.add('t');
        System.out.println("Input set");
        printSet(set);
        System.out.println("\nsub sets");
        findPowerSet(set).stream().forEach(MyTestClass::printSet);
    }


    public static <E> void printSet(E... val) {
        printSet(new TreeSet<>(Arrays.asList(val)));
    }

    public static <E> void printSet(Set<E> set) {
        StringBuilder sb = new StringBuilder(set.size() == 0 ? "{}\n" : "{");
        Iterator<E> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString())
                    .append(it.hasNext() ? ", " : "}\n");
        }
        System.out.print(sb.toString());
    }
}
