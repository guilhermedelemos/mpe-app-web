package io.github.mpeapp.comum

import io.github.mpeapp.BaseDomain

class Cidade extends BaseDomain {

	String nome
	String codigoIbge

	static belongsTo = [estado:Estado]

    static constraints = {
    	id generator:'sequence', params:[sequence:'cidade_sequence']
    	nome nullable:false, blank:false, maxSize:250
        codigoIbge blank:false, maxSize:10
        estado nullable:false
    }

    String toString() {
    	this.nome
    }

}
