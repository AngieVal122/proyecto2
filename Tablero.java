public class Tablero {
    private char [][] matriz;
    private int TAMANO;
    public Tablero () {
        this.matriz = matriz;
        this.TAMANO = 7;
    }

    public char[][] getMatriz() {
        return matriz;
    }


    public int getTAMANO() {
        return TAMANO;
    }

    private char[][] inicializarMatriz() {
        char[][] matriz = new char[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                matriz[i][j] = '*';
            }
        }
        return matriz;
    }
    private void imprimirMatriz() {
        System.out.println("Matriz con barcos:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

