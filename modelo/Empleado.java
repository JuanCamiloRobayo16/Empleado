/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author GaMerJ16
 */
public class Empleado 
{
    //-------------
    //Atributos
    //-------------
    public static final double SALARIO_MINIMO = 1000000;
    public static final double AUXILIO_TRANSPORTE = 117172;
    private int fecha;
    private int anitguedad;
    private int horasTrabajadas;
    private double valorHora;
    private double salario;
    
   
    //-------------
    //Metodos
    //--------------

    public Empleado() 
    {
        
    }
    
    

    public int getFecha() {
        return fecha;
    }

    public void setFechaDeNacimiento(int fecha) {
        this.fecha = fecha;
    }

    public void calcularEdad()
    {
      
        LocalDate fHoy= LocalDate.now();
        LocalDate cumple= LocalDate.of(1990, Month.JUNE, 27);
        long edad= ChronoUnit.YEARS.between(cumple, fHoy); 
        System.out.println("tu edad es: "+edad);

    }
        
    
    
    public int getAntiguedad() {
        return anitguedad;
    }

    public void setAntiguedad(int anitguedad) {
        this.anitguedad = anitguedad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario()
    {
        salario = horasTrabajadas * valorHora;
        
        if (salario < 2*SALARIO_MINIMO)
        {
            salario = salario + AUXILIO_TRANSPORTE;
        }
    }
    
}
