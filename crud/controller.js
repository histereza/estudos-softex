const aluno = require('./models')
const mongoose = require('mongoose')

function create(req, res, next) {
    let alunoNome = req.body.alunoNome;
    let alunoTurma = req.body.alunoTurma;
    let alunoEmail = req.body.alunoEmail;

    let aluno = new aluno({
        alunoNome,
        alunoTurma,
        alunoEmail
    })

   
    aluno.save().then((data) => {
        res.send(data)
    })
}

function view(req, res, next) {
    aluno.find({}).then((data) => {
        res.send(data)
    })
}

function update(req, res, next) {
    aluno.findByIdAndUpdate(req.params.id, req.body, (err, aluno) => {
        if (err) {
        return res.status(500).send({error: 'Falha ao atualizar o registro do aluno.'})
        };
        res.send({success: 'Atualização realizada.'})
    })
}

function remove(req, res, next) {
    aluno.findByIdAndDelete(req.params.id, (err, aluno) => {
        if(err) {
            return res.status(500).send({error: 'Falha ao deletar o registro do aluno.'})
        }
        res.send({success: 'Registro deletado com sucesso.'})
    })
}


module.exports.create = create;
module.exports.view = view;
module.exports.update = update;
module.exports.remove = remove;