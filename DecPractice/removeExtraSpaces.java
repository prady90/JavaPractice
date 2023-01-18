import java.util.ArrayList;
import java.util.List;

public class removeExtraSpaces {

    public static void main(String args[]) {

        String input = "Try  to remove    extra   spaces.";

        System.out.println(input.trim());

        String input1[] = input.split(" ");
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {

            if (input1[i].isEmpty()) {
                continue;
            } else {
                temp.add(input1[i]);
            }

        }

        System.out.println(temp.get(0)+" "+temp.get(1)+" "+temp.get(2)+" "+
        temp.get(3)+" "+temp.get(4));

    }
}