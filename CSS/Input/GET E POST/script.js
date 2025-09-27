
document.querySelector('#criarConta').addEventListener('submit',function(e){
    e.preventDefault();
    
    const tbody = document.querySelector('#dadosConta');

    if(document.querySelector('#tipoConta').value === '0'){
        alert('Selecione uma conta valida!!!')
        document.querySelector('#tipoConta').focus();
        return;
    }

    const campos = [
        document.querySelector('#usuario'),
        document.querySelector('#password'),
        document.querySelector('#email'),
        document.querySelector('#dataCadastro'),
        document.querySelector('#tipoConta'),
    ];

    const tr = document.createElement('tr');

    campos.forEach(campo => {
        const td = document.createElement('td')

        if(campo.type === 'date'){
            const dataFormatada = campo.value;
            const data = new Date(dataFormatada + 'T12:00:00');
            td.textContent = data.toLocaleDateString('pt-BR');
        }

        td.textContent = campo.value;
        tr.appendChild(td);
    });

    tbody.appendChild(tr);

    this.reset();


    
});
