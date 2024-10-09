import java.util.ArrayList;
public class DispositivoElectronico {
    protected String fabricante;
    protected String numeroSerie;
    protected String marca;
    protected String nombre;
    protected float costo;
    protected ArrayList<ComponenteElectronico> componentes = new ArrayList<>();

    public DispositivoElectronico() {
        ArrayList<ComponenteElectronico> componentes = new ArrayList<>();
    }
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void agregarComponente(ComponenteElectronico nuevoObjeto)
    {
        componentes.add(nuevoObjeto);
    }
    public void quitarComponentes(ComponenteElectronico nuevoObjeto){
        componentes.remove(nuevoObjeto);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


