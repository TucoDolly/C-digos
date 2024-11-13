/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import entidades.Funcionario;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario [] lista = new Funcionario[6];
        int quant = 0;
        String nome, sexo, cargo;
        float salario, horas;
        int filho;
        
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        for(int i=0; i< 3; i++){
            System.out.print("Informe o nome:");
            nome = lerTexto.nextLine();
            System.out.print("Informe o cargo:");
            cargo = lerTexto.nextLine();
            System.out.print("Informe o sexo (F/M):");
            sexo = lerTexto.nextLine();
            System.out.print("Informe o salario base:");
            salario = ler.nextFloat();
            System.out.print("Informe o numero de filhos:");
            filho = ler.nextInt();
            System.out.print("Informe o numero de horas:");
            horas = ler.nextFloat();
            lista[i] = new Funcionario(nome, sexo, cargo, 
                    salario, horas, filho);
        }
        
        int qM = 0, qF = 0;
        Funcionario maisFilhos = null;
        Funcionario maisHoras = null;
        Funcionario maiorSalario = null;
        float media = 0;
        
        for(int i=0; i< 3; i++){
            //Lista os funcionarios cadastrados
            System.out.println(lista[i]);
            
            //Verifica quantidade de homens e mulheres
            if(lista[i].getSexo().equals("M"))
                qM++;
            else
                qF++;
        
            //Verifica funcionario com mais filhos
            if(i==0){
                maisFilhos = lista[i];
                maisHoras = lista[i];
                maiorSalario = lista[i];
            }else{
                if(maisFilhos.getNumeroFilhos() < lista[i].getNumeroFilhos())
                    maisFilhos = lista[i];
                if(maisHoras.getHorasExtras() < lista[i].getHorasExtras())
                    maisHoras = lista[i];
                if(maiorSalario.calculaSalario() < lista[i].calculaSalario())
                    maiorSalario = lista[i];
            }
            
            media += lista[i].calculaSalario();
        }
        
        System.out.println("A quantidade de homens e: " + qM);
        System.out.println("A quantidade de mulheres e: " + qF);
        if(maisFilhos.getNumeroFilhos() > 0)
            System.out.println("O funcionario com mais filhos e: " +
                    maisFilhos.getNome());
        
        if(maisHoras.getHorasExtras() > 0)
            System.out.println("O funcionario com mais horas extras e: " +
            maisHoras.getNome());
        
        System.out.println("O funcionario com maior salario: " + 
                maiorSalario.getNome());
        
        System.out.println("Media salarial: " + media/3f);
    }
    
}
