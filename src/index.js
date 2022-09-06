const express = require('express')

const app = express()

app.listen(3333)

app.get('/', (request, response) => {
  return response.send({ tipo: 'mensagem', conteudo: 'Hello World!' })
})

app.post('/', (request, response) => {
  return response.send({ tipo: 'mensagem', conteudo: 'Hello everyone!' })
})

app.put('/', (request, response) => {
  return response.send({ tipo: 'mensagem', conteudo: 'Hello someone!' })
})
