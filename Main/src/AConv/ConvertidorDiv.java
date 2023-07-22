/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AConv;

import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * @author Ariel L
 */
public class ConvertidorDiv extends javax.swing.JPanel {

    public ConvertidorDiv() {
        initComponents();
        ConvertidorDiv.this.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new AConv.PanelRound();
        ConvP = new AConv.PanelRound();
        Lista2 = new AConv.PanelRound();
        List2 = new javax.swing.JComboBox<>();
        panelRound5 = new AConv.PanelRound();
        TextOut = new javax.swing.JTextField();
        panelRound6 = new AConv.PanelRound();
        TextIn = new javax.swing.JTextField();
        BtnClear = new AConv.PanelRound();
        x = new AConv.PanelRound();
        List1 = new javax.swing.JComboBox<>();
        botonConvertir = new AConv.PanelRound();
        MovBar = new AConv.PanelRound();
        MovBar1 = new AConv.PanelRound();

        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(300, 300));

        BG.setBackground(new java.awt.Color(51, 51, 51));
        BG.setRoundBottomRight(30);
        BG.setRoundTopRight(30);

        ConvP.setBackground(new java.awt.Color(255, 255, 255));
        ConvP.setRoundBottomLeft(10);
        ConvP.setRoundBottomRight(10);
        ConvP.setRoundTopLeft(10);
        ConvP.setRoundTopRight(10);

        Lista2.setBackground(new java.awt.Color(51, 51, 51));
        Lista2.setRoundBottomLeft(20);
        Lista2.setRoundBottomRight(20);
        Lista2.setRoundTopLeft(20);
        Lista2.setRoundTopRight(20);

        List2.setBackground(new java.awt.Color(51, 51, 51));
        List2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        List2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colon", "Dolar", "Yen", "LibraS", "Won" }));
        List2.setToolTipText("");
        List2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Lista2Layout = new javax.swing.GroupLayout(Lista2);
        Lista2.setLayout(Lista2Layout);
        Lista2Layout.setHorizontalGroup(
            Lista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 109, Short.MAX_VALUE)
        );
        Lista2Layout.setVerticalGroup(
            Lista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelRound5.setBackground(new java.awt.Color(102, 102, 102));
        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);

        TextOut.setBackground(new java.awt.Color(102, 102, 102));
        TextOut.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TextOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextOut.setBorder(null);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextOut)
                .addContainerGap())
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextOut, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound6.setBackground(new java.awt.Color(102, 102, 102));
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);

        TextIn.setBackground(new java.awt.Color(102, 102, 102));
        TextIn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TextIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextIn.setBorder(null);
        TextIn.setSelectionColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextIn)
                .addContainerGap())
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextIn, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnClear.setBackground(new java.awt.Color(51, 51, 51));
        BtnClear.setRoundBottomLeft(99);
        BtnClear.setRoundBottomRight(99);
        BtnClear.setRoundTopLeft(99);
        BtnClear.setRoundTopRight(99);
        BtnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnClearMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BtnClearLayout = new javax.swing.GroupLayout(BtnClear);
        BtnClear.setLayout(BtnClearLayout);
        BtnClearLayout.setHorizontalGroup(
            BtnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        BtnClearLayout.setVerticalGroup(
            BtnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        x.setBackground(new java.awt.Color(51, 51, 51));
        x.setRoundBottomLeft(20);
        x.setRoundBottomRight(20);
        x.setRoundTopLeft(20);
        x.setRoundTopRight(20);

        List1.setBackground(new java.awt.Color(51, 51, 51));
        List1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        List1.setForeground(new java.awt.Color(255, 255, 255));
        List1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Colon", "Yen", "LibraS", "Won" }));
        List1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        List1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout xLayout = new javax.swing.GroupLayout(x);
        x.setLayout(xLayout);
        xLayout.setHorizontalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        xLayout.setVerticalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        botonConvertir.setBackground(new java.awt.Color(102, 102, 102));
        botonConvertir.setRoundBottomLeft(99);
        botonConvertir.setRoundBottomRight(99);
        botonConvertir.setRoundTopLeft(99);
        botonConvertir.setRoundTopRight(99);
        botonConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonConvertirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout botonConvertirLayout = new javax.swing.GroupLayout(botonConvertir);
        botonConvertir.setLayout(botonConvertirLayout);
        botonConvertirLayout.setHorizontalGroup(
            botonConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        botonConvertirLayout.setVerticalGroup(
            botonConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ConvPLayout = new javax.swing.GroupLayout(ConvP);
        ConvP.setLayout(ConvPLayout);
        ConvPLayout.setHorizontalGroup(
            ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConvPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ConvPLayout.createSequentialGroup()
                        .addGroup(ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Lista2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addGroup(ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonConvertir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        ConvPLayout.setVerticalGroup(
            ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConvPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ConvPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        MovBar.setBackground(new java.awt.Color(51, 51, 51));
        MovBar.setRoundBottomLeft(33);
        MovBar.setRoundBottomRight(33);
        MovBar.setRoundTopLeft(33);
        MovBar.setRoundTopRight(33);
        MovBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovBarMouseDragged(evt);
            }
        });
        MovBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MovBarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MovBarLayout = new javax.swing.GroupLayout(MovBar);
        MovBar.setLayout(MovBarLayout);
        MovBarLayout.setHorizontalGroup(
            MovBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MovBarLayout.setVerticalGroup(
            MovBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        MovBar1.setBackground(new java.awt.Color(51, 51, 51));
        MovBar1.setRoundBottomLeft(33);
        MovBar1.setRoundBottomRight(33);
        MovBar1.setRoundTopLeft(33);
        MovBar1.setRoundTopRight(33);
        MovBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovBar1MouseDragged(evt);
            }
        });
        MovBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovBar1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout MovBar1Layout = new javax.swing.GroupLayout(MovBar1);
        MovBar1.setLayout(MovBar1Layout);
        MovBar1Layout.setHorizontalGroup(
            MovBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MovBar1Layout.setVerticalGroup(
            MovBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addComponent(MovBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(MovBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGap(29, 495, Short.MAX_VALUE)
                .addComponent(ConvP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addComponent(MovBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(MovBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonConvertirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConvertirMousePressed
    String valorTexto = TextIn.getText();
    double valor;
    
    try {
    if (valorTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor");
       return;
    } 
    valor = Double.parseDouble(valorTexto);
    
    if (valor < 0) {
        JOptionPane.showMessageDialog(null, "Por favor, utilice solamente numeros positivos");
        return;
    }
    } catch (NumberFormatException Letras) {   
    JOptionPane.showMessageDialog(null, "Por favor, unicamente utilice numeros");
    return;
    }

    String divisaOrigen = (String) List1.getSelectedItem();
    String divisaDestino = (String) List2.getSelectedItem();
    
    if (divisaOrigen.equals(divisaDestino)) {
    JOptionPane.showMessageDialog(null, "Las monedas a convertir tiene que ser distintas");
    }

    if (List1.getSelectedIndex() == -1) {
        List1.addItem("Dolar");
        List1.addItem("Colon");
        List1.addItem("Yen");
        List1.addItem("LibraS");
        List1.addItem("Won");
    }
    if (List2.getSelectedIndex() == -1) {
        List2.addItem("Dolar");
        List2.addItem("Colon");
        List2.addItem("Yen");
        List2.addItem("LibraS");
        List2.addItem("Won");
    }

  double resultado = 0.0;

if (divisaOrigen.equals("Dolar") && divisaDestino.equals("Colon")) {
    resultado = valor * 8.5;
} else if (divisaOrigen.equals("Colon") && divisaDestino.equals("Dolar")) {
    resultado = valor * 0.12;
}
if (divisaOrigen.equals("Dolar") && divisaDestino.equals("Yen")) {
    resultado = valor * 144.39;
} else if (divisaOrigen.equals("Yen") && divisaDestino.equals("Dolar")) {
    resultado = valor * 0.0069;
}
if (divisaOrigen.equals("Dolar") && divisaDestino.equals("LibraS")) {
    resultado = valor * 0.79;
} else if (divisaOrigen.equals("LibraS") && divisaDestino.equals("Dolar")) {
    resultado = valor * 1.27;
}
if (divisaOrigen.equals("Dolar") && divisaDestino.equals("Won")) {
    resultado = valor * 1304.39;
} else if (divisaOrigen.equals("Won") && divisaDestino.equals("Dolar")) {
    resultado = valor * 0.00077;
}
if (divisaOrigen.equals("Colon") && divisaDestino.equals("Yen")) {
    resultado = valor * 9.04;
} else if (divisaOrigen.equals("Yen") && divisaDestino.equals("Colon")) {
    resultado = valor * 0.11;
}
if (divisaOrigen.equals("Colon") && divisaDestino.equals("LibraS")) {
    resultado = valor * 0.090;
} else if (divisaOrigen.equals("LibraS") && divisaDestino.equals("Colon")) {
    resultado = valor * 11.10;
}
if (divisaOrigen.equals("Colon") && divisaDestino.equals("Won")) {
    resultado = valor * 149.30;
} else if (divisaOrigen.equals("Won") && divisaDestino.equals("Colon")) {
    resultado = valor * 0.0067;
}
if (divisaOrigen.equals("Yen") && divisaDestino.equals("LibraS")) {
    resultado = valor * 183.28;
} else if (divisaOrigen.equals("LibraS") && divisaDestino.equals("Yen")) {
    resultado = valor * 0.0055;
}
if (divisaOrigen.equals("Yen") && divisaDestino.equals("Won")) {
    resultado = valor * 9.04;
} else if (divisaOrigen.equals("Won") && divisaDestino.equals("Yen")) {
    resultado = valor * 0.11;
}
if (divisaOrigen.equals("LibraS") && divisaDestino.equals("Won")) {
    resultado = valor * 1656.45;
} else if (divisaOrigen.equals("Won") && divisaDestino.equals("LibraS")) {
    resultado = valor * 0.00060;
}
   
    TextOut.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botonConvertirMousePressed

    private void BtnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClearMousePressed
        TextIn.setText(null);
        TextOut.setText(null);
    }//GEN-LAST:event_BtnClearMousePressed

    
    
    
    
    
    
    
    
    
    
    
    
    
    private void List1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_List1ActionPerformed

    private void MovBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovBarMousePressed

    }//GEN-LAST:event_MovBarMousePressed
   
    private void MovBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovBarMouseDragged
                      
    }//GEN-LAST:event_MovBarMouseDragged

    private void MovBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovBar1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_MovBar1MouseDragged

    private void MovBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovBar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovBar1MousePressed

    private void MovBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovBarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MovBarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AConv.PanelRound BG;
    private AConv.PanelRound BtnClear;
    private AConv.PanelRound ConvP;
    private javax.swing.JComboBox<String> List1;
    private javax.swing.JComboBox<String> List2;
    private AConv.PanelRound Lista2;
    private AConv.PanelRound MovBar;
    private AConv.PanelRound MovBar1;
    private javax.swing.JTextField TextIn;
    private javax.swing.JTextField TextOut;
    private AConv.PanelRound botonConvertir;
    private AConv.PanelRound panelRound5;
    private AConv.PanelRound panelRound6;
    private AConv.PanelRound x;
    // End of variables declaration//GEN-END:variables
}
