import java.util.Date;
import java.util.List;

public class Medico {
    private String codMEdico;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String DNI;
    private Date fechaNAcimiento;
    private List<Servicio> servicios;
    private Hospital hospital;

    public Medico(String codMEdico, String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNAcimiento, List<Servicio> servicios, Hospital hospital) {
        this.codMEdico = codMEdico;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNAcimiento = fechaNAcimiento;
        this.servicios = servicios;
        this.hospital = hospital;
    }

    public Medico(String codMEdico, String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNAcimiento, Hospital hospital) {
        this.codMEdico = codMEdico;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNAcimiento = fechaNAcimiento;
        this.hospital = hospital;
    }

    public Medico(String a1, String carlos, String lampe, String iniesta, String dni, Date time, List<Servicio> servicios, List<Hospital> hospitals) {
    }

    public String getCodMEdico() {
        return codMEdico;
    }

    public void setCodMEdico(String codMEdico) {
        this.codMEdico = codMEdico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNAcimiento() {
        return fechaNAcimiento;
    }

    public void setFechaNAcimiento(Date fechaNAcimiento) {
        this.fechaNAcimiento = fechaNAcimiento;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
