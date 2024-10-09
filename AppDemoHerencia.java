import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        // Crear lista de Smartphones
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();

        // Inicializar objetos de tipo Sensor y Pantalla para los Smartphones
        Sensor sensor1 = new Sensor("Apple", "S123", "Apple", "Sensor Huella", 50.00f, null, "Huella dactilar", "Biométrico", 1);
        Sensor sensor2 = new Sensor("Samsung", "S456", "Samsung", "Sensor Huella", 45.00f, null, "Huella dactilar", "Biométrico", 1);

        Pantalla pantalla1 = new Pantalla("Apple", "P123", "Apple", "Pantalla Retina", 300.00f, null, 1170, 2532);
        Pantalla pantalla2 = new Pantalla("Samsung", "P456", "Samsung", "Pantalla AMOLED", 280.00f, null, 1080, 2400);

        // Inicializar objetos Smartphone con valores en todos sus atributos
        Smartphone smartphone1 = new Smartphone("Apple", "SN12345", "iPhone", "iPhone 13", 1200.00f, false, sensor1, pantalla1);
        Smartphone smartphone2 = new Smartphone("Samsung", "SN54321", "Galaxy", "Galaxy S21", 1000.00f, false, sensor2, pantalla2);

        // Añadir los objetos Smartphone a la lista
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);
        // Crear lista de Televisiones
        ArrayList<Television> listaDeTVs = new ArrayList<>();

        // Inicializar objetos Television con valores en todos sus atributos
        Pantalla pantalla3 = new Pantalla("LG", "PN001", "LG", "Pantalla OLED", 800.00f, null, 3840, 2160);
        Pantalla pantalla4 = new Pantalla("Sony", "PN002", "Sony", "Pantalla LED", 700.00f, null, 1920, 1080);

        Television tv1 = new Television("LG", "TV12345", "LG", "OLED TV", 1500.00f, false, pantalla1);
        Television tv2 = new Television("Sony", "TV54321", "Sony", "LED TV", 1400.00f, false, pantalla2);

        // Añadir los objetos Television a la lista
        listaDeTVs.add(tv1);
        listaDeTVs.add(tv2);

        // Mostrar los atributos de cada Smartphone en la listaDeSmartphones
        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        // Mostrar los atributos de cada Televisión en la listaDeTVs
        System.out.println("\nLista de Televisiones:");
        for (Television tv : listaDeTVs) {
            System.out.println(tv);
        }
    }
}