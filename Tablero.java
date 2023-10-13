
public class Tablero {
    /*
     Creamos lo atributos
     */
    private char [][] matriz;
    private int TAMANO;
    /*
    Creamos un constructor para inicializar TAMANO e inicializarMatriz
     */
    public Tablero () {
        this.TAMANO = 7;
        inicializarMatriz();
    }

/*
Creamos el método inicializarMatriz, que nos va ayudar a pintar el tablero de *
 */
    private void inicializarMatriz() {
        matriz = new char[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                matriz[i][j] = '*';
            }
        }
    }
/*
Creamos otro método de imprimir matriz, donde nos muestra la pamtriz ocn la posición del barco
 */
    public void imprimirMatriz() {
        System.out.println("Matriz con barcos:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
/*
Se muestra la matriz con barcos
 */
    public char[][] getMatriz() {
        return matriz;
    }
/*
Muestra la variable TAMANO
 */
    public int getTAMANO() {
        return TAMANO;
    }
}
