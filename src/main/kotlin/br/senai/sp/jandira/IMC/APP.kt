package br.senai.sp.jandira.IMC

import br.senai.sp.jandira.IMC.model.Medico
import br.senai.sp.jandira.IMC.model.Paciente
import java.time.LocalDate

fun main() {
    //Criar o paciente Ana Maria
    var paciente1 = Paciente()
    paciente1.id = 1
    paciente1.nome = "Ana Maria"
    paciente1.email = "ana@email.com"
    paciente1.altura = 1.67
    paciente1.peso = 59
    paciente1.dataNascimento = LocalDate.of(2001,8,13)
    paciente1.calcularIMC()
    paciente1.classificarIMC()
    paciente1.mostrarDadosBiometricos()


    // Criar o paciente Pedro de Oliveira
    var paciente2 = Paciente()
    paciente2.id = 2
    paciente2.nome = " Pedro de Oliveira "
    paciente2.email = " pedro@email.com"
    paciente2.altura = 1.50
    paciente2.peso = 50
    paciente2.dataNascimento = LocalDate.of(2001,9,5)
    paciente2.calcularIMC()
    paciente2.classificarIMC()
    paciente2.mostrarDadosBiometricos()



    // Criar um objeto medico
    var medico1 = Medico()
    var medico2 = Medico()

    medico1.id = 1
    medico1.nome = "Roberta da Silva"
    medico1.email = "roberta@hospital.com"
    medico1.especialidades.add("Nutricionista")
    medico1.especialidades.add("Gastroenterologista")
    medico1.exibirFichaMedico()


}

