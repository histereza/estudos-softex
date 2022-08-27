const btn = document.querySelector("#Calcular");

btn.addEventListener("click", function(e) {
    e.preventDefault();
   
    const peso = document.querySelector("#txtbox-peso");
    const altura = document.querySelector("#txtbox-altura");
    var imc = peso / (altura*altura);
    if (imc >= 40) {
        //"Obesidade grave"
    } else if (imc >= 30) {
        //Obesidade
    } else if (imc >= 25) {
        //Sobrepeso
    } else if (imc >= 18.5) {
        //Normal
    } else if (imc < 18.5) {
        //Magreza
    } else {
        //Por favor, tente digitar valores válidos.
    };

    console.log(imc);
});




