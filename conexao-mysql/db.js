const Sequelize = require('sequelize')
const sequelize = new Sequelize('basetestetreinamento', 'root', '', {
  dialect: 'mysql',
  host: 'localhost'
})

module.exports = sequelize
;(async () => {
  const database = require('./db')

  try {
    const resultado = await database.sync()
    console.log('Conexão realizada com sucesso. ' + resultado)
  } catch (error) {
    console.log('Falha na conexão. ' + error)
  }
})()
