package random_array_list;

public class Main {

    public static void main(String[] args) {

        RandomArrayList ral = new RandomArrayList();
        ral.add(1);
        ral.add("Pesho");
        ral.add(0.42d);

        System.out.println(ral.getRandomElement());
    }
}