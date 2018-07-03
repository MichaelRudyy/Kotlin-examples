package com.first_try.first.first.sum

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr