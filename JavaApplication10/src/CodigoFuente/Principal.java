package CodigoFuente;

public class Principal extends Estadisticas {
     
    /**
     * Main que inializa todo el programa, ejecutando
     * el inicio, es decir, Categorias.
     * @param args 
     */
        public static void main(String[] args){
            Categorias llamada = new Categorias();
            llamada.setVisible(true);
            llamada.setResizable(false);
        }
	
}
