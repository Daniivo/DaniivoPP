package Logica;

/**
 * Created by Leandro on 11/04/2014.
 */
public abstract class Oferta {
    public static enum ESTADOS_POSSIVEIS {POR_APROVAR, APROVACAO_PROVISORIA, TERMINADO};
    public static enum AREA_ATUACAO {REDES, DESENVOLVIMENTO, BASES_DE_DADOS};

    private ESTADOS_POSSIVEIS estado = ESTADOS_POSSIVEIS.POR_APROVAR;

    public ESTADOS_POSSIVEIS getEstado() {
        return estado;
    }

    public void setEstado(ESTADOS_POSSIVEIS estado) {
        this.estado = estado;
    }
}