package main;

import impuestos.ParafiscalesLogica;
import static constantes.ParafiscalesString.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args){

        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();

        String nombre = JOptionPane.showInputDialog(null,SOLICITUD_NOMBRE.getMensage());
        String salario= JOptionPane.showInputDialog(null,SOLICITUD_SALARIO.getMensage());
        parafiscalesLogica.setNombre(nombre);
        parafiscalesLogica.setSalario(Double.parseDouble(salario));
        JOptionPane.showConfirmDialog(null,MENSAGE_EMPLEADO.getMensage()+ parafiscalesLogica.getNombre() + "\n"+MENSAGE_SALARIO.getMensage() + parafiscalesLogica.getSalario()+"\n"+
                MENSAGE_PENCIO.getMensage() + parafiscalesLogica.calcularPension()+ "\n"+
                MENSAGE_SALUD.getMensage()+ parafiscalesLogica.calcularSalud()+"\n"+
                MENSAGE_TOTAL.getMensage()+ parafiscalesLogica.totalSalario());
    }
}