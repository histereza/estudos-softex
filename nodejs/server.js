/*Como fazer o código rodar:
Primeiramente é necessário ter o framework EXPRESS instalado na máquina.
Para isto, basta digitar npm install express no terminal.
Após a digitação do código digita-se node server.js no terminal,
isso fará com que o servidor comece a rodar.
Para testar as requisições é necessário acessar localhost:8080/
Sugere-se que esse acesso seja feito através de ferramentas como a INSOMNIA
para seleção e visualização dos tipos de requisições.*/

const express = require('express')
const app = express()
const PORT = 8080

app.get('/', (req, res) => {
    res.send('Esta é a requisição GET.')
})

app.post('/', (req, res) => {
    res.send('Requisição POST.')
})


app.put('/', (req, res) => {
    res.send('Requisição PUT.')
})

app.delete('/', (req, res) => {
    res.send('Requisição DELETE.')
})

app.listen(8080, (() => {
    console.log(`Servidor rodando na porta ${PORT}`)
}))