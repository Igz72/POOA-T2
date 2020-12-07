package br.ufscar.dc.pooa.t2.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

import br.ufscar.dc.pooa.t2.utils.Noticia;

public class OutputCSV implements StrategyOutput {

    @Override
    public void processarNoticias(Vector<Noticia> noticias) {
        try {
            String strNow = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss").format(LocalDateTime.now());
            PrintWriter pw = new PrintWriter(new FileWriter(new File(String.format("dump-%s.csv", strNow))));

            pw.println("Tipo;Notícia;Link");

            for (Noticia n : noticias) {
                pw.println("Principal;" + n.getTitulo() + ";\"" + n.getLink() + "\";");
            }

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo CSV");
        }
    }
}
