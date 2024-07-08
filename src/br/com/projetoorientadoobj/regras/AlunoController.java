package br.com.projetoorientadoobj.regras;

public class AlunoController {

    public Double calcularMedia(Double somatorio, Integer qtd) {
        Double media = 0.0;

        media = somatorio / qtd;

        return media;
    }

}
