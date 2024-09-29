import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class ExoJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ProjetDeveloppeurs";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             Scanner scanner = new Scanner(System.in)) {

            // (1) Demander à l'utilisateur d'entrer une requête
            System.out.println("Veuillez entrer une requête SQL :");
            String userQuery = scanner.nextLine();

            // Exécuter la requête
            boolean hasResultSet = stmt.execute(userQuery);

            if (hasResultSet) {
                // (2) La requête produit un ResultSet
                ResultSet rs = stmt.getResultSet();
                ResultSetMetaData rsMeta = rs.getMetaData();

                // (a) Afficher le nombre de colonnes
                int columnCount = rsMeta.getColumnCount();
                System.out.println("Nombre de colonnes dans le résultat : " + columnCount);

                // (b) Afficher le nom et le type de chaque colonne
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = rsMeta.getColumnName(i);
                    String columnType = rsMeta.getColumnTypeName(i);
                    System.out.println("Colonne " + i + " : " + columnName + " (Type : " + columnType + ")");
                }

                // (c) Afficher les données de chaque ligne
                System.out.println("\nContenu de la table :");
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println();
                }
                rs.close();
            } else {
                // (3) La requête modifie des lignes (ex: INSERT, UPDATE, DELETE)
                int rowsAffected = stmt.getUpdateCount();
                System.out.println("Nombre de lignes affectées : " + rowsAffected);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
