const express = require("express")
const app = express()

app.get("/inicio", (req,res) => {
    res.send("Esta é uma requisição HTTP do tipo GET.")
})

app.post("/inicio", (req, res) => {
    res.send("Esta é uma requisição HTTP do tipo POST.")
})

app.listen(8080, (() => {
    console.log("Servidor rodando na porta 8080")
}))
