package br.ufscar.dc.pooa.t2.utils;

public class Noticia {
    private String titulo;
    private String link;

    public Noticia(String titulo, String link) {
        this.titulo = titulo;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLink() {
        return link;
    }
}
