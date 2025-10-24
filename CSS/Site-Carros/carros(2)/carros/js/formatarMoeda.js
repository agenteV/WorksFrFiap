export function formatarMoeda(){
    let valor = 0;
    const valorFormatado = new Intl.NumberFormat("pt-BR", {
      //definir o estilo de formatação
      style:"currency",
      //defninir qual moeda será utilizada
      currency:"BRL",
    }).format(valor);

    return valorFormatado;
}