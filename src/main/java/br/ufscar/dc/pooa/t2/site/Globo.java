package br.ufscar.dc.pooa.t2.site;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import br.ufscar.dc.pooa.t2.output.StrategyOutput;
import br.ufscar.dc.pooa.t2.utils.Noticia;

public class Globo extends StrategySite {

    public Globo(StrategyOutput output) {
        super(output);
    }

    @Override
    public void obterDocumentoHTML() throws IOException {
        documentoHTML = Jsoup.connect("https://www.globo.com").get();
    }

    @Override
    public void obterTitulos() {
        titulos = documentoHTML.select("p.hui-premium__title");
    }

    @Override
    public void criarListaNoticias() {
        for (Element t : titulos) {
            Element parent = t.parent();
            while (parent != null && !parent.tagName().equals("a")) {
                parent = parent.parent();
            }
            if (parent != null && parent.tagName().equals("a")) {
                noticias.add(new Noticia(t.text(), parent.attr("href")));
            } else {
                System.out.println("Erro ao incorporar os links");
            }
        }
    }
}
