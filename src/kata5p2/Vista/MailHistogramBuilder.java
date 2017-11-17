package kata5p2.Vista;

import java.util.List;
import kata5p2.Modelo.Histogram;
import kata5p2.Modelo.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histo= new Histogram<String>();
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
    
}
