package io.github.mpeapp.comum

import io.github.mpeapp.BaseDomain

class Estado extends BaseDomain {

	String nome
	String uf
	String codigoIbge

	static belongsTo = [pais:Pais]

    static constraints = {
    	id generator:'sequence', params:[sequence:'estado_sequence']
    	nome nullable:false, blank:false, maxSize:250
        uf nullable:false, blank:false, maxSize:2
        codigoIbge blank:false
        pais nullable:false
    }

    String toString() {
    	this.nome
    }
}
