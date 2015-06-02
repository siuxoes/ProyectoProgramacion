/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFuente;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;
/**
 *
 * @author Siuxoes
 */
public class Graficos {
    
  
    public static void generarGrafico(int acertadas, int falladas, String nombre) {
        FileOutputStream output=null;
        try{
            DefaultCategoryDataset dcd = new DefaultCategoryDataset();
            dcd.addValue(acertadas, "Acertadas", "");
            dcd.addValue(falladas, "Falladas", "");  
            JFreeChart jf = ChartFactory.createBarChart3D("", "", "Respuestas", dcd, PlotOrientation.HORIZONTAL, true, true, true);
            output=new FileOutputStream("./src/imagenes/"+nombre+".jpeg", true);
            ChartUtilities.writeChartAsJPEG(output, jf, 350, 250);
             
        }catch(IOException e){

        }
        finally{
            try {
                output.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
