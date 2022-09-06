var venda = {
  codigo: 2252,
  qtdeItens: 3,
  pagamento: 'espécie',
  valor: 50.0
}

var lista = ['arroz', 'sabão', 'shampoo']

function percorrerObj(objeto) {
  for (let p in objeto) {
    console.log(`${p}: ` + objeto[p])
  }
}

function percorrerArray(array) {
  for (let i of array) {
    console.log(i)
  }
}

percorrerObj(venda)
percorrerArray(lista)
