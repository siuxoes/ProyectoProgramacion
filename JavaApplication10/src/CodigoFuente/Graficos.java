package CodigoFuente;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;
/**
 *
 * @author Siuxoes
 */
public class Graficos {
    
  /**
   * Método para generar un gráfico en función
   * de las preguntas acertadas y falladas que tengas
   * @param acertadas
   * @param falladas
   * @param nombre 
   * @return 
   */
    public static void generarGrafico(int acertadas, int falladas, String nombre) {
        FileOutputStream output=null;
        File fichero;
        try{
            DefaultCategoryDataset dcd = new DefaultCategoryDataset();
            dcd.addValue(acertadas, "Acertadas", "");
            dcd.addValue(falladas, "Falladas", "");  
            JFreeChart jf = ChartFactory.createBarChart3D("", "", "Respuestas", dcd, PlotOrientation.HORIZONTAL, true, true, true);
            jf.setBackgroundPaint(Color.WHITE);
            fichero = new File("./src/imagenes/"+nombre+".png");
            if(fichero.exists()){
                fichero.delete();
            }
            output=new FileOutputStream(fichero, true);
            ChartUtilities.writeChartAsPNG(output, jf, 350, 250);            
        }catch(IOException e){

        }       
    }
}
