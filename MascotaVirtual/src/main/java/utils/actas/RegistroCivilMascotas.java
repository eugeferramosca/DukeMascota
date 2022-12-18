package utils.actas;

import modelos.Mascota;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RegistroCivilMascotas {
    static FileInputStream input;
    static FileOutputStream output;
    private static final String RUTA = "src/main/java/utils/actas/";

    public static void confeccionarActa(Mascota mascota) {
        if (!mascota.isLive()) {
            String actaDeDefuncion = "ACTA DE DEFUNCION DE " + mascota.getNombre()
                    + "\nFECHA DE FALLECIMIENTO : " + mascota.getFechaMuerte().toLocalDate()
                    + "\nA LA HORA : " + mascota.getFechaMuerte().toLocalTime().getHour()
                    + " : " + mascota.getFechaMuerte().toLocalTime().getMinute()
                    + "\nCAUSA DE MUERTE : " + mascota.getCausaDeMuerte().toString();
            mascota.setActaDefuncion(actaDeDefuncion);
        }
        String actaNacimiento = "ACTA DE NACIMIENTO DE " + mascota.getNombre()
                + "\nFECHA DE NACIMIENTO : " + mascota.getFechaNacimiento().toLocalDate()
                + "\nA LA HORA : " + mascota.getFechaNacimiento().toLocalTime().getHour()
                + " : " + mascota.getFechaNacimiento().toLocalTime().getMinute()
                + "\nSU FAMILIAR MAS CERCANO ES : " + mascota.getPropietario();
        mascota.setActaNacimiento(actaNacimiento);
    }

        public static void guardarActa (Mascota mascota){
            System.out.println();
            if (!mascota.isLive() && mascota.getActaDefuncion() != null) {
                try {
                    output = new FileOutputStream(RUTA + mascota.getNombre() + "Defunción" + ".txt");
                    output.write(mascota.getActaDefuncion().getBytes());
                    System.out.println("Acta de defunción archivada");
                    output.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                output = new FileOutputStream(RUTA + mascota.getNombre() + "Nacimiento" + ".txt");
                output.write(mascota.getActaNacimiento().getBytes());
                System.out.println("Acta de Nacimiento archivada");
                output.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
