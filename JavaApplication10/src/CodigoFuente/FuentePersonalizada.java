package CodigoFuente;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class FuentePersonalizada {

    private Font font = null;

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

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
 */
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