
package CodigoFuente;
import java.applet.AudioClip;
import java.util.LinkedList;


/**
 *
 * @author Siuxoes
 */
public final class Test extends javax.swing.JFrame {
    private String titulo;
    private Pregunta p1;
    private Principal principal1;
    private int cont=10;
    private int contPreguntas=1;
    private int contFinal=19;
    FuentePersonalizada cf;
    private LinkedList<Pregunta> listaTextos = new LinkedList<>();
    private int acertadas=0;
    private int falladas=0;
    String Ra="",Rb="",Rc="",Rd="";
    private String opcionUsuario;

    public Test(int tema){
        titulo="";
        principal1 = new Principal();
        int primeraPregunta = principal1.devolverPrimeraPregunta(tema);
        int ultimaPregunta = principal1.devolverUltimaPregunta(tema);
        listaTextos=principal1.devolverListaPreguntas(primeraPregunta, ultimaPregunta);
        p1=listaTextos.pop();
        if(tema==1){
         cf = new FuentePersonalizada("LOL.ttf");
         titulo="League Of Legends";
        }else if(tema==2){
            titulo="Anime";
          cf = new FuentePersonalizada("Anime.ttf");
        }else if(tema==3){
            titulo="World of Warcraft";
            cf = new FuentePersonalizada("WOW.ttf");
        }
        tieneImagen(p1);
        initComponents();
    }
    
    public Test(){
      
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tab2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        fallaste = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Enunciado = new javax.swing.JTextPane();
        acertaste = new javax.swing.JLabel();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        Acertadas = new javax.swing.JLabel();
        Falladas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        verImagen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test League of Legends");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(600, 637));
        setMinimumSize(new java.awt.Dimension(600, 637));
        setPreferredSize(new java.awt.Dimension(600, 637));
        setResizable(false);

        jPanel3.setMaximumSize(new java.awt.Dimension(585, 637));
        jPanel3.setMinimumSize(new java.awt.Dimension(585, 637));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(585, 637));

        Titulo.setFont(cf.MyFont(1, 22f));
        Titulo.setText(titulo);

        contador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contador.setText(contPreguntas +" de 10 preguntas");

        fallaste.setBackground(new java.awt.Color(255, 0, 51));
        fallaste.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fallaste.setForeground(new java.awt.Color(255, 0, 51));
        fallaste.setText("Fallaste");

        Enunciado.setEditable(false);
        Enunciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Enunciado.setText(p1.getEnunciado());
        Enunciado.setToolTipText("");
        jScrollPane1.setViewportView(Enunciado);

        acertaste.setBackground(new java.awt.Color(51, 255, 51));
        acertaste.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acertaste.setForeground(new java.awt.Color(51, 255, 51));
        acertaste.setText("Acertaste");

        a.setText(p1.getOpcionA());
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setText(p1.getOpcionB());
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.setText(p1.getOpcionC());
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setText(p1.getOpcionD());
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        Acertadas.setText("Acertadas: " +acertadas
        );

        Falladas.setText("Falladas: "+falladas);

        jButton1.setText("Volver a Categorias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        verImagen.setText("Ver Imagen");
        verImagen.setToolTipText("");
        verImagen.setFocusCycleRoot(true);
        verImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Acertadas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Falladas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel3Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(acertaste, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fallaste, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(88, 88, 88))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acertadas)
                    .addComponent(Falladas)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(100, 100, 100)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(acertaste)
                        .addComponent(fallaste))
                    .addGap(449, 449, 449)))
        );

        fallaste.setVisible(false);
        acertaste.setVisible(false);
        jButton1.setVisible(false);
        verImagen.setVisible(false);

        Tab2.addTab("Test", jPanel3);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Tab2.addTab("Imagen", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verImagenActionPerformed
        Tab2.setSelectedIndex(1);
    }//GEN-LAST:event_verImagenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Categorias().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        verificarRespuesta(principal1.comprobarRespuesta(d.getText(), p1));
        actualizar();
    }//GEN-LAST:event_dActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        verificarRespuesta(principal1.comprobarRespuesta(c.getText(), p1));
        actualizar();
    }//GEN-LAST:event_cActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        verificarRespuesta(principal1.comprobarRespuesta(b.getText(), p1));
        actualizar();
    }//GEN-LAST:event_bActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        verificarRespuesta(principal1.comprobarRespuesta(a.getText(), p1));
        actualizar();
    }//GEN-LAST:event_aActionPerformed

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked

    }//GEN-LAST:event_aMouseClicked
                            public void actualizar(){
        
        contPreguntas++;
        Acertadas.setText("Acertadas: " +acertadas);
        Falladas.setText("Falladas: " +falladas);
       if(cont<=principal1.devolverUltimaPregunta(1)){
            p1=listaTextos.pop();
            System.out.println();
            Enunciado.setText(p1.getEnunciado());
            contador.setText(contPreguntas +" de 10 preguntas");
            a.setText(p1.getOpcionA());
            b.setText(p1.getOpcionB());
            c.setText(p1.getOpcionC());
            d.setText(p1.getOpcionD());
            tieneImagen(p1);
        } else{    
           
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
            d.setVisible(false);
            Enunciado.setVisible(false);
            contador.setVisible(false);
            jButton1.setVisible(true);
            acertaste.setVisible(false);
            fallaste.setVisible(false);
       }
    }
    public void verificarRespuesta(boolean resultado){
      
        cont++;
             if(verImagen.isVisible()){
         verImagen.setVisible(false);
     }
        if(fallaste.isVisible() || acertaste.isVisible()){
            fallaste.setVisible(false);
            acertaste.setVisible(false);
        }
        if(!resultado){
                        AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Error.wav"));

            sonido.play();
            falladas++;
            fallaste.setVisible(true);
        }
        else{
                        AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Acierto.wav"));

            sonido.play();
            acertadas++;
            acertaste.setVisible(true);
        }
    }
    
    	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acertadas;
    private javax.swing.JTextPane Enunciado;
    private javax.swing.JLabel Falladas;
    private javax.swing.JTabbedPane Tab2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton a;
    private javax.swing.JLabel acertaste;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JLabel contador;
    private javax.swing.JButton d;
    private javax.swing.JLabel fallaste;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton verImagen;
    // End of variables declaration//GEN-END:variables
   
    public void tieneImagen(Pregunta p1){
        try{
     if(!p1.getNombreImagen().equalsIgnoreCase("")){
         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+p1.getNombreImagen())));
         verImagen.setVisible(true);
     }
        }catch(NullPointerException npe){}

    }
        public void areYouSure(){
    }

    /**
     * @return the p1
     */
    public Pregunta getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Pregunta p1) {
        this.p1 = p1;
    }
}
