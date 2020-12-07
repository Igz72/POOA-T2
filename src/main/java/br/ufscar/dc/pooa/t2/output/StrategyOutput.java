package br.ufscar.dc.pooa.t2.output;

import java.util.Vector;

import br.ufscar.dc.pooa.t2.utils.Noticia;

public interface StrategyOutput {
    public void processarNoticias(Vector<Noticia> noticias);
}
