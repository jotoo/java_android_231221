package ru.jotoo.Lesson11;

import java.util.Arrays;

public class PairTest3 {
    public static void main(String[] args) {
        var ceo = new Manager("Gus Greedy", 80000, 2003, 12, 15);
        var cfo = new Manager("Sid Sneky", 60000, 2003, 12, 15);
        var buddies = new Pair<Manager>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(1_000_000);
        cfo.setBonus(500_000);
        System.out.println(ceo);
        System.out.println(cfo);
        Manager[] managers = {ceo, cfo};

        var result = new Pair<Employee>();
        System.out.println(PairAlg.hasNulls(result));
        minmaxBonus(managers, result);
        System.out.println("first: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
        maxminBonus(managers, result);
        System.out.println("first: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
    }

    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> relult) {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        relult.setSecond(max);
        relult.setFirst(min);
    }

    public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
        minmaxBonus(a, result);
        PairAlg.swapHelper(result);// OK--swapHelper captures wildcard type
    }
    // can't write public statis <T super manager> . . .

}

class PairAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
