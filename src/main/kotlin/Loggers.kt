package com.rsk

import java.nio.file.Path

class Loggers {
    class FileLogger(val file : Path) :Logger{
        override fun debug(msg: String) {
            TODO("Not yet implemented")
        }

        override fun warning(msg: String) {
            TODO("Not yet implemented")
        }

    }

    class ConsoleLogger : Logger{
        override fun debug(msg: String) {
            TODO("Not yet implemented")
        }

        override fun warning(msg: String) {
            TODO("Not yet implemented")
        }

    }
}