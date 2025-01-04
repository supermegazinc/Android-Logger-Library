package com.supermegazinc.logger

import android.util.Log

class LoggerCustom(
    private val d: Boolean,
    private val i: Boolean,
    private val e: Boolean
): Logger {
    override fun d(tag: String?, message: String) {
        if(d) Log.d(tag, message)
    }
    override fun i(tag: String?, message: String) {
        if(i) Log.i(tag, message)
    }
    override fun e(tag: String?, message: String) {
        if(e) Log.e(tag, message)
    }
}