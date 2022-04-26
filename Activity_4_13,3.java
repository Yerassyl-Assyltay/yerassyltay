import java.util.ArrayList;

public class Abi2 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(12);
        list.add(34);
        list.add(6);
        list.add(10);
        list.add(2);

        System.out.println("Unsorted: " + list.toString());
        sort(list);
        System.out.println("Sorted: " + list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
