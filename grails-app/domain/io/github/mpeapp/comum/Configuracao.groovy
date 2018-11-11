package io.github.mpeapp.comum

import io.github.mpeapp.BaseDomain

class Configuracao extends BaseDomain {

    String chave
    String valor
    String descricao

    static constraints = {
        id generator:'sequence', params:[sequence:'sequence_configuracao']
        chave nullable:false, blank:false, maxSize:255
        valor nullable:false, blank:false, maxSize:255
        descricao nullable:false, blank:false, maxSize:255, unique:true
    }

    String toString() {
        this.chave + ":" + this.valor
    }

}
