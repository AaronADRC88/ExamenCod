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

    public static boolean myMethod(int result) {
        int par = 2;
        boolean verificador = true;
        while ((verificador) && (par != result)) {
            if (result % par == 0) {
                verificador = false;
            }
            par++;
        }
        return verificador;
    }

}
