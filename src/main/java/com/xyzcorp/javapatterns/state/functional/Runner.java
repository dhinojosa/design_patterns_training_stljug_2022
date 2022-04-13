package com.xyzcorp.javapatterns.state.functional;


public class Runner {
    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(new Player("Salvador"), new Player("Rafael"));
        TennisGame resultGame =
            tennisGame
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael) //Game already won, Sal fifteen, Ray Won
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael);

        String score = resultGame.score();
        System.out.println(score);
    }
}
