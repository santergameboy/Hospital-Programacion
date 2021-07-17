import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //listas
        List<Servicio> servicios = new ArrayList<>();
        List<Hospital> hospitals = new ArrayList<>();
        List<Medico> medicos= new ArrayList<>();
        //medicos
         Medico carlos = new Medico("a1","Carlos","lampe","iniesta","1254Cba", Calendar.getInstance().getTime(),servicios,hospitals);
         Medico goku = new Medico("a2","songoku","kakaroto","krilin","125lp",Calendar.getInstance().getTime(),servicios,hospitals);
         medicos.add(carlos);
         medicos.add(goku);
        //Ciudades
        Ciudad laPaz=new Ciudad("lp","LaPaz");
        Ciudad cba=new Ciudad("cba","cochabamba");



        //hospitales

        Hospital viedma =new Hospital("VDM","viedma",laPaz,1234,servicios,carlos);
        Hospital harry = new Hospital("HW","HarryWilliams",cba,123455,servicios,goku);
        hospitals.add(viedma);
        hospitals.add(harry);

        //servicios
        Servicio ginecologia =new Servicio("gin","ginecologia",hospitals,2,"bueno");
        Servicio cirugia = new Servicio("cir","cirugia",hospitals,3,"regular");
        servicios.add(ginecologia);
        servicios.add(cirugia);
        //Paciente
        Paciente carla = new Paciente("p1","carla","kardashan","romero","5452Cba",Calendar.getInstance().getTime(),"666seg");
        //historial
        Historial hist=new Historial("h1",carla);
        //visita
        Visita mañana = new Visita("m1",Calendar.getInstance().getTime(),viedma,ginecologia,carlos,"quiste","embarazo",4,Calendar.getInstance().getTime(),hist);

        System.out.println("Nombre Paciente: "+ carla.getNombre());
        System.out.println("Apellido Paterno: "+ carla.getPrimerApellido());
        System.out.println("Apellido Materno: "+ carla.getSegundoApellido());
        System.out.println("Codigo de paciente: "+carla.getCodPaciente());
        System.out.println("DNI: "+ carla.getDNI());
        System.out.println("Fecha de nacimiento: "+ carla.getFechaNacimiento());
        System.out.println("Numero seguridad Social: "+ carla.getNumeroSeguridadSocial());
        System.out.println("Diagnostico: "+ mañana.getDiagnostico());
        System.out.println("Tratamiento: "+ mañana.getTratamientos());
        System.out.println("Numero de cama: "+ mañana.getNumeroCama());
        System.out.println("Hospital: "+ mañana.getHospital());
        System.out.println("Medico de turno: "+ carlos.getNombre());
        System.out.println("Servicio: "+ mañana.getServicio());
        System.out.println("Historial: "+ mañana.getHistorial());


    }
}
