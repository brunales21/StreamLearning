package ejemplo2;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyInterface i = n -> n == 1? "Hola!!" : "adios!!";
        System.out.println(i.getSaludo(new Random().nextInt(2)));

        MyInterface e = n -> "andate a la concha de tu madre";
        System.out.println(e.getSaludo(1));
    }
}

