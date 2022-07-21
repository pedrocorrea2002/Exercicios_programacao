num = 0
lista = {}

while(num < 3) do
  io.write("Escreva o nome de um aluno: ")
  nomeAluno = io.read("*l")
  io.close()
  
  io.write("Escreva a idade do aluno ",nomeAluno,": ")
  idadeAluno = io.read("*l")
  io.close()
  print("")

  bi = 1
  notaTotalAluno = 0
  while(bi <= 4) do
    io.write("Qual foi a nota do aluno no ",bi,"º bimestre? ")
    notaTotalAluno = (tonumber(io.read("*l"))*10) + notaTotalAluno

    bi = bi + 1
  end
  print("")

  table.insert(lista,{nome=nomeAluno;idade=idadeAluno;media=notaTotalAluno/4})

  num = num + 1
end

print("")

for k, v in pairs(lista) do
  print("Nome: "..v.nome,"Idade: "..v.idade)
  rounded_media = math.ceil(v.media)/10
  
  if(rounded_media > 6) then
    print("Média: "..rounded_media,"Situação: Aprovado")
  elseif(rounded_media > 4) then
    print("Média: "..rounded_media,"Situação: Recuperação")
  else
    print("Média: "..rounded_media,"Situação: Reprovado")
  end

  print("")
end