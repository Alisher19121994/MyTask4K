package com.best.mytask4k.Users

import java.io.Serializable

class Member(var name:String,var id:Int):Serializable {
    override fun toString(): String {
        return "Member(name='$name', id=$id)"
    }
}