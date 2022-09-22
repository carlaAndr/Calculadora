/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programascalculadora;

/**
 *
 * @author elcachorrohumano
 */
public class InterfazGrafica extends javax.swing.JFrame {
    
    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        abrirParent = new javax.swing.JButton();
        cerrarParent = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        entre = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        por = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        textoOperacion = new javax.swing.JTextField();
        cambioSigno = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 23, 30));

        pantalla.setBackground(new java.awt.Color(20, 23, 30));
        pantalla.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        pantalla.setForeground(new java.awt.Color(255, 255, 255));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setActionCommand("<Not Set>");
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        abrirParent.setBackground(new java.awt.Color(20, 23, 30));
        abrirParent.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        abrirParent.setForeground(new java.awt.Color(27, 194, 105));
        abrirParent.setText("(");
        abrirParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirParentActionPerformed(evt);
            }
        });

        cerrarParent.setBackground(new java.awt.Color(20, 23, 30));
        cerrarParent.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cerrarParent.setForeground(new java.awt.Color(27, 194, 105));
        cerrarParent.setText(")");
        cerrarParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarParentActionPerformed(evt);
            }
        });

        potencia.setBackground(new java.awt.Color(20, 23, 30));
        potencia.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        potencia.setForeground(new java.awt.Color(27, 194, 105));
        potencia.setText("^");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(20, 23, 30));
        clear.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        clear.setForeground(new java.awt.Color(27, 194, 105));
        clear.setText("AC");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(20, 23, 30));
        siete.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(20, 23, 30));
        ocho.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(20, 23, 30));
        nueve.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        entre.setBackground(new java.awt.Color(20, 23, 30));
        entre.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        entre.setForeground(new java.awt.Color(27, 194, 105));
        entre.setText("/");
        entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(20, 23, 30));
        cuatro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(20, 23, 30));
        cinco.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(20, 23, 30));
        seis.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        por.setBackground(new java.awt.Color(20, 23, 30));
        por.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        por.setForeground(new java.awt.Color(27, 194, 105));
        por.setText("x");
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(20, 23, 30));
        uno.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(20, 23, 30));
        dos.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(20, 23, 30));
        tres.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(20, 23, 30));
        menos.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        menos.setForeground(new java.awt.Color(27, 194, 105));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(20, 23, 30));
        cero.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        punto.setBackground(new java.awt.Color(20, 23, 30));
        punto.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        punto.setForeground(new java.awt.Color(27, 194, 105));
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(27, 194, 105));
        igual.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(20, 23, 30));
        mas.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        mas.setForeground(new java.awt.Color(27, 194, 105));
        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        textoOperacion.setEditable(false);
        textoOperacion.setBackground(new java.awt.Color(20, 23, 30));
        textoOperacion.setForeground(new java.awt.Color(255, 255, 255));

        cambioSigno.setBackground(new java.awt.Color(20, 23, 30));
        cambioSigno.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cambioSigno.setForeground(new java.awt.Color(27, 194, 105));
        cambioSigno.setText("+/-");
        cambioSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioSignoActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(20, 23, 30));
        borrar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        borrar.setForeground(new java.awt.Color(27, 194, 105));
        borrar.setText("DEL");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nueve, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(abrirParent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cerrarParent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(por, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cambioSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(borrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entre)
                    .addComponent(potencia)
                    .addComponent(cerrarParent)
                    .addComponent(abrirParent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(por)
                    .addComponent(siete)
                    .addComponent(ocho)
                    .addComponent(nueve))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menos)
                    .addComponent(cuatro)
                    .addComponent(cinco)
                    .addComponent(seis))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas)
                    .addComponent(uno)
                    .addComponent(dos)
                    .addComponent(tres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(igual)
                    .addComponent(punto)
                    .addComponent(cero)
                    .addComponent(cambioSigno))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaActionPerformed

    private void cerrarParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarParentActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + (")"));
    }//GEN-LAST:event_cerrarParentActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("7"));
    }//GEN-LAST:event_sieteActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("1"));
    }//GEN-LAST:event_unoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("0"));
    }//GEN-LAST:event_ceroActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("2"));
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("3"));
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("4"));
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("5"));
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("6"));
    }//GEN-LAST:event_seisActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("8"));
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("9"));
    }//GEN-LAST:event_nueveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
        textoOperacion.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("^"));
    }//GEN-LAST:event_potenciaActionPerformed

    private void entreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("/"));
    }//GEN-LAST:event_entreActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("*"));
    }//GEN-LAST:event_porActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("-"));
    }//GEN-LAST:event_menosActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("+"));
    }//GEN-LAST:event_masActionPerformed

    private void abrirParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirParentActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("("));
    }//GEN-LAST:event_abrirParentActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("."));
    }//GEN-LAST:event_puntoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        textoOperacion.setText(pantalla.getText() + "=");
        pantalla.setText(MetodoFinal.calcula(pantalla.getText()));
    }//GEN-LAST:event_igualActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        int n = (pantalla.getText()).length();
        String texto;
        
        if (n > 0)
            texto = pantalla.getText().substring(0, n - 1);
        else
            texto = "";
        
        pantalla.setText(texto);
    }//GEN-LAST:event_borrarActionPerformed

    private void cambioSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioSignoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + ("m"));
        
    }//GEN-LAST:event_cambioSignoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirParent;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cambioSigno;
    private javax.swing.JButton cero;
    private javax.swing.JButton cerrarParent;
    private javax.swing.JButton cinco;
    private javax.swing.JButton clear;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dos;
    private javax.swing.JButton entre;
    private javax.swing.JButton igual;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton por;
    private javax.swing.JButton potencia;
    private javax.swing.JButton punto;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JTextField textoOperacion;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
