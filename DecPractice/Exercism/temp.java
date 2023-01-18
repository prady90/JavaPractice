package Exercism;
import java.util.List;
import java.util.ArrayList;

class Flattener1 {
    Flattener1() {
    }
    List flatten(List li) {
        List<Object> res = new ArrayList<>();
        for (Object o: li) {
            if (o instanceof List)
                res.addAll(flatten((List) o));
            else if (o != null)
                res.add(o);
        }
        return res;
    }
    public static void main(String[] args) {
        Flattener flattener = new Flattener();
        List temp = flattener.flatten(asList("0", 2, asList(asList("two", '3'), "8", singletonList(singletonList("one hundred")),
                null, singletonList(singletonList(null))), "negative two"));

        System.out.println(Arrays.asList(temp).toString());

    }

}

