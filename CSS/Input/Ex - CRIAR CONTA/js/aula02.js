// método construtor
// const meuArray = new Array();
const pessoas = ['Eu', 'Tu', 'Ele', 'Nós', 'Vós', 'Eles'];

document.querySelector('#btnTodos').addEventListener('click', () => {
    document.querySelector('#h3Todos').textContent = pessoas;
});

document.querySelector('#btnIndice').addEventListener('click', () => {
    document.querySelector('#h3Indice').textContent = pessoas[3];
});

document.querySelector('#btnRandom').addEventListener('click', () => {
    const indice = parseInt(Math.random() * pessoas.length);
    document.querySelector('#h3Random').textContent = pessoas[indice]
})

// manipulando o array

// inserindo no início do array
pessoas.unshift('Nova Pessoa');

//inserindo no fim do array
pessoas.push('Outra Pessoa');

// excluir a primeira pessoa - irá excluir mesmo
pessoas.shift();

//excluir a última pessoa - irá excluir mesmo
pessoas.pop();

// excluir elementos em qq posição
pessoas.splice(2,2);

// inserir elementos em qq posição
pessoas.splice(2,0,'Eu', 'Ele', true, 8888);
