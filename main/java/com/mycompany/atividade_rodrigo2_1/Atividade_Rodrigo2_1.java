package com.mycompany.atividade_Rodrigo2_1;

import java.util.Scanner;

public class Atividade_Rodrigo2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    int totalAlunos = 0;
    double somaMedias = 0;
            
        while (true){
            System.out.print("Digite o nome do aluno (ou -1 para sair): ");
            String nome = in.nextLine();

            if (nome.equals("-1")){
                System.out.println("Programa encerrado\n ");
                break;
            }
        
        System.out.print("Digite sua nota do 1 bimestre: ");
            double nota1 = in.nextDouble();
            
        System.out.print("Digite sua nota do 2 bimestre: ");
            double nota2 = in.nextDouble();
            in.nextLine(); 
            
            double media = (nota1 * 2 + nota2 * 3) / 5.0;
            
            System.out.println("Ola: " + nome + "\nSeja bem-vindo!!!!\nSua media das notas foi de: " + media);
            
        totalAlunos++;
        somaMedias += media;
        }
        
        System.out.println("Alunos digitados: " + totalAlunos);
        if (totalAlunos > 0) {
            double mediaTurma = somaMedias / totalAlunos;
            System.out.printf("Media geral dos alunos digitados: %.2f\n", mediaTurma);
        }       
    }
}