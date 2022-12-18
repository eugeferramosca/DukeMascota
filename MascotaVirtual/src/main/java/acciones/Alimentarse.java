package acciones;

import enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {
    private AlmacenAlimentos comida;

    public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
        if (mascota.isLive()) {
            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
            contabilizarComida(mascota);
            contabilizarBebidas(mascota);
            if (mascota.getAgua().tieneQueTomarAgua(mascota)) {
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 1);
                Morir.checkStatusGeneral(mascota);
                if (mascota.isLive()) {
                    Morir.checkStatusGeneral(mascota);
                    System.out.println("Esta mascota necesita tomar agua ");
                }else{
                    Morir.checkStatusGeneral(mascota);
                    System.out.println("Esta mascota necesita tomar agua ");

                }
            }
            if (mascota.getPopo().tieneQueEvacuar(mascota)) {
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
                Morir.checkStatusGeneral(mascota);
                if (mascota.isLive()) {
                    System.out.println("Esta mascota necesita ir al baño ");
                }
            }else{
                Morir.checkStatusGeneral(mascota);
                System.out.println("Esta mascota necesita ir al baño ");
            }
            // System.out.println("duke come " + comida + " y su energia sube a " + mascota.getNivelEnergia());
        } else {
            Morir.checkStatusGeneral(mascota);
            System.out.println("Lo siento , esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
    }

    private void contabilizarComida(Mascota mascota) {
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
    }

    private void contabilizarBebidas(Mascota mascota) {
        mascota.setBebidasIngeridas(mascota.getBebidasIngeridas() + 1);

    }
}
