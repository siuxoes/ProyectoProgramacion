package CodigoFuente;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.sql.SQLException;

public class Principal extends Estadisticas {

	private static Scanner in;

	
                
        
        public static void main(String[] args){

            Categorias llamada = new Categorias();
             llamada.setVisible(true);
            llamada.setResizable(false);
        }
	/**
	public static void main(String[] args){
		Principal temp = new Principal();
		int primera = temp.devolverPrimeraPregunta(2);
		int ultima = temp.devolverUltimaPregunta(2);
		LinkedList<Pregunta> lista =temp.devolverListaPreguntas(primera, ultima);
		in = new Scanner(System.in);
		Pregunta algo = lista.pop();
			System.out.println(algo.getEnunciado());
			System.out.println(algo.getOpcionA());
			System.out.println(algo.getOpcionB());
			System.out.println(algo.getOpcionC());
			System.out.println(algo.getOpcionD());
			String entrada = in.nextLine();
			System.out.println(temp.comprobarRespuesta(entrada, algo));
	}*/

}
