package com.xyzcorp.javapatterns.state.functional;


public class Runner {
    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(new Player("Salvador"),
            new Player("Rafael"));
        TennisGame criticalMoment = tennisGame
            .nextTurn((sal, rafael) -> rafael)
            .nextTurn((sal, rafael) -> sal);

        TennisGame resultGame =
            criticalMoment
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael) //Game already won, Sal
                // fifteen, Ray Won
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael);

        TennisGame salDominates =
            criticalMoment
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> sal);

        System.out.println(resultGame.score());
        System.out.println(salDominates.score());
    }
}
