import java.util.Scanner;
import java.util.ArrayList;

class Aluno {
    String nome = "", situacao = "";
    int idade = 0;
    double nota1 = -1.0, nota2 = -1.0, nota3 = -1.0, nota4 = -1.0, media = 0;
}

public class Main {
    public static void main(String[] args) {
        int answer = 0, num = 0;
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        double totalIdades = 0;
        Scanner leitor = new Scanner(System.in).useDelimiter("\n");
        
        //-------------------------------------------------------
        // LEITURA DAS INFORMAÇÕES
        //-------------------------------------------------------
        while(answer != 1){
            System.out.println("");
            
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
                    aluno.nota1 = Double.parseDouble(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Escreva a nota do 2° bimestre do " + aluno.nome +": ");
            while (aluno.nota2 < 0 || aluno.nota2 > 10) {
                try {
                    aluno.nota2 = Double.parseDouble(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Escreva a nota do 3° bimestre do " + aluno.nome +": ");
            while (aluno.nota3 < 0 || aluno.nota3 > 10) {
                try {
                    aluno.nota3 = Double.parseDouble(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            System.out.println("Escreva a nota do 4° bimestre do " + aluno.nome +": ");
            while (aluno.nota4 < 0 || aluno.nota4 > 10) {
                try {
                    aluno.nota4 = Double.parseDouble(leitor.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, escreva um número entre 0 e 10");
                }
            }
            
            //Escolhendo se vai ser adicionado mais um aluno ou não
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
            
            //Guardando aluno na lista
            listaAlunos.add(aluno);
        }
        
        //Percorrendo lista de alunos para calcular a média das idades
        for (int i = 0; i < listaAlunos.size(); i++) {
            totalIdades += listaAlunos.get(i).idade;
        }
        
        System.out.println("================================");
        System.out.println("||           RESUMO           ||");
        System.out.println("================================");
        System.out.printf("Média da idade de todos os alunos: " + String.format("%.1f",totalIdades/listaAlunos.size()));
        System.out.println("");
        
        //Percorrendo lista de alunos para calcular a média da nota de cada um
        for (int i = 0; i < listaAlunos.size(); i++) {
            listaAlunos.get(i).media += listaAlunos.get(i).nota1;
            listaAlunos.get(i).media += listaAlunos.get(i).nota2;
            listaAlunos.get(i).media += listaAlunos.get(i).nota3;
            listaAlunos.get(i).media += listaAlunos.get(i).nota4;
            listaAlunos.get(i).media = listaAlunos.get(i).media/4;
            
            //Descobrindo situação do aluno
            if(listaAlunos.get(i).media < 4){
                listaAlunos.get(i).situacao = "Reprovado";
            }else if(listaAlunos.get(i).media < 7){
                listaAlunos.get(i).situacao = "Recuperação";
            }else{
                listaAlunos.get(i).situacao = "Aprovado";
            }
            
            System.out.println("Nome: " + listaAlunos.get(i).nome);
            System.out.println("Idade: " + listaAlunos.get(i).idade);
            System.out.println("Média: " + String.format("%.1f",listaAlunos.get(i).media));
            System.out.println("Situação: " + listaAlunos.get(i).situacao);
            System.out.println("");
        }
    }
}
