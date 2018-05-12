package random_array_list;

import java.util.ArrayList;
import java.util.Random;

class RandomArrayList extends ArrayList {

    private Random rnd;

    RandomArrayList() {
        rnd = new Random();
    }

    Object getRandomElement() {

        int index = rnd.nextInt(super.size());

        return super.remove(index);
    }
}