function compara(num1, num2) {
  var maior

  if (num1 > num2) {
    maior = num1
  } else if (num2 > num1) {
    maior = num2
  } else {
    console.log('Os números são iguais.')
  }
  let frase = () =>
    maior !== undefined
      ? `${maior} é o maior número.`
      : 'Não há um número maior.'
  return frase()
}

function helpcompara() {
  return 'A função compara recebe dois numeros e diz qual deles é o maior ou se eles são iguais.'
}

console.log(helpcompara())
console.log(compara(5, 5))
