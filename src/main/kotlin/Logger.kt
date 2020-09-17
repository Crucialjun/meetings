package com.rsk

import java.nio.file.Path

interface Logger {
    fun debug(msg:String)
    fun warning(msg:String)
    fun info(msg:String){
        warning(msg)
    }

}

