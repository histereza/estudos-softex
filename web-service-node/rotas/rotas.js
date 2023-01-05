const faker = require('faker')

let appRouter = (app) => {
    app.get('/', (req, res) => {
        res.status(200).send('Bem-vindo ao nosso Web Service!')
    })
    
    app.get('/usuario', (req, res) => {
        let dados_usuario = ({
            primeiroNome: faker.name.firstName(),
            ultimoNome: faker.name.lastName(),
            username: faker.internet.userName(),
            email: faker.internet.email()
        });
        res.status(200).send(dados_usuario);
    })

    app.get('/usuarios/:num', (req, res) => {
        let usuarios = []
        let num = req.params.num

        if (isFinite(num) && num > 0) {
            for (i = 0; i <= num - 1; i++) {
                usuarios.push({
                    primeiroNome: faker.name.firstName(),
                    ultimoNome: faker.name.lastName(),
                    username: faker.internet.userName(),
                    email: faker.internet.email()
                });
            }
            res.status(200).send(usuarios);
        } else {
            res.status(400).send({message: 'Numero de usuarios inválido.'})
        }
    })

    app.get('/usuario/:primeiroNome', (req, res) => {
        let nome = req.params.primeiroNome
        if (nome != undefined && nome != "" && nome.length() > 0) {
            let data = ({
                primeiroNome: nome,
                ultimoNome:faker.name.lastName(),
                username: faker.internet.userName(),
                email: faker.internet.email()
            })
            res.status(200).send(data)
        } else {
            res.status(404).send({message: "Nome inválido."})
        }
    })

    app.post('/usuarios', (req, res) => {
        const usuarios = req.body.usuarios;
        if (usuarios.primeiroNome != undefined && usuarios.ultimoNome != undefined
            && usuarios.userName != undefined && usuarios.email != undefined) {
                res.status(201).send({message: 'Usuário salvo com sucesso.'})
            } else {
                res.status(400).send({message: 'Faltam alguns campos do usuário.'})
            }
    })

    app.put('/usuario', (req, res) => {
        let usuario = req.body.usuario
        if (usuario != undefined && usuario.primeiroNome.length() > 0) {
            let usuario_atualizado = ({
                primeiroNome: usuario.primeiroNome,
                ultimoNome: faker.name.lastName(),
                username: faker.internet.userName(),
                email: faker.internet.email()
            })
            res.status(200).send(usuario_atualizado)
        } else {
            res.status(404).send({message: "primeiroNome inválido."})
        }
    })

    app.delete('/usuario/:primeiroNome', (req, res) => {
        let primeiroNome = req.params.primeiroNome
        if (primeiroNome != undefined && primeiroNome.length() > 0) {
            res.status(200).send({message: `${primeiroNome} removido com sucesso.`})
        } else {
            res.status(404).send({message: 'primeiroNome não encontrado.'})
        }
    })

    app.all('/*', (req, res) => {
        res.status(404).send({message: 'Rota não encontrada.'})
    })
}

module.exports = appRouter