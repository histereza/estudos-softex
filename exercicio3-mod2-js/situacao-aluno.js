var nota1 = Number(prompt('Informe sua primeira nota: '));
var nota2 = Number(prompt('Informe sua segunda nota: '));
var nota3 = Number(prompt('Informe sua terceira nota: '));
var media = (nota1 + nota2 + nota3) / 3;

situacao = media >= 7 ? 'Aprovado' : 'Reprovado';
console.log(situacao);
