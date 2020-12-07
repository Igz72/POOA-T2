package br.ufscar.dc.pooa.t2.site;

import java.io.IOException;
import java.util.Vector;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import br.ufscar.dc.pooa.t2.output.StrategyOutput;
import br.ufscar.dc.pooa.t2.utils.Noticia;

public abstract class StrategySite {
    protected StrategyOutput output;
    protected Document documentoHTML;
    protected Elements titulos;
    protected Vector<Noticia> noticias;

    public StrategySite(StrategyOutput output) {
        this.output = output;
        this.noticias = new Vector<Noticia>();
    }

    public void processarNoticias() {
        try {
            obterDocumentoHTML();
            obterTitulos();
            criarListaNoticias();
            output.processarNoticias(noticias);
        } catch (IOException e) {
            System.out.println("Erro ao acessar o site");
        }
    }

    protected abstract void obterDocumentoHTML() throws IOException;

    protected abstract void obterTitulos();

    protected abstract void criarListaNoticias();
}
