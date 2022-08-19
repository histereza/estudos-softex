function calculadora() {
  let valor1 = Number(prompt('Primeiro valor:'))
  let valor2 = Number(prompt('Segundo valor: '))
  let operacao = prompt('Que operação deseja: \n1 - Soma (+) \n2 - Subtração (-) \n3 - Multiplicação (*) \n4 - Divisaõ (/)')

  switch (operacao) {
    case '+':
      resultado = valor1 + valor2;
      return resultado;
      break;
    case '-':
      resultado = valor1 - valor2;
      return resultado;
      break;
    case '*':
      resultado = valor1 * valor2;
      return resultado;
      break;
    case '/':
      resultado = valor1 / valor2;
      modulo = valor1 % valor2;
      if (modulo !== 0) {
        resultado = Math.trunc(resultado);
        stringResultado = `Divisão inteira: ${resultado}; Resto: ${modulo}`
        return stringResultado;
      } else {
        return resultado;
      }
      break;
  }
  
}

console.log(calculadora());
