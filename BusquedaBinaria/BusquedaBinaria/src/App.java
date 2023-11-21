import java.util.Scanner;

public class App {
    // Definición de la clase principal llamada "App".
    public static Scanner l = new Scanner(System.in);
    public static void busquedaBinaria(int[] V, int X, int N, int CEN) {
        // Método para realizar una búsqueda binaria en un arreglo ordenado.
        int izq = 1, der = N;
        boolean Ban = false;
        while ((izq <= der) && (Ban == false)) {
            if (X == V[CEN]) {
                Ban = true;
            } else if (X > V[CEN]) {
                izq = CEN + 1; // Actualiza el límite izquierdo
            } else {
                der = CEN - 1;
            }
        }
        if(Ban==true){
            System.out.println("La informacion esta en la posicion "+CEN);
        }else{
            System.out.println("La informacion no se encuentra en el arreglo");
        }
    }

    public static void main(String[] args) throws Exception {
        // Método principal (main) donde comienza la ejecución del programa.
        System.out.println("Ingrese la cantidad de elementos que tendra el arreglo");
        int N=l.nextInt();
        int X = 8; // Elemento a buscar en el arreglo.
        int[] V = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Declaración de un arreglo ordenado.
        int CEN=0;
        
        busquedaBinaria(V, X, N, CEN);
    }
}
