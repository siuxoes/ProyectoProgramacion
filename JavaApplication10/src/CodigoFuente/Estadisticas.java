package CodigoFuente;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Estadisticas extends OperacionesConBD {

    /**
     * Método para enviar las estadísticas
     * a la base de datos
     * @param instruccion
     * @throws SQLException
     * @return 
     */
    public void enviarEstadisticas(String instruccion) throws SQLException {
        Statement st = null;
        try {
            Connection con = getConnection();
            String query = instruccion;
            st = (Statement) con.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            st.close();
        }
    }

    /**
     * Método para consultar las estadísticas
     * en la base de datos
     * @param tema
     * @return arr[]
     */
    public int[] pedirEstadisticas(int tema) {
        int[] arr = new int[3];
        String query;
        if (tema == 0) {
            query = "select sum(acertadas) as acertadas, sum(falladas) as falladas, sum(falladas+acertadas) as totales from estadisticas ";
        } else {
            query = "select sum(acertadas) as acertadas, sum(falladas) as falladas, sum(falladas+acertadas) as totales from estadisticas where tema=" + tema + "";
        }
        ;
        try {
            Connection conexion = getConnection();
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                arr[0] = rs.getInt("acertadas");
                arr[1] = rs.getInt("falladas");
                arr[2] = rs.getInt("totales");
                rs.next();
            }
        } catch (Exception e) {
        }
        return arr;
    }
    
}
