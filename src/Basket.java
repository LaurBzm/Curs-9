import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;

public class Basket<Property> {

    private boolean fruitBasket;

    public <Fruit> void main(String[] args) {
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Mar");
        fruitBasket.add("Banana");
        fruitBasket.add("Portocala");
        int Mar = 1;
        int Banana = 2;
        int Portocala = 3;

        this.fruitBasket = truth;
        fruitBasket.add(this.toString());
    }

    boolean truth;
    ArrayList<Property> properties;

    public void Basket() {
        truth = false;
        properties = new ArrayList<Property>();
        boolean b1 = false;
        boolean b2 = true;

        String s = new String(b1 + "" + b2);

        s = s.replaceAll("false", "f");
        s = s.replaceAll("true", "t");
        class Returns {
            private static IntStream stream;

            public static <DoublePipeline, Set> void main(String args[]) {

                String fruitBasket = new String();

                System.out.println(fruitBasket.indexOf(0));

                java.util.Set<Integer> linkedHashSet = new LinkedHashSet<>();
                linkedHashSet.add(3);
                linkedHashSet.add(1);
                linkedHashSet.add(2);

                for (int i : linkedHashSet) {
                    System.out.println(i);
                    fruitBasket = new String(", ");

                    fruitBasket.indexOf("Mar");
                    fruitBasket.indexOf("Portocala");
                    fruitBasket.indexOf("Banana");

                    assertEquals("Mar, Portocala, Banana", fruitBasket.toString());
                }

            }

            private static void assertEquals(String s, String string) {
            }
        }
    }
}
class Count {

    public static void main(String[] args) {

        int count = 0, num = 3;

        while (num != 0) {
            // num = num/3
            num /= 3;
            ++count;
        }

        System.out.println("Fructe" + count);
    }
}
class customCount {
    private int value;
    private int min;
    private int max;


    customCount() {
    }
    customCount(int value) {
        this.value = value;
    }
    customCount(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }
}