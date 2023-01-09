const express = require('express')
const app = express()
const router = require('./routes')

app.use('/aluno', router)

app.get('/', (req, res) => {
    res.send('Bem-vindo ao Sistema Educacional')
})

app.listen(8080, () => {
    console.log('Servidor rodando com sucesso.')
})
