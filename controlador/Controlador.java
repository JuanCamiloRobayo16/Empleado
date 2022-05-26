package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Empleado;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------
    // Atributos 
    //----------
    private VentanaPrincipal vista;
    private Empleado modelo;

    //----------
    // Metodos 
    //----------

    //Metodo constructor
    public Controlador(VentanaPrincipal pVista, ProyectoPOOMJ pModelo)
    {
        this.vista = pVista;
        this.modelo = pModelo;
        this.vista.miPanelOperaciones.btHallar.addActionListener(this);

        this.vista = pVista;
        this.modelo = pModelo;
        this.vista.miPanelOperaciones.btBorrar.addActionListener(this);

        this.vista = pVista;
        this.modelo = pModelo;
        this.vista.miPanelOperaciones.btSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comando generado [hallar,borrar,salir]
        String comando = ae.getActionCommand();

        if(comando.equals("Salir"))
        {
            System.exit(0);
        }

        if(comando.equals("Borrar"))
        {
            this.vista.miPanelEntradaDatos.borrar();
            this.vista.miPanelResultados.borrar();
        }

        if (comando.equals("Hallar"))
        {
            modelo.setX(Integer.parseInt(vista.miPanelEntradaDatos.gettfX()));
            modelo.setY(Integer.parseInt(vista.miPanelEntradaDatos.gettfY()));
            //modelo.hallarResultado();
            vista.miPanelResultados.mostrarResultado(modelo.getResultado());

        }
    }
    
}