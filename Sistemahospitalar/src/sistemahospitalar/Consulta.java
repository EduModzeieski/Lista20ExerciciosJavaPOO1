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
public class Consulta {
    private Paciente paciente;
    private Pessoa profissional;
    private String data;

    public Consulta(Paciente paciente, Pessoa profissional, String data) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public Pessoa getProfissional() {
        return profissional;
    }

    public String getData() {
        return data;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para " + paciente.getNome() +
                " com " + profissional.getNome() + " na data " + data);
    }

    public void realizarAtendimento() {
        System.out.println("Atendimento iniciado...");
        
        if (profissional instanceof Medico) {
            ((Medico) profissional).realizarAtendimento();
        } else if (profissional instanceof Enfermeiro) {
            ((Enfermeiro) profissional).realizarAtendimento();
        }
    }
}