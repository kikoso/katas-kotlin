package org.example

fun evaluate(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum ->  evaluate(expr.left) + evaluate(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr