package io.github.mpeapp

class Pais {

    String nome
    String nomeIngles
    String codigoAlpha2
    String codigoAlpha3
    String codigoM49
    Date dataCadastro
    String situacao

    static constraints = {
    	nome nullable:false, blank:false, maxSize:200
    	nomeIngles nullable:false, blank:false, maxSize:200
    	codigoAlpha2 nullable:false, blank:false, maxSize:2
    	codigoAlpha3 nullable:false, blank:false, maxSize:3
    	codigoM49 nullable:false, blank:false, maxSize:5
    	situacao nullable:false, blank:false, maxSize:1
    }
}
