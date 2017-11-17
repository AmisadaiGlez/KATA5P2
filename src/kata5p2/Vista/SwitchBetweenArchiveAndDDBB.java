package kata5p2.Vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kata5p2.Modelo.Mail;

public class SwitchBetweenArchiveAndDDBB {

    public static List<Mail> read(String fileName) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        List<Mail> mailList = new ArrayList<>();
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indique si desea visualizar un histograma desde un archivo o una base de datos: ");
            String selection=scanner.nextLine();
            switch (selection) {
                case "Base de datos":
                case "base de datos":
                case "BBDD":
                    return mailList=MailListReaderDDBB.read(fileName);
                case "Archivo":
                case "archivo":
                    return mailList=MailListReader.read(fileName);
                default:
                    System.out.println("Introduca una opción válida.");
                    break;
            }
        }
    }
}
