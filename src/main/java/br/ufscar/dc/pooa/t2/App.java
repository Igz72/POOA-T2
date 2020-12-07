package br.ufscar.dc.pooa.t2;

import java.io.IOException;

import br.ufscar.dc.pooa.t2.output.OutputCSV;
import br.ufscar.dc.pooa.t2.site.Globo;
import br.ufscar.dc.pooa.t2.site.StrategySite;

public class App {
    public static void main(String[] args) throws IOException {

        StrategySite site = new Globo(new OutputCSV());

        site.processarNoticias();
    }
}
