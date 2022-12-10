const express = require('express')
const app = express()
const PORT = 8080

app.get('/', (req, res) => {
    res.send('Esta é a página principal.')
})

app.get('/status/:status', (req, res) => {
   var status = req.params.status;
   switch(status) {
    case '200':
        res.send('O status 200 indica que está tudo ok.');
        break;
    case '404':
        res.send('O status 404 indica que houve um erro');
        break;
    case '500':
        res.send('O status 500 indica que há alguma incompatibilidade no site.');
        break;
    default:
        res.send('Status não encontrado.')
   }
})

app.get('/redirect', (req, res) => {
    res.redirect('/')
})

app.set('view engine', 'ejs')

app.get('/render', (req, res) => {
    res.render('pagina')
})

app.listen(8080, (() => {
    console.log(`Servidor rodando na porta ${PORT}`)
}))