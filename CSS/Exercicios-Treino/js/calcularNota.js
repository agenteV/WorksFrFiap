document.addEventListener('DOMContentLoaded', () =>{

    const form = document.querySelector('#dados'); //chamar os dados do form
    const historico = document.querySelector('.historico')

   form.addEventListener('submit',(e) =>{ 
        e.preventDefault(); //cancelar o envio

        const nomeAluno = document.querySelector('#nomeAluno').value.trim();//o "trim" para tirar os espaços no valor do usuario
        form.nomeAluno.focus();

        const disciplina = document.querySelector('#disciplina').value;

          if(disciplina === '0'){
            alert("Selecione uma Disciplina válida!")
            document.querySelector('#disciplina').focus();
            return;
        } //validar a disciplina

        const checkpoint = [
        
            Number(document.querySelector('#ckp01').value),
            Number(document.querySelector('#ckp02').value),
            Number(document.querySelector('#ckp03').value),
        ];

         const sprint01 = Number(document.querySelector('#sprint01').value);
        const sprint02 = Number(document.querySelector('#sprint02').value);
        const globalSolution = Number(document.querySelector('#globalSolution').value);


      let primeiro = 0;
      let segundo = 0;

      if(ckp01 > ckp02 && ckp01 > ckp03){
        primeiro = ckp01;
        segundo = (ckp02 > ckp01) ? ckp02 : ckp03;
      }
      else if(ckp02 > ckp01 && ckp02 > ckp03){
        primeiro = ckp02    
        segundo = (ckp01 > ckp03) ? ckp01 : ckp03
        } else{
            primeiro = ckp03;
            segundo = (ckp01 > ckp02) ? ckp01 : ckp02;
        }
      

     
        const mediaCkp = ((primeiro + segundo) / 2) *.4;
        const mediaSprint = ((sprint01 + sprint02) / 2)*.6;
        const mediaSemestral = (((mediaCkp + mediaSprint) * .4 ) + globalSolution * .6);

    
    const tr = document.createElement('tr');
    tr.innerHTML = `
    <td>${nomeAluno}</td>
    <td>${disciplina}</td>
    <td>${checkpoint[0].toFixed[1]}</td>
    <td>${checkpoint[1].toFixed[1]}</td>
    <td>${mediaCkp.toFixed[1]}</td>
    <td>${sprint01.toFixed[1]}</td>
    <td>${sprint01.toFixed[1]}</td>
    <td>${mediaSprint.toFixed[1]}</td>
    <td>${globalSolution.toFixed[1]}</td>
    <td>${mediaSemestral.toFixed[1]}</td>
    `
      historico.prepend(tr);

      form.reset();



    })

});