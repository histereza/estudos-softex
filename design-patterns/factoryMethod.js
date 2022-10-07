class Computer {
  constructor(ram, hdd, cpu, type) {
    ;(this.ram = ram),
      (this.hdd = hdd),
      (this.cpu = cpu),
      (this.type = type)
  }
}

function Factory() {
  if (type == 'Pc') {
    return new Pc(ram, hdd, cpu, type)
  } else if (type == 'Server') {
    return new Server(ram, hdd, cpu, type)
  }
}

//GETTERS
function getRam() {
  return this.ram
}

function getHdd() {
  return this.hdd
}

function getCpu() {
  return this.cpu
}

function getType() {
  return this.type
}

toString() = console.log(`Informações deste computador: \nTipo: ${this.type} \nRAM: ${this.ram} GB; \nHDD: ${this.hdd} GB; \nCPU: ${this.cpu} GHz`)