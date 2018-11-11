package io.github.mpeapp

abstract class BaseDomain {

    public static final String SITUACAO_ATIVO = 'A'
    public static final String SITUACAO_INATIVO = 'I'
    public static final String SITUACAO_EXCLUIDO = 'E'

    String situacao
    Date logDataCriacao
    Date logDataAlteracao

    static constraints = {
        situacao nullable:false, blank: false, maxSize: 1, defaultValue: "A"
        logDataCriacao nullable:false
        logDataAlteracao nullable:false
    }

    void setAtivo() {
        this.situacao = SITUACAO_ATIVO
    }

    void setInativo() {
        this.situacao = SITUACAO_INATIVO
    }

    void setExcluido() {
        this.situacao = SITUACAO_EXCLUIDO
    }

    protected void setSituacao(String situacao) {
        if(situacao.equals(SITUACAO_ATIVO) || situacao.equals(SITUACAO_INATIVO) || situacao.equals(SITUACAO_EXCLUIDO)) {
            this.situacao = situacao
        }
    }

    abstract String toString()
}
