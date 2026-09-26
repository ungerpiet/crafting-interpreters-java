package com.craftinginterpreters.lox;

public class AstPrinter {

    public String print(Expr expr) {
        return switch (expr) {
            case Expr.Binary b -> parenthesize(b.operator().lexeme(),b.left(),b.right());
            case Expr.Grouping g -> parenthesize("group",g.expression());
            case Expr.Literal l -> l.value() == null? "nil" : l.value().toString();
            case Expr.Unary u ->  parenthesize(u.operator().lexeme(), u.right());
        };
    }

    private String parenthesize(String name, Expr... exprs) {
        StringBuilder builder = new StringBuilder();
        builder.append("(").append(name);
        for (Expr expr : exprs) {
            builder.append(" ");
            builder.append(print(expr));
        }
        builder.append((")"));
        return builder.toString();
    }
}
