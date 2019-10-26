package com.rba.modular.model.mapper

import com.rba.modular.model.entity.response.ErrorResponse
import com.rba.modular.model.model.ErrorModel

object ErrorMapper {

    fun transform(errorResponse: ErrorResponse): ErrorModel {

        val errorModel = ErrorModel()
        errorModel.code = errorResponse.code
        errorModel.message = errorResponse.message
        errorModel.status = errorResponse.status

        return errorModel
    }

}