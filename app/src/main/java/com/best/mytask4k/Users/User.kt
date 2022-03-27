package com.best.mytask4k.Users

import java.io.Serializable

class User(var name:String,var id:Int):Serializable {
    override fun toString(): String {
        return "User(name='$name', id=$id)"
    }
}