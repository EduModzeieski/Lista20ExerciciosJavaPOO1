/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeprofissoes;

/**
 *
 * @author eduar
 */
public class Sistemadeprofissoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Medico medico = new Medico("Carlos", "Cardiologia", 15000);
        Professor professor = new Professor("Ana", "Matemática", 5000);
        Advogado advogado = new Advogado("João", "Direito Civil", 8000);
        Engenheiro engenheiro = new Engenheiro("Marina", "Civil", 10000);

        medico.executarTrabalho();
        professor.executarTrabalho();
        advogado.executarTrabalho();
        engenheiro.executarTrabalho();
    }
}