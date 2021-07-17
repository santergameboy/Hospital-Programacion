import java.util.List;

public class Servicio {
    private String idServicio;
    private String nombre;
    private List<Hospital> hospitales;
    private Integer numeroCamas;
    private String comentario;

    public Servicio(String idServicio, String nombre, List<Hospital> hospitales, Integer numeroCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospitales = hospitales;
        this.numeroCamas = numeroCamas;
        this.comentario = comentario;
    }

    public Servicio(String idServicio, String nombre, Integer numeroCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.numeroCamas = numeroCamas;
        this.comentario = comentario;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hospital> getHospitales() {
        return hospitales;
    }

    public void setHospitales(List<Hospital> hospitales) {
        this.hospitales = hospitales;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
