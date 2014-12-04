//#5801
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11;
        if (myMethod(numero)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int contador = 2; contador < 1000; contador++) {
            if (myMethod(contador)) {
                System.out.print(contador + " ");
            }
        }
    }

    public static boolean myMethod(int variable) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}
