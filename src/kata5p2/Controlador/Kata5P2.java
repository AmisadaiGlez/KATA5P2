package kata5p2.Controlador;

import java.io.IOException;
import java.util.List;
import kata5p2.Modelo.Histogram;
import kata5p2.Modelo.Mail;
import kata5p2.Vista.HistogramDisplay;
import kata5p2.Vista.MailHistogramBuilder;
import kata5p2.Vista.MailListReader;

public class Kata5P2 {
    
/*
Se modifica la clase de Control, Kata4, usando el patrón de
diseño CIPO: se deben crear los módulos de control execute(), de
entrada input(), de proceso process() y de salida output().
*/

    
    private List<Mail> mailList;
    private Histogram<String> histogram;
   
    public static void main(String[] args) throws IOException {
      Kata5P2 kata5p2=new Kata5P2();
      kata5p2.execute();
    }
    
    void execute() throws IOException {
        input();
        process();
        output();
    }
    
    void input() throws IOException {
        String fileName="emails.txt";
        mailList=MailListReader.read(fileName);
    }
    
    void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
