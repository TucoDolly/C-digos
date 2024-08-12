package br.edu.ifsc.alomundo;

public class AloMundo {
    public static void main(String[] args) {
        String nome = "Artur";
        int idade = 20, altura = 170;
        boolean aluno = true, professor = false;
        
        System.out.println(nome.equals(args[0]));
        System.out.println("Primeiro parâmetro = " + args[0]);
        System.out.println("Professor: " + professor);    
        System.out.println("Nome: " + nome + "Idade: " + idade);
        System.out.println("Aluno: " + aluno);
    }            
}
