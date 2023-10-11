import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mensajes = {
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 1 casilla",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 1 casilla",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 2 casillas verticalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 2 casillas verticalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 3 casillas horizontalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga en cuenta que el barco ocupa 4 casillas horizontalmente"
        };

        int[] tiposBarcos = {0, 0, 1, 1, 2, 3};

        Tablero tablero = new Tablero();
        Barco barco = new Barco(tablero);
        boolean posicionValida = true;
        for (int i = 0; i < tiposBarcos.length; i++) {
            int tipoBarco = tiposBarcos[i];
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
