package kolekcje;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Kolekcje {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pracownik P1 = new Pracownik("Jan", "Kowalski");
        Pracownik P2 = new Pracownik("Jann", "Kowalski");
        Pracownik P3 = new Pracownik("Jannn", "Kowalski");
        Pracownik P4 = new Pracownik("Jannnn", "Kowalski");
        Pracownik P5 = new Pracownik("Jannnnn", "Kowalski");
        Pracownik P6 = new Pracownik("Jannnnnn", "Kowalski");
        List<Pracownik> arr = new ArrayList<>();
        arr.add(P1);
        arr.add(P2);
        arr.add(P3);
        arr.add(P4);
        arr.add(P5);
        arr.add(P6);

        int[] tablica = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica[i] = i + 1;
        }

        for (int x : tablica) {
            System.out.println(x);
        }
        TreeSet<Pracownik> tree = new TreeSet<>();
        tree.add(P1);
        tree.add(P2);
        tree.add(P3);
        tree.add(P4);
        tree.add(P5);
        tree.add(P6);

        HashSet<Pracownik> hash = new HashSet<>();
        hash.add(P1);
        hash.add(P2);
        hash.add(P3);
        hash.add(P4);
        hash.add(P5);
        hash.add(P6);

        LinkedHashSet<Pracownik> linked = new LinkedHashSet<>();
        linked.add(P1);
        linked.add(P2);
        linked.add(P3);
        linked.add(P4);
        linked.add(P5);
        linked.add(P6);

    }

}
