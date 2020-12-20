/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Concursos
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saida de dados

        String nome = "Gustavo";
        float nota = 8.5f;
        System.out.println("A nota é " + nota);
        System.out.printf("A nota é %.2f \n", nota);
        System.out.printf("A nota é %.4f \n", nota);
        System.out.printf("A nota de %s é %.2f \n",nome,nota);
        System.out.format("A nota de %s é %.2f \n",nome,nota);
    
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno : ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota do aluno : ");
        float nota2 = teclado.nextFloat();
        System.out.print("Digite a idade do aluno : ");
        int idade = teclado.nextInt();
        System.out.format("A nota de %s é %.1f \n ",nome2,nota2);
        System.out.println("O estudante tem "+idade +" anos");
        
        
    }
    
}
