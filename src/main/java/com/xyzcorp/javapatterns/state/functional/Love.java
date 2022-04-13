package com.xyzcorp.javapatterns.state.functional;

public record Love() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return new Fifteen();
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}
