package br.senai.sp.jandira.IMC.model

import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var id:Int = 0
    var nome:String = ""
    var dataNascimento: LocalDate? = null
    var email:String = ""
    var peso:Int = 0
    var altura:Double = 0.0
    var IMC:Double = 0.0
    var classificacaoIMC: String = ""

    fun calcularIMC(): Double{
        IMC = peso / altura.pow(2)
        return IMC
    }
    fun mostrarDadosBiometricos(){
        println("----------------------------")
        println("DADOS DO PACIENTE")
        println("-----------------------------")
        println("NOME: $nome")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: $IMC")
        println("CLASSIFICAÇÃO: $classificacaoIMC")
        println("IDADE: ${calcularIdade()}")
        println("-------------------------------")
    }

    fun classificarIMC(){
        if (IMC <= 18.5) {
            classificacaoIMC = "Abaixo do peso"
        }else if (IMC > 18.5 &&  IMC < 25.0){
            classificacaoIMC = "Peso Ideal"
        }else {
            classificacaoIMC = "Acima do Peso"
        }
    }

    fun calcularIdade(): Int{
        return Period.between(dataNascimento, LocalDate.now()).years
    }
}