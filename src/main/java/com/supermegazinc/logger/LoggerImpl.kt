package com.supermegazinc.logger

import android.util.Log

class LoggerImpl: Logger {
    override fun d(tag: String?, message: String) {
        Log.d(tag, message)
    }
    override fun i(tag: String?, message: String) {
        Log.i(tag, message)
    }
    override fun e(tag: String?, message: String) {
        Log.e(tag, message)
    }
}