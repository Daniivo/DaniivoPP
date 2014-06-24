package Logica;

import java.io.Serializable;

/**
 * Created by Leandro on 11/04/2014.
 */
public class OfertaRecursos extends Oferta implements Serializable {

    private int id;
    private String nome;
    private String contacto;
    private Oferta.AREA_ATUACAO areaAtuacao;

    public OfertaRecursos(String nome, String contacto, Oferta.AREA_ATUACAO areaAtuacao) {
        this.nome = nome;
        this.contacto = contacto;
        this.areaAtuacao = areaAtuacao;
    }

    public OfertaRecursos(Oferta.AREA_ATUACAO areaAtuacao, int id, String nome, String contacto) {
        this.areaAtuacao = areaAtuacao;
        this.id = id;
        this.nome = nome;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getContacto() {
        return contacto;
    }

    public AREA_ATUACAO getAreaAtuacao() {
        return areaAtuacao;
    }
}
