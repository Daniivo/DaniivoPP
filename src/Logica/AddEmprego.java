package Logica;

import java.io.Serializable;

/**
 * Created by Leandro on 11/04/2014.
 */
public class AddEmprego implements Serializable {

    private int id;
    private String titulo;
    private String detalhesEmprego;
    private String perfilCandidato;
    
   

    public AddEmprego(int id, String titulo, String detalhesEmprego, String perfilCandidato) {
        this.id = id;
        this.titulo = titulo;
        this.detalhesEmprego = detalhesEmprego;
    }

    public AddEmprego(String titulo, String detalhesEmprego, String perfilCandidato) {
        this.titulo = titulo;
        this.detalhesEmprego = detalhesEmprego;
        this.perfilCandidato = perfilCandidato;
    }

    public int getId() {
        return id;
    }

    public String getdetalhesEmprego() {
        return detalhesEmprego;
    }

    public String getPerfilCandidato() {
        return perfilCandidato;
    }
}
