package com.rba.modular.model.model

data class DefaultErrorModel(
    var message: String
) {
    constructor() : this("Ocurrió un error...")
}