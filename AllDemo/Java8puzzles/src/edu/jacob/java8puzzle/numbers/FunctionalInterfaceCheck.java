package edu.jacob.java8puzzle.numbers;

@FunctionalInterface
public interface FunctionalInterfaceCheck {

    String check(String s);

    static boolean checked() {
        return true;
    }
}


class MainClass {

    public static void main(String[] args) {
        FunctionalInterfaceCheck f = e -> e + "main";

        System.out.println(f.check("hello "));
        System.out.println(FunctionalInterfaceCheck.checked());
    }
}
