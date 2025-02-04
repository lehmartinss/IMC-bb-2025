package br.senai.sp.jandira.IMC.model

class Medico {

    var id: Int = 0
    var nome:String = ""
    var especialidades = ArrayList<String>()
    var email: String = ""



    fun  exibirFichaMedico(){
        println("----------------------------")
        println("FICHA DO MÉDICO")
        println("-----------------------------")
        println("NOME: $nome")
        println("EMAIL: $email")
        println("ESPECIALIDADES DO MÉDICO:")
        for ( especialidade in especialidades ) {
            println("-> $especialidade")
        }
        println("-------------------------------")
    }
}

