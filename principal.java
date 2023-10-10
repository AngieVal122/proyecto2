import java.util.Scanner;

public class principal {
    static int[] tiposBarcos = {0, 0, 1, 1, 2, 3};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean posicionValida = true;

        String[] mensajes = {
                "Ingrese la coordenada del barco %d (fila columna) tenga encuenta que el barco  ocupa 1 casilla",
                "Ingrese la coordenada del barco %d (fila columna) tenga encuenta que el barco  ocupa 1 casilla",
                "Ingrese la coordenada del barco %d (fila columna) tenga encuenta que el barco  ocupa 2 casilla verticalmente",
                "Ingrese la coordenada del barco %d (fila columna) tenga encuenta que el barco  ocupa 2 casilla verticalmente" ,
                "Ingrese la coordenada del barco %d (fila columna) tenga encuenta que el barco  ocupa 3 casilla horizontalmente" ,
                "Ingrese la coordenada del barco %d (fila columna) tenga encuenta que el barco  ocupa 4 casilla horizontalmente"
        };

        for(int i = 0; i < tiposBarcos.length; i++){
            int tipoBarco = tiposBarcos[i];
            do {
                System.out.print(String.format(mensajes[i], i+1));
                int f1 = scanner.nextInt();
                int c1 = scanner.nextInt();
                Barco barco = new Barco(f1,c1, tipoBarco);
            }while (posicionValida == false);
        }
    }
}
