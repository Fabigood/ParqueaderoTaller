
import java.util.ArrayList;

//Nombre: Fabio Gonzalez
//Talller 
public class Main {

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        System.out.println("Puestos libres : " + parqueadero.calcularPuestosLibres());

        parqueadero.entrarCarro("PPP-001");
        parqueadero.entrarCarro("PAA-002");
        for (int i = 0; i < 4; i++) {
            parqueadero.avanzarHora();
        }
        ArrayList<Carro> carrosMasDeTresHoras = parqueadero.darCarrosMasDeTresHorasParqueados();
        for (Carro carro : carrosMasDeTresHoras) {
            System.out.println("Carro con más de tres horas parqueado: " + carro.darPlaca());
        }

        System.out.println("Puestos libres : " + parqueadero.calcularPuestosLibres());
        System.out.println("Promedio horas : " + parqueadero.darTiempoPromedio());
        System.out.println("Carro con mas horas: " + parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Existe auto mas de ocho horas : " + parqueadero.hayCarroMasDeOchoHoras());
        System.out.println("Existe auto mas de 24 horas : " + parqueadero.hayCarroMasDe24Horas());
        System.out.println("Existe carros con la misma placa: " + parqueadero.hayCarrosPlacaIgual());

        int carrosConPlacaPB = parqueadero.contarCarrosQueComienzanConPlacaPB();
        System.out.println("Carros con placa que comienza con 'PB': " + carrosConPlacaPB);

        int carrosSacados = parqueadero.desocuparParqueadero();
        System.out.println("Cantidad de carros sacados: " + carrosSacados);
    }
}
