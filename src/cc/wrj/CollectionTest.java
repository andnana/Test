package cc.wrj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("b");
        arrayList.add("c");
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
