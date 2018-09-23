package io.github.mpeapp.comum

import io.github.mpeapp.BaseDomain

class Moeda extends BaseDomain {

	String descricao

    static constraints = {
    	id generator:'sequence', params:[sequence:'moeda_sequence']
    	descricao nullable:false, blank:false, maxSize:255
    }

	String toString() {
		this.descricao
	}

}
