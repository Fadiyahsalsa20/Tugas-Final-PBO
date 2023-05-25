package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
import javax.swing.JOptionPane;
 
public class konek {
    static Connection Koneksi;
    public static Connection getConnection(){
        try {
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/nilai_mahasiswa", "root", "");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return Koneksi;
    }
 

}
