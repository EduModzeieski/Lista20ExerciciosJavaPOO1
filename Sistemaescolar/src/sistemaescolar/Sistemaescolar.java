/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;

/**
 *
 * @author eduar
 */
public class Sistemaescolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Aluno("Lucas", 16, 8.0, 7.5);
        Pessoa p2 = new Professor("Ana", 35, "Matemática");
        Pessoa p3 = new Coordenador("Carlos", 40, "Ensino Médio");

        // Polimorfismo
        Pessoa[] pessoas = {p1, p2, p3};

        for (Pessoa p : pessoas) {
            p.apresentar();
            p.trabalhar();
            System.out.println("----------------------");
        }

        // Teste específico de aluno
        Aluno aluno = new Aluno("Maria", 17, 9.0, 8.5);
        Professor professor = new Professor("João", 45, "História");

        Turma turma = new Turma("2º Ano", aluno, professor);

        turma.mostrarDados();
        System.out.println("Média do aluno: " + aluno.calcularMedia());
    }    
}
