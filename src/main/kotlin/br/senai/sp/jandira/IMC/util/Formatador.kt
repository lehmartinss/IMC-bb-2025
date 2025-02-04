package br.senai.sp.jandira.IMC.util

import java.time.LocalDate

fun formadarDataParaBrasil(data:LocalDate):String{
    var dia = "${data.dayOfMonth}"
    var mes = "${data.month.value}"
    var ano = data.year

    if (dia.length < 2){
        dia = "0$dia"
    }
    if(mes.length == 1){
        mes = "0$mes"
    }




    return "$dia/$mes/$ano"
}