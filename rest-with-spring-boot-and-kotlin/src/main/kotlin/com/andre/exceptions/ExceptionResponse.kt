package com.andre.exceptions

import java.util.*

class ExceptionResponse(
    val timestamp: Date = Date(),
    val message: String?,
    val details: String
)