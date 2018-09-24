package io.github.mpeapp

class AcessoFilter {
    def filters = {
        acesso(controller:'*', action:'*') {
            before = {
                /*if( session['usuario']) {
                    return true
                } else {
                    if( controllerName == null || actionName == 'autenticar' ) {
                        return true
                    } else {
                        redirect(uri:'/')
                    }
                }*/
                return true
            }
        }
    }
}