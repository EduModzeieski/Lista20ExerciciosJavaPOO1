/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospitalar;

/**
 *
 * @author eduar
 */
public class Sistemahospitalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Paciente paciente = new Paciente("Carlos", 30, "Gripe");
        Medico medico = new Medico("Dr. João", 45, "Clínico Geral");
        Enfermeiro enfermeiro = new Enfermeiro("Ana", 35, "Emergência");

        Consulta c1 = new Consulta(paciente, medico, "27/03/2026");
        Consulta c2 = new Consulta(paciente, enfermeiro, "28/03/2026");

        paciente.exibirDados();

        System.out.println();

        c1.agendarConsulta();
        c1.realizarAtendimento();

        System.out.println();

        c2.agendarConsulta();
        c2.realizarAtendimento();
    }
}