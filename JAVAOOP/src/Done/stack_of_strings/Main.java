package stack_of_strings;

public class Main {

    public static void main(String[] args) {

        StackOfStrings sos = new StackOfStrings();
        sos.push("Pesho");
        sos.push("Gosho");
        sos.push("Stamat");

        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}