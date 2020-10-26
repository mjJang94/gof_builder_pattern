package com.mj.gof_builder_pattern

class Body(

    val weight: Int,
    val height: Int,
    val name: String?
){
    constructor(builder: Builder) : this(builder.weight, builder.height, builder.name)


    class Builder{
        var weight: Int = 0
        private set

        var height: Int = 0
        private set

        var name: String? = null
        private set

        fun weight(weight: Int) = apply { this.weight = weight }
        fun height(height: Int) = apply { this.height = height }
        fun name(name: String) = apply { this.name = name }
    }
}