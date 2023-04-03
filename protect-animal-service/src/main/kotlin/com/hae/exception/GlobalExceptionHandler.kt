package com.hae.exception

import com.auth0.jwt.exceptions.TokenExpiredException
import mu.KotlinLogging
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice // controlleradvice + responsebody = 컨트롤러에서 발생할 수 있는 예외를 잡아서 처리, 객체 리턴
class GlobalExceptionHandler {
    //kotlinLogging : 코틀린에서 로깅을 쉽게 사용할 수 있도록 하는 라이브러리
    private val logger = KotlinLogging.logger {}

    @ExceptionHandler(ServerException::class)
    fun handleServerException(ex: ServerException): ErrorResponse {
        logger.error { ex.message }
        return ErrorResponse(code = ex.code, message = ex.message)
    }

    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception): ErrorResponse {
        logger.error { ex.message }
        return ErrorResponse(code = 500, message = "Internal Server Error")
    }

}