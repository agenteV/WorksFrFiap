import { carros } from "./carros.js"
import { formatarMoeda } from "./formatarMoeda.js";


//função que monta cards, utilizando o array "cards"
function montarCards(lista){
    //Recuperar o objeto HTML que recebrá os cards
    const gridCards = document.querySelector('#gridCards');
    let totalDeCarrosEncontrados = 0;
    //percorrer o array para a montagem dos cards
    lista.forEach(carro =>{
        
        gridCards.innerHTML += `

        <div class="col-md-6 col-lg-4 my-3">
         <div class="card">
        <img src="${carro.foto}" class="card-img-top" alt="${carro.modelo} - ${carro.marca}">
        <h5 class="p-3">${carro.modelo} - ${carro.marca}</h5>
         <div class="d-flex justify-content-between px-3">
             <p>${carro.cor}</p>
             <p>${carro.ano}</p>
        </div>
            <div class="d-flex justify-content-between px-3">
                <p>${carro.estilo}</p>
                <p>${carro.transmissao}</p>
            </div>
                <h3 class="text-center text-danger">${formatarMoeda(carro.preco)}</h3>
        </div>
    </div>
        `
        totalDeCarrosEncontrados++;
        
   
    });
    document.querySelector('#totalCarros').textContent = totalDeCarrosEncontrados;
}

//chamando a função 
montarCards(carros);

