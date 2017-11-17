package kata5p2.Vista;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5p2.Modelo.Mail;

public class MailListReaderDDBB {

    public static List<Mail> read(String fileName) throws ClassNotFoundException, SQLException, FileNotFoundException {
        List<Mail> mailList = new ArrayList<>();
        Class.forName ("org.sqlite.JDBC");
        String urlConection = "jdbc:sqlite:KATA5.db";
        Connection connection = DriverManager.getConnection(urlConection);
        
        Statement statement = connection.createStatement();
        String query = "Select * from MAIL";
        ResultSet rs = statement.executeQuery(query);
        
        while(rs.next()){
            if(!rs.getString("Mail").contains("@")) continue;
            mailList.add(new Mail(rs.getString("Mail")));
        }
        
        return mailList;
    }
    
}
