/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 * @author ArielL
 */
package AConv;


import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel L
 */

public class ConvertidorDis extends javax.swing.JPanel {

    /**
     * Creates new form ConvertidorDis
     */
    public ConvertidorDis() {
        initComponents();
        ConvertidorDis.this.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGDis = new AConv.PanelRound();
        ConvConteiner = new AConv.PanelRound();
        TextInConteiner = new AConv.PanelRound();
        TextIn = new javax.swing.JTextField();
        List1Conteiner = new AConv.PanelRound();
        List1 = new javax.swing.JComboBox<>();
        List2Conteiner = new AConv.PanelRound();
        List2 = new javax.swing.JComboBox<>();
        TextOutConteiner = new AConv.PanelRound();
        TextOut = new javax.swing.JTextField();
        botonConvertir = new AConv.PanelRound();
        panelRound1 = new AConv.PanelRound();

        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));

        BGDis.setBackground(new java.awt.Color(51, 51, 51));
        BGDis.setMinimumSize(new java.awt.Dimension(900, 700));
        BGDis.setPreferredSize(new java.awt.Dimension(900, 700));
        BGDis.setRoundBottomRight(30);
        BGDis.setRoundTopRight(30);

        ConvConteiner.setBackground(new java.awt.Color(255, 255, 255));
        ConvConteiner.setPreferredSize(new java.awt.Dimension(400, 578));
        ConvConteiner.setRoundBottomLeft(10);
        ConvConteiner.setRoundBottomRight(10);
        ConvConteiner.setRoundTopLeft(10);
        ConvConteiner.setRoundTopRight(10);

        TextInConteiner.setBackground(new java.awt.Color(102, 102, 102));
        TextInConteiner.setRoundBottomLeft(20);
        TextInConteiner.setRoundBottomRight(20);
        TextInConteiner.setRoundTopLeft(20);
        TextInConteiner.setRoundTopRight(20);

        TextIn.setBackground(new java.awt.Color(102, 102, 102));
        TextIn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TextIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextIn.setBorder(null);

        javax.swing.GroupLayout TextInConteinerLayout = new javax.swing.GroupLayout(TextInConteiner);
        TextInConteiner.setLayout(TextInConteinerLayout);
        TextInConteinerLayout.setHorizontalGroup(
            TextInConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextInConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextIn)
                .addContainerGap())
        );
        TextInConteinerLayout.setVerticalGroup(
            TextInConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextInConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextIn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        List1Conteiner.setBackground(new java.awt.Color(51, 51, 51));
        List1Conteiner.setPreferredSize(new java.awt.Dimension(100, 50));
        List1Conteiner.setRoundBottomLeft(10);
        List1Conteiner.setRoundBottomRight(10);
        List1Conteiner.setRoundTopLeft(10);
        List1Conteiner.setRoundTopRight(10);

        List1.setBackground(new java.awt.Color(51, 51, 51));
        List1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        List1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metros", "Kilometros", "Centimetros", "Pies", "Milimetros" }));
        List1.setBorder(null);
        List1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout List1ConteinerLayout = new javax.swing.GroupLayout(List1Conteiner);
        List1Conteiner.setLayout(List1ConteinerLayout);
        List1ConteinerLayout.setHorizontalGroup(
            List1ConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        List1ConteinerLayout.setVerticalGroup(
            List1ConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        List2Conteiner.setBackground(new java.awt.Color(51, 51, 51));
        List2Conteiner.setPreferredSize(new java.awt.Dimension(100, 50));
        List2Conteiner.setRoundBottomLeft(10);
        List2Conteiner.setRoundBottomRight(10);
        List2Conteiner.setRoundTopLeft(10);
        List2Conteiner.setRoundTopRight(10);

        List2.setBackground(new java.awt.Color(51, 51, 51));
        List2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        List2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimetros", "Metros", "Kilometros", "Milimetros", "Pies" }));
        List2.setBorder(null);
        List2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout List2ConteinerLayout = new javax.swing.GroupLayout(List2Conteiner);
        List2Conteiner.setLayout(List2ConteinerLayout);
        List2ConteinerLayout.setHorizontalGroup(
            List2ConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List2, 0, 115, Short.MAX_VALUE)
        );
        List2ConteinerLayout.setVerticalGroup(
            List2ConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        TextOutConteiner.setBackground(new java.awt.Color(102, 102, 102));
        TextOutConteiner.setRoundBottomLeft(20);
        TextOutConteiner.setRoundBottomRight(20);
        TextOutConteiner.setRoundTopLeft(20);
        TextOutConteiner.setRoundTopRight(20);

        TextOut.setBackground(new java.awt.Color(102, 102, 102));
        TextOut.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TextOut.setBorder(null);

        javax.swing.GroupLayout TextOutConteinerLayout = new javax.swing.GroupLayout(TextOutConteiner);
        TextOutConteiner.setLayout(TextOutConteinerLayout);
        TextOutConteinerLayout.setHorizontalGroup(
            TextOutConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextOutConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextOut)
                .addContainerGap())
        );
        TextOutConteinerLayout.setVerticalGroup(
            TextOutConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextOutConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextOut, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGap(0, 31, Short.MAX_VALUE)
        );
        botonConvertirLayout.setVerticalGroup(
            botonConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        panelRound1.setBackground(new java.awt.Color(51, 51, 51));
        panelRound1.setRoundBottomLeft(99);
        panelRound1.setRoundBottomRight(99);
        panelRound1.setRoundTopLeft(99);
        panelRound1.setRoundTopRight(99);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ConvConteinerLayout = new javax.swing.GroupLayout(ConvConteiner);
        ConvConteiner.setLayout(ConvConteinerLayout);
        ConvConteinerLayout.setHorizontalGroup(
            ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConvConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextInConteiner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextOutConteiner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ConvConteinerLayout.createSequentialGroup()
                        .addGroup(ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(List2Conteiner, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(List1Conteiner, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addGroup(ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonConvertir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        ConvConteinerLayout.setVerticalGroup(
            ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConvConteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextInConteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(List1Conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ConvConteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(List2Conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(TextOutConteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BGDisLayout = new javax.swing.GroupLayout(BGDis);
        BGDis.setLayout(BGDisLayout);
        BGDisLayout.setHorizontalGroup(
            BGDisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGDisLayout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addComponent(ConvConteiner, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        BGDisLayout.setVerticalGroup(
            BGDisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGDisLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(ConvConteiner, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGDis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JOptionPane.showMessageDialog(null, "Por favor, utilice solamente valores positivos");
        return;
    }
    } catch (NumberFormatException Letras) {   
    JOptionPane.showMessageDialog(null, "Por favor, unicamente utilice numeros");
    return;
    }
   

    
    String Origen = (String) List1.getSelectedItem();
    String Destino = (String) List2.getSelectedItem();
    
    if (Origen.equals(Destino)) {
    JOptionPane.showMessageDialog(null, "Los valores convertir tiene que ser distintas");
    }
    
    if (List1.getSelectedIndex() == -1) {
        List1.addItem("Metros");
        List1.addItem("Centimetros");
        List1.addItem("Milimetros");
        List1.addItem("Kilometros");
        List1.addItem("Pies");
    }
    if (List2.getSelectedIndex() == -1) {
        List2.addItem("Metros");
        List2.addItem("Centimetros");
        List2.addItem("Milimetros");
        List2.addItem("Kilometros");
        List2.addItem("Pies");
    }

    double resultado = 0.0;
if (Origen.equals("Metros") && Destino.equals("Kilometros")) {
    resultado = valor / 1000;
} else if (Origen.equals("Kilometros") && Destino.equals("Metros")) {
    resultado = valor * 1000;
}
if (Origen.equals("Metros") && Destino.equals("Centimetros")) {
    resultado = valor * 100;
} else if (Origen.equals("Centimetros") && Destino.equals("Metros")) {
    resultado = valor / 100;
}
if (Origen.equals("Metros") && Destino.equals("Pies")) {
    resultado = valor * 3.281;
} else if (Origen.equals("Pies") && Destino.equals("Metros")) {
    resultado = valor / 3.281;
}
if (Origen.equals("Metros") && Destino.equals("Milimetros")) {
    resultado = valor * 1000;
} else if (Origen.equals("Milimetros") && Destino.equals("Metros")) {
    resultado = valor / 1000;
}
if (Origen.equals("Kilometros") && Destino.equals("Centimetros")) {
    resultado = valor * 100000;
} else if (Origen.equals("Centimetros") && Destino.equals("Kilometros")) {
    resultado = valor / 100000;
}
if (Origen.equals("kilometros") && Destino.equals("Pies")) {
    resultado = valor * 3281;
} else if (Origen.equals("Pies") && Destino.equals("kilometros")) {
    resultado = valor / 3281;
}
if (Origen.equals("Kilometros") && Destino.equals("Milimetros")) {
    resultado = valor * 1000000;
} else if (Origen.equals("Milimetros") && Destino.equals("Kilometros")) {
    resultado = valor / 1000000;
}
if (Origen.equals("Centimetros") && Destino.equals("Pies")) {
    resultado = valor / 30.48;
} else if (Origen.equals("Pies") && Destino.equals("Centimetros")) {
    resultado = valor * 30.48;
}
if (Origen.equals("Centimetros") && Destino.equals("Milimetros")) {
    resultado = valor * 10;
} else if (Origen.equals("Milimetros") && Destino.equals("Centimetros")) {
    resultado = valor / 10;
}
if (Origen.equals("Pies") && Destino.equals("Milimetros")) {
    resultado = valor * 304.8;
} else if (Origen.equals("Milimetros") && Destino.equals("Pies")) {
    resultado = valor / 304.8;
}   
    TextOut.setText(String.valueOf(resultado));      
    }//GEN-LAST:event_botonConvertirMousePressed

    private void panelRound1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MousePressed
        TextIn.setText(null);
        TextOut.setText(null);
    }//GEN-LAST:event_panelRound1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AConv.PanelRound BGDis;
    private AConv.PanelRound ConvConteiner;
    private javax.swing.JComboBox<String> List1;
    private AConv.PanelRound List1Conteiner;
    private javax.swing.JComboBox<String> List2;
    private AConv.PanelRound List2Conteiner;
    private javax.swing.JTextField TextIn;
    private AConv.PanelRound TextInConteiner;
    private javax.swing.JTextField TextOut;
    private AConv.PanelRound TextOutConteiner;
    private AConv.PanelRound botonConvertir;
    private AConv.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
