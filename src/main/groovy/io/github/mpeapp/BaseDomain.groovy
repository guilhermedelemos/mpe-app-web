package io.github.mpeapp

abstract class BaseDomain {

    String situacao // A=Ativo , I=Inativo, E=Excluido
    Date logDataCriacao
    Date logDataAlteracao
    //Usuario logUsuarioCriacao
    //Usuario logUsuarioAlteracao

    static constraints = {
        situacao nullable:false, blank: false, maxSize: 1, defaultValue: "'A'"
        logDataCriacao nullable:false
        logDataAlteracao nullable:false
        //logUsuarioCriacao nullable:false
        //logUsuarioAlteracao
    }

    void ativar() {
        this.situacao = 'A'
    }

    void desativar() {
        this.situacao = 'I'
    }

    void excluir() {
        this.situacao = 'E'
    }

    void setSituacao(String situacao) {
        if(situacao.equals('A') || situacao.equals('I') || situacao.equals('E')) {
            this.situacao = situacao
        }
    }

    abstract String toString()
}
