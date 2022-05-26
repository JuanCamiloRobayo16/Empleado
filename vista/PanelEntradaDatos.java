/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author matias
 */
public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbHorasTrabajadas;
    private JLabel lbValorHora;
    private JLabel lbFechaDeNacimiento;
    private JLabel lbAntiguedad;
    private JTextField tfHorasTrabajadas;
    private JTextField tfValorHora;
    private JTextField tfFechaDeNacimiento;
    private JTextField tfAntiguedad;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/sueldo-fijo.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,150,180);
        add(lbImagen);
        
        //Creación y adición de etiquetas Horas Trabajadas, Valor Hora, Fecha De Nacimiento y Antiguedad
        lbHorasTrabajadas = new JLabel("Horas Trabajadas :");
        lbHorasTrabajadas.setBounds(170,10,260,20);
        add(lbHorasTrabajadas);
        
        lbValorHora = new JLabel("Valor Hora : ");
        lbValorHora.setBounds(170,40,260,20);
        add(lbValorHora);
        
        lbFechaDeNacimiento = new JLabel("Fecha De Nacimiento : ");
        lbFechaDeNacimiento.setBounds(170,70,260,20);
        add(lbFechaDeNacimiento);
        
        lbAntiguedad = new JLabel("Antiguedad : ");
        lbAntiguedad.setBounds(170,100,260,20);
        add(lbAntiguedad);
        
        //Creación y adición de campos de texto
        tfHorasTrabajadas = new JTextField(" ");
        tfHorasTrabajadas.setBounds(300, 10, 60, 20);
        add(tfHorasTrabajadas);
        
        tfValorHora = new JTextField(" ");
        tfValorHora.setBounds(300, 40, 60, 20);
        add(tfValorHora);
        
        tfFechaDeNacimiento = new JTextField(" ");
        tfFechaDeNacimiento.setBounds(300, 70, 60, 20);
        add(tfFechaDeNacimiento);

        tfAntiguedad = new JTextField(" ");
        tfAntiguedad.setBounds(300, 100, 60, 20);
        add(tfAntiguedad);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getHorasTrabajadas()
    {
        return tfHorasTrabajadas.getText();
    }
    
    public String getValorHora()
    {
        return tfValorHora.getText();
    }
    
    public String getFechaDeNacimiento()
    {
        return tfFechaDeNacimiento.getText();
    }
    public String getAntiguedad()
    {
        return tfAntiguedad.getText();
    }
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfHorasTrabajadas.setText("");
        tfValorHora.setText("");
        tfFechaDeNacimiento.setText("");
        tfAntiguedad.setText("");
    }
}
