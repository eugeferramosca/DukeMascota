package acciones;

import modelos.Mascota;

public class Hidratarse {
    public boolean tieneQueTomarAgua(Mascota mascota) {
        return mascota.getComidasIngeridas() > 1;
    }

    public void hidratar (Mascota mascota) {
        if (tieneQueTomarAgua(mascota)) {
            mascota.setBebidasIngeridas(mascota.getBebidasIngeridas()+1);
        }
    }
}
