import java.util.Scanner;

/**
 *
 */
public class SuperMercat {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opció = 0;
        menuPrincipal();
        opció = entrada.nextInt();

    }

    //public static void saludaMain(){
    //    System.out.println("hola mon");

    public static void menuPrincipal(){
        System.out.println("=================== SUPERMERCAT ====================");
        System.out.println("Benvinguts, escolliu la selecció desitjada");
        System.out.println("        1. Gestió de Stock");
        System.out.println("        2. Gestió de Vendes");
        System.out.println("        3.      Ajuda");
        System.out.println("        4.     Sortida");
        System.out.println("====================================================");

    }
    public static void opcions (int opció){
        do {
            if (opció == 1) {
                return gestioStock();
            } else if (opció == 2) {
                return gestioVendes();
            } else if (opció == 3) {
                return ajudaMenu();
            } else if (opció == 4) {
                break;
            } else {
                System.out.println("opció incorrecta");
                System.out.println("Per favor, selecciona una opció del 1 al 4");
            }
            }
        while(opció != -1);
    }
    /*
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

     */
}