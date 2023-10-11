import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Creamos un array de mensajes
        */
        String[] mensajes = {
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 1 casilla",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 1 casilla",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 2 casillas verticalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 2 casillas verticalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 3 casillas horizontalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 4 casillas horizontalmente"
        };
/*
Creamos un arreglo de tipoBarcos para que el switch evalue cada caso
 */
        int[] tiposBarcos = {0, 0, 1, 1, 2, 3};
/*
Crea un objeto tipo tablero y tipo barco.
 */
        Tablero tablero = new Tablero();
        Barco barco = new Barco(tablero);
        /*
        Tenemos un boolean posicionValida
         */
        boolean posicionValida = true;
        /*
        Creamos un ciclo for para hacer un recorrido de tipo barcos
         */
        for (int i = 0; i < tiposBarcos.length; i++) {
            int tipoBarco = tiposBarcos[i];
            /*
            y dentro del ciclo for creamos un ciclo do-while donde le va a mostar
            al usuario el mensaje para que ingrese la coordenada del barco y después le
            a pintar la matriz con el barco, pero si posicion valida esta fuera de la matriz
            nos va a retornar un falso, y se va arepetir hasta que posicion valida sea verdadero.
             */
            do {
                System.out.print(String.format(mensajes[i], i + 1));
                int f1 = scanner.nextInt();
                int c1 = scanner.nextInt();
                 posicionValida = barco.adicionarBarco(f1, c1, tipoBarco);
                tablero.imprimirMatriz();
            } while (false==posicionValida);
        }
    }
}
