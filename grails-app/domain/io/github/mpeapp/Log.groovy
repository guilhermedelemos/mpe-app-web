package io.github.mpeapp

class Log {

    String mensagem
    Date dataCadastro

    static constraints = {
    	mensagem nullable:false, blank:false, maxSize:250
    }
}
