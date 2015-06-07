package CodigoFuente;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class FuentePersonalizada {

    private Font font = null;

    /**
     * Recibe el nombre de al fuenta a cargar
     * y comprueba si ésta existe, si es así 
     * la carga, sino carga la fuente Arial.
     * @param nombreFuente 
     */
    public FuentePersonalizada(String nombreFuente) {
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream("/Fuentes/"+nombreFuente);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(nombreFuente + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
  }

    /**
     * Método para cargar una fuente propia
     * @param estilo
     * @param tamanio
     * @return tfont
     */
    public Font MyFont( int estilo, float tamanio)
    {
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }

}