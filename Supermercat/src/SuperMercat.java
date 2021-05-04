import java.util.Scanner;

/**
 *
 */
public class SuperMercat {
    public static void main(String[] args) {

        saludaMain();
        segon.saluda();
        leerStock();
    }

    public static void saludaMain(){
        System.out.println("hola mon");
    }

    void menuPrincipal(){
        System.out.println("Gestio de supermercat");
        System.out.println("1. Gestio Stock");
        System.out.println("2.");
    }

    static void leerStock(){
        Scanner e = new Scanner(System.in);

        String p;

            p = e.next();
            System.out.println(p);

            p = e.next();
            System.out.println(p);

            p = e.next();
            System.out.println(p);

        while (p.equals("-1"));
    }
}