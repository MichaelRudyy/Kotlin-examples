package com.second_try.c3.a6_Clean_coding

data class User(val id: Int,
                var name: String,
                var adress: String)

fun User.validate(){
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException("WRONG ${fieldName} in ${id}")
        }
    }

    validate(name,"name")
    validate(adress,"Adress")
}

fun saveUser(user: User){
    user.validate()
}

fun main(args: Array<String>) {
    val user = User(1,"","");
    try {
        saveUser(user)
    }catch (e:IllegalArgumentException){
        e.printStackTrace()
    }

}