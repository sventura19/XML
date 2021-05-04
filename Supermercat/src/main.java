import java.util.Scanner;

/**
 *
 */
public class main{
    public static void main(String[] args) {
        saludaMain();
        segon.saluda();
        leerStock();
    }

    public static void saludaMain(){
        System.out.println("hola mon");
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