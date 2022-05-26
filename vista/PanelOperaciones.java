/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author matias
 */
public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bAuxilio;
   
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bAuxilio = new JButton("Calcular Si Aplica A Bono De Auxilio De Transporte");
        bAuxilio.setFont(new Font("Arial", BOLD, 12));
        bAuxilio.setBounds(10,20,360,20);
        add(bAuxilio);
        bAuxilio.setActionCommand("Calcular");
      
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bAuxilio.addActionListener(pAL);
     
    }
    
    
    public void activarBotones()
    {
        bAuxilio.setEnabled(true);
       
    }
}

