const express = require('express')
const router = express()
const create = require('./controller')
const view = require('./controller')
const update = require('./controller')
const remove = require('./controller')
const bodyParser = require('body-parser')

router.use(bodyParser.json())
router.post('/create', create.create)
router.get('/', view.view)
router.patch('/:id', update.update)
router.delete('/delete/:id', remove.remove)

module.exports = router