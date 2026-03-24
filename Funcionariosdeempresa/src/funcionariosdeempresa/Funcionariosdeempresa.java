/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionariosdeempresa;

/**
 *
 * @author eduar
 */
public class Funcionariosdeempresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Ana", 8000);
        Funcionario f2 = new Vendedor("Carlos", 3000);
        Funcionario f3 = new Programador("Lucas", 6000);
        Funcionario f4 = new Designer("Marina", 4000);

        // Testando polimorfismo
        Funcionario[] funcionarios = {f1, f2, f3, f4};

        for (Funcionario f : funcionarios) {
            f.trabalhar();
            System.out.println("Bônus: R$ " + f.calcularBonus());
            System.out.println("----------------------");
        }
    }
}