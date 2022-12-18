import enumeradores.AlmacenAlimentos;
import modelos.DukeMascota;
import persistencia.mysql.MySQLConnection;
import persistencia.persistenceCollections.IMascotaPersistenceUseList;
import utils.actas.RegistroCivilMascotas;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){

        IMascotaPersistenceUseList persistence = new IMascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina","Eugenia");
        DukeMascota duke2= new DukeMascota("Duke-Morticia","Eugenia");
        DukeMascota duke3= new DukeMascota("Duke-Pericles", "Eugenia");
        DukeMascota duke4= new DukeMascota("Duke-Dedos", "Eugenia");
        System.out.println(duke);
       System.out.println(duke2);
       System.out.println(duke3);
        System.out.println(duke4);



        //persistence.guardar(duke);
        //persistence.guardar(duke2);
        //persistence.guardar(duke3);
       // persistence.guardar(duke4);

        //for(Mascota mascota: persistence.getAllMascotas()){
           // System.out.println(mascota);
         //   System.out.println(mascota.getNombre());
        //}
     //  System.out.println("antes de comer " + duke2.getNivelEnergia());
     //   duke.comer(AlmacenAlimentos.ASADO);
     //   System.out.println("despues de comer " + duke2.getNivelEnergia());

        //duke.jugar(EntretenimientosEnum.POKER);
        //duke.jugar(EntretenimientosEnum.PASEAR);
        //duke.jugar(EntretenimientosEnum.PASEAR);
        //duke.jugar(EntretenimientosEnum.PERINOLA);
        //duke.jugar(EntretenimientosEnum.BAILAR);

        //System.out.println("antes de dormir " + duke.getNivelEnergia());
        //duke.dormir(LocalTime.of(0,25));
        //System.out.println("despues de dormir " +  duke.getNivelEnergia());

        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
         duke.comer(AlmacenAlimentos.PORORO);
      //  duke.comer(AlmacenAlimentos.PORORO);
      //  duke.comer(AlmacenAlimentos.PORORO);
      //  duke.comer(AlmacenAlimentos.PORORO);
      //  duke.comer(AlmacenAlimentos.PORORO);
      // System.out.println("despues de comer el nivel de energia " + duke.getNivelEnergia()
         //     +  " y la cantidad de alimentos ingeridos son " + duke.getComidasIngeridas() +
         //    " y la cantidad de bebidas ingeridas son " + duke.getBebidasIngeridas()) ;
        //duke.irAlBaño();
        //duke.irAlBaño();
        //duke.tomarAgua();
        //duke.tomarAgua();
       /* System.out.println("despues de evacuar el nivel de energia es " + duke.getNivelEnergia()+
                " y la cantidad de alimentos ingeridos son " + duke.getComidasIngeridas() +
                 "y la cantidad de bebidas ingeridas son " + duke.getBebidasIngeridas());*/

        RegistroCivilMascotas.guardarActa(duke);

        MySQLConnection conexion = new MySQLConnection();
        Connection connection = conexion.establecerConexion();
      //  MascotaPersistenceUseMySQL persistenceUseBDMySQL = new MascotaPersistenceUseMySQL();
       // persistenceUseBDMySQL.guardar(duke);
       // persistenceUseBDMySQL.guardar(duke2);
        //persistenceUseBDMySQL.guardar(duke3);
       // persistenceUseBDMySQL.guardar(duke4);

        conexion.cerrarConexion(connection);


    }
}
