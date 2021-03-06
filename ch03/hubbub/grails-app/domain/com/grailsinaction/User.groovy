package com.grailsinaction

class User {

    String loginId
    String password
    Date dateCreated

    static hasOne = [ profile : Profile ]

    static hasMany = [ posts : Post, tags : Tag, following : User ]

    static constraints = {

        loginId size: 3..20, unique: true, blank: false
        password size: 6..8, blank: false
        profile nullable: true

    }

    static mapping = {
        profile lazy: false
    }
}
