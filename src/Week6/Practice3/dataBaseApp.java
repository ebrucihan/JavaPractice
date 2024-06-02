package Week6.Practice3;

import java.sql.*;

public class dataBaseApp {

    // Veritabanı URL'si, kullanıcı adı ve şifre tanımlama
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/PatikaPractice";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "0508";

    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;

        try {

            // Veritabanı bağlantısı oluşturulma
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();

            // SQL insert ifadelerini tanımlama
            String insertSql = "INSERT INTO employees (name, position, salary) VALUES ('Ömer Ezer', 'Müfettiş', '70000')";
            String insertSql2 ="INSERT INTO employees (name, position, salary) VALUES ('Damla Yüce', 'İnsan Kaynakları Uzmanı', '50000')";
            String insertSql3 ="INSERT INTO employees (name, position, salary) VALUES ('Beyza Coşkun', 'Öğretmen', '40000')";
            String insertSql4 ="INSERT INTO employees (name, position, salary) VALUES ('Mehmet Yılmaz', 'Banka Müdürü', '90000')";
            String insertSql5 ="INSERT INTO employees (name, position, salary) VALUES ('İsmail Eren', 'Bilgisayar Mühendisi', '60000')";

            // SQL insert ifadelerini ekleme
            System.out.println(st.executeUpdate(insertSql));
            System.out.println(st.executeUpdate(insertSql2));
            System.out.println(st.executeUpdate(insertSql3));
            System.out.println(st.executeUpdate(insertSql4));
            System.out.println(st.executeUpdate(insertSql5));

            // SQL select ifadesini tanımlama
            String sql = "SELECT id, name, position, salary FROM employees";


            ResultSet resultSet = st.executeQuery(sql);

            // ResultSet içindeki verilerin okunması ve yazdırılması
            while (resultSet.next()) {
                // take data
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");


                System.out.println("ID: " + id);
                System.out.println("İsim: " + name);
                System.out.println("Poziyon: " + position);
                System.out.println("Maaş: " + salary);
                System.out.println("=======================");
            }
            resultSet.close();


        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            // Kaynakları kapama
            try {
                if (statement!= null)
                    statement.close();
                if (connect != null)
                    connect.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}