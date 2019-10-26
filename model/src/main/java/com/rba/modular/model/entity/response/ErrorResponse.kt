package com.rba.modular.model.entity.response

data class ErrorResponse(
    var code: Int = 0,
    var status: String? = null,
    var message: String? = null
)