package io.github.mpeapp.comum

import io.github.mpeapp.BaseDomain

class Pais extends BaseDomain {

    String nome
    String nomeIngles
    String codigoAlpha2
    String codigoAlpha3
    String codigoM49

    static constraints = {
        id generator:'sequence', params:[sequence:'pais_sequence']
    	nome nullable:false, blank:false, maxSize:200
    	nomeIngles blank:false, maxSize:200
    	codigoAlpha2 blank:false, maxSize:2
    	codigoAlpha3 blank:false, maxSize:3
        codigoM49 blank:false, maxSize:5
    }

    String toString() {
        this.nome
    }
}
