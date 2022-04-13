package com.xyzcorp.javapatterns.state.functional;

public record Forty() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch(opponentsScore) {
            case Forty f -> new Advantage();
            case Advantage a -> this;
            default -> new Won();
        };
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}
