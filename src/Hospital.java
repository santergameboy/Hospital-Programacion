import java.util.List;
public class Hospital {
    private String codHospital;
    private String nombre;
    private Ciudad ciudad;
    private Integer telefono;
    private List<Servicio> servicios;
    private Medico director;

    public Hospital(String codHospital, String nombre, Ciudad ciudad, Integer telefono, List<Servicio> servicios, Medico director) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicios = servicios;
        this.director = director;
    }


    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Medico getDirector() {
        return director;
    }

    public void setDirector(Medico director) {
        this.director = director;
    }
}
