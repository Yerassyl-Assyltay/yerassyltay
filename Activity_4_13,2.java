import java.util.ArrayList;

public class Abi {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();

        list.add(31);
        list.add(4);
        list.add(44);
        list.add(77);
        list.add(11);
        list.add(23);
        list.add(93);

        shuffle(list);

        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int switchValue = (int) (Math.random() * list.size());
            Number temp = list.get(switchValue);
            list.set(switchValue, list.get(i));
            list.set(i, temp);
        }
    }
}
