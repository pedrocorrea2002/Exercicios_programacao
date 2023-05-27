import java.util.Scanner;

class Aluno {
    String nome = "";
    int idade = 0, nota1 = -1, nota2 = -1, nota3 = -1, nota4 = -1;
}

public class MyClass {
    public static void main(String[] args) {
        int answer = 0;
        int num = 0;
        Aluno[] lista;
        int totalIdades = 0;
        Scanner leitor = new Scanner(System.in).useDelimiter("\n");
        
        //-------------------------------------------------------
        // LEITURA DAS INFORMAÇÕES
        //-------------------------------------------------------
        while(answer != 1){
            System.out.println("answer: '" + answer + "'");
            
            num++;
            
            Aluno aluno = new Aluno();
            
            System.out.println("Escreva o nome do " + num +"° aluno: ");
            aluno.nome = leitor.nextLine().trim();
            
            System.out.println("Escreva a idade do " + aluno.nome + ": ");
            while (aluno.idade < 1) {
                try {
                    aluno.idade = Integer.parseInt(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número maior que 0");
                }
            }
            
            System.out.println("Escreva a nota do 1° bimestre do " + aluno.nome +": ");
            while (aluno.nota1 < 0 || aluno.nota1 > 10) {
                try {
                    aluno.nota1 = Integer.parseInt(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Escreva a nota do 2° bimestre do " + aluno.nome +": ");
            while (aluno.nota2 < 0 || aluno.nota2 > 10) {
                try {
                    aluno.nota2 = Integer.parseInt(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Escreva a nota do 3° bimestre do " + aluno.nome +": ");
            while (aluno.nota3 < 0 || aluno.nota3 > 10) {
                try {
                    aluno.nota3 = Integer.parseInt(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Escreva a nota do 4° bimestre do " + aluno.nome +": ");
            while (aluno.nota4 < 0 || aluno.nota4 > 10) {
                try {
                    aluno.nota4 = Integer.parseInt(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Deseja inserir mais um aluno?");
            System.out.println("0 - Sim");
            System.out.println("1 - Não");
            
            do {
                try {
                    answer = Integer.parseInt(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, responda com 0 ou 1");
                }
            }while(answer != 0 && answer != 1);
        }
        
        System.out.print("Acabou");
    }
}