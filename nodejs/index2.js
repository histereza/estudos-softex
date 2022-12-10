const express = require('express')
const app = express()

app.get('/listar', (req, res) => {
    res.send('Inicio da aplicação.')
})

app.get('/listar/:id', (req, res) => {
    var id = req.params.id;
    switch(id){
        case '50':
            res.status(404).send('Ocorreu um erro.');
            break;
        case '10':
            res.status(200).send('Operação bem sucedida.');
            break;
        case '0':
            res.sendStatus(300);
            break;
        default:
            console.log('Não foi possível realizar operação.')
    }    
})

app.listen(8080, (() => {
    console.log('Servidor rodando na porta 8080.')
}))