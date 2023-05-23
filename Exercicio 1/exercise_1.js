var alunos = []

function novoAluno(nome,idade,nota1,nota2,nota3,nota4){
  alunos.push({
    "nome":nome,
    "idade":idade,
    "nota1":nota1,
    "nota2":nota2,
    "nota3":nota3,
    "nota4":nota4
  })
}

function mediaIdades(){
  if(alunos.length == 0){
    console.log("Não existem alunos ainda")
  }else{
    total = 0
    alunos.forEach(i => {total += i.idade})

    console.log("============ MÉDIA DA IDADE DOS ALUNOS ===========")
    console.log((total/alunos.length).toFixed(1))
  }
}

function mediaNotas(){
  if(alunos.length == 0){
    console.log("Não existem alunos ainda")
  }else{
    console.log("============ MÉDIAS DAS NOTAS DE CADA ALUNO ===========")

    alunos.forEach(aluno => {
      total = aluno.nota1 + aluno.nota2 + aluno.nota3 + aluno.nota4

      console.log(`${aluno.nome}: ${(total/4).toFixed(1)}`)
    })
  }
}

function situacaoFinal(){
  if(alunos.length == 0){
    console.log("Não existem alunos ainda")
  }else{
    console.log("============ SITUAÇÃO FINAL DE CADA ALUNO ===========")

    alunos.forEach(aluno => {
      total = aluno.nota1 + aluno.nota2 + aluno.nota3 + aluno.nota4
      mediaFinal = total/4
      situacaoFinal = ""

      switch(true){
          case (mediaFinal<4): 
            situacaoFinal = "Reprovado"
              break;
          case (mediaFinal<7):
            situacaoFinal = "Recuperação"
              break;
          default: 
            situacaoFinal = "Aprovado"
      }

      console.log(`${aluno.nome}: ${situacaoFinal}`)
    })
  }
}

novoAluno("José",8,2,4,5,8)
novoAluno("João",7,7,8,9,6)
novoAluno("Gustavo",7,5,6,7,6)
console.log(alunos)

mediaIdades()
mediaNotas()
situacaoFinal()
