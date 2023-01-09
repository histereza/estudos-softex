const mongoose = require('mongoose')

const alunoSchema = new mongoose.Schema({
    alunoNome: {
        type: String,
        required: true
    },

    alunoTurma: {
        type: String,
        required: true
    },
    alunoEmail: {
        type: String,
        required: true
    }
})

module.exports = mongoose.model('aluno', alunoSchema)