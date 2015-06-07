package CodigoFuente;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.LinkedList;

public class OperacionesConBD {

    /**
     * Metodo que devuelve la conexión a la base de datos
     * @return
     * @throws Exception 
     */
    protected static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/base";
        String username = "root";
        String password = "";
        Class.forName(driver);
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        return con;
    }

    /**
     * Metodo que se conecta a la base de datos
     * ejecuta query, y devuelve una sola sentencia
     * @param query
     * @return 
     */
    public static String conectar(String query) {
        String cadena = "";
        try {
            Connection conexion = getConnection();
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                cadena += rs.getString(1);
                rs.next();
            }
        } catch (Exception e) {
        }
        return cadena;
    }

    /**
     * Metodo que crea un objeto
     * de la clase Pregunta segun el 
     * identificador único.
     * @param identificador
     * @return 
     */
    public Pregunta crearPregunta(int identificador) {
        Pregunta temp = null;
        try {
            Connection con = getConnection();
            String query = "SELECT iden, pregunta, a, b, c, respuesta, linkImagen from preguntas where iden=" + identificador;
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int iden = Integer.parseInt(rs.getString("iden"));
                String enunciado = rs.getString("pregunta");
                String a = rs.getString("a");
                String b = rs.getString("b");
                String c = rs.getString("c");
                String d = rs.getString("respuesta");
                String imagen = rs.getString("linkImagen");
                LinkedList<String> listaTemporal = new LinkedList<>();
                listaTemporal.add(a);
                listaTemporal.add(b);
                listaTemporal.add(c);
                listaTemporal.add(d);
                Collections.shuffle(listaTemporal);
                temp = new Pregunta(iden, enunciado, listaTemporal.pop(), listaTemporal.pop(), listaTemporal.pop(), listaTemporal.pop(), imagen);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return temp;
    }

    /**
     * Metodo que devuelve el indice de
     * la primera pregunta de un tema
     * @param tema
     * @return 
     */
    public int devolverPrimeraPregunta(int tema) {
        return Integer.parseInt(conectar("select iden from preguntas where tema=" + tema + " limit 1"));
    }

    /**
     * Metodo que devuelve el indice de
     * la ultima pregunta de un tema
     * @param tema
     * @return 
     */
    public int devolverUltimaPregunta(int tema) {
        return Integer.parseInt(conectar("select iden from preguntas where tema=" + tema + " order by 1 desc limit 1"));
    }

    /**
     * Crea una lista con los indices de las preguntas(numericos)
     * @param primera
     * @param ultima
     * @return 
     */
    public LinkedList<Integer> crearListaIndicePreguntas(int primera, int ultima) {
        LinkedList<Integer> listaPreguntas = new LinkedList<>();
        for (int i = primera; i <= ultima; i++) {
            listaPreguntas.add(i);
        }
        Collections.shuffle(listaPreguntas);
        return listaPreguntas;
    }

    /**
     * Crea una lista con objetos preguntas, que recibe de una lista de 
     * indice de preguntas
     * @param primeraPregunta
     * @param ultimaPregunta
     * @return 
     */
    public LinkedList<Pregunta> devolverListaPreguntas(int primeraPregunta, int ultimaPregunta) {
        LinkedList<Pregunta> lista = new LinkedList<Pregunta>();
        LinkedList<Integer> listaPreguntasIndice = crearListaIndicePreguntas(primeraPregunta, ultimaPregunta);
        for (Integer id : listaPreguntasIndice) {
            Pregunta temp = crearPregunta(id);
            lista.add(temp);
        }
        return lista;
    }
    /**
     * Metodo que conecta con la base de datos y devuelve la respuesta
     * segun el identificador una pregunta
     * y comprueba con la entrada de usuario
     * @param resp
     * @param p1
     * @return 
     */
    public boolean comprobarRespuesta(String resp, Pregunta p1) {
        String respCorrecta = conectar("select respuesta from preguntas where iden=" + p1.getIdentificador());
        return resp.equalsIgnoreCase(respCorrecta);
    }
    
}
