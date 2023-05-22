alunos = []

print("Preencha com as informações de cada aluno, para parar a execução escreva 'exit' ao preencher o nome!")
print("")
while True:
    aluno = input(f"Digite o nome do aluno N°{len(alunos) + 1}: ")

    if aluno == "exit":
        break

    idade = input(f"Digite a idade do aluno N°{len(alunos) + 1}: ")
    nota1 = input(f"Digite a nota do 1º bimestre do aluno N°{len(alunos) + 1}: ")
    nota2 = input(f"Digite a nota do 2º bimestre do aluno N°{len(alunos) + 1}: ")
    nota3 = input(f"Digite a nota do 3º bimestre do aluno N°{len(alunos) + 1}: ")
    nota4 = input(f"Digite a nota do 4º bimestre do aluno N°{len(alunos) + 1}: ")

    alunos.append([aluno,
                   int(idade),
                   [int(nota1), int(nota2), int(nota3), int(nota4)]])

print("")
print("===========================================")
print(f"Média de idade de todos os alunos:")
idadeTotal = 0
for aluno, idade, notas in alunos:
    idadeTotal = idadeTotal + idade
print(idadeTotal/len(alunos))

print("")
print(f"Média de nota de todos os alunos:")
for aluno, idade, notas in alunos:
    print(f"- {aluno}: {sum(notas)/4}")

print("")
print("===========================================")
print("Situação final de cada aluno:")
for aluno, idade, notas in alunos:
    situacao = "Reprovado" if sum(notas)/4 < 4 else ("Recuperação" if sum(notas)/4 < 7 else "Aprovado")

    print(f"- {aluno}: {situacao}")
