public class Barco{
    private int f1;
    private int c1;

    private int tipoBarco;
    public Barco (int f1, int c1, int tipoBarco ) {
        this.c1 = c1;
        this.f1 = f1;
        this.tipoBarco = tipoBarco;

    }
    Tablero tablero= new Tablero();
    int valor = tablero.getTAMANO();
    char [][] matriz = tablero.getMatriz();
    boolean posicionValida = true;

    public boolean posicionValida(int coordenada){
        return (coordenada >= 0 && coordenada <=valor );
    }

    public boolean adicionarBarco(){
        if (!(posicionValida(f1) && posicionValida(c1))){
            System.out.println("Posición por fuera de la matriz");
            return false;
        }

        switch (tipoBarco){
            case 0:
                return barco1(f1, c1);
            case 1:
                return barco2(f1, c1);
            case 2:
                return barco3(f1, c1);
            case 3:
                return barco4(f1, c1);
            default:
                System.out.println("Barco inválido");
                return false;
        }
    }


    //Método para ubicar barcos de UNA casilla
    private boolean barco1(int f1, int c1) {
        int fila = f1;
        int columna = c1;
        if (matriz [fila][columna]!= '*') {
            System.out.println("Casilla ocupada");
            return false;
        }

        char barco =  'D';
        matriz[fila][columna] = barco;
        return true;
    }

    private boolean barco2(int f1, int c1) {
        int fila = f1;
        int columna = c1;
        if(fila > valor - 2){
            System.out.println("Espacio insuficiente");
            return false;
        }
        if (matriz[fila][columna] != '*' || matriz[fila + 1][columna] != '*') {
            System.out.println("Casilla ocupada");
            return false;
        }
        char barco = 'A';
        matriz[fila][columna] = barco;
        matriz[fila + 1][columna] = barco;
        return true;
    }
    //Método para ubicar barco de TRES casillas
    private boolean barco3(int f1, int c1) {
        int fila = f1;
        int columna = c1;
        if(columna > valor - 3){
            System.out.println("Espacio insuficiente");
            return false;
        }
        if (matriz[fila][columna] != '*' || matriz[fila][columna + 1] != '*' || matriz[fila][columna + 2] != '*') {
            System.out.println("Casilla ocupada");
            return false;
        }
        char barco = 'C';
        matriz[f1][c1] = barco;
        matriz[f1][c1 + 1] = barco;
        matriz[f1][c1 + 2] = barco;
        return true;
    }
    //Método para ubicar barcos de CUATRO casillas horizontal
    private  boolean barco4(int f1, int c1) {
        int fila = f1;
        int columna = c1;
        if(columna > valor - 4){
            System.out.println("Espacio insuficiente");
            return false;
        }
        if (matriz[fila][columna] != '*' || matriz[fila][columna + 1] != '*' || matriz[fila][columna + 2] != '*' || matriz[fila][columna + 3] != '*') {
            System.out.println("Casilla ocupada");
            return false;
        }

        char barco = 'F';
        matriz[fila][columna] = barco;
        matriz[fila][columna + 1] = barco;
        matriz[fila][columna + 2] = barco;
        matriz[fila][columna + 3] = barco;
        return true;
    }
    private posicionValida = adicionarBarco(f1, c1, tipoBarco);
}

