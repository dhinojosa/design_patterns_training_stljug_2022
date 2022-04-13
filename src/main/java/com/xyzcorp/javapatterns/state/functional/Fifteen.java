package com.xyzcorp.javapatterns.state.functional;

public record Fifteen() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return new Thirty();
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}
