public class Sensor extends ComponenteElectronico {
    protected String tipo;
    protected String unidadDeMedida;
    protected int valor;

    // Constructor que inicializa tanto los atributos heredados como los específicos de Sensor
    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, String tipo, String unidadDeMedida, int valor) {
        // Llamada al constructor de la clase base (ComponenteElectronico)
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    // Métodos para obtener los valores de tipo, unidadDeMedida y valor
    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }

    // Métodos para cambiar los valores de tipo, unidadDeMedida y valor
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", valor=" + valor +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}