package stack_of_strings;

import java.util.ArrayList;
import java.util.List;

class StackOfStrings {

    private List<String> data;

    StackOfStrings() {
        this.data = new ArrayList<>();
    }

    boolean isEmpty() {
        return this.data.isEmpty();
    }

    void push(String item) {
        this.data.add(item);
    }

    String pop() {
        return this.data.remove(this.data.size() - 1);
    }

    String peek() {
        return this.data.get(this.data.size() - 1);
    }
}