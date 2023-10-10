package models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private List<Move> moves;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Dice dice;

    public Game(Board board, List<Player> players, Player winner, Player currentPlayer, GameStatus gameStatus, List<Move> moves, List<Snake> snakes, List<Ladder> ladders, Dice dice) {
        this.board = board;
        this.players = players;
        this.winner = winner;
        this.currentPlayer = currentPlayer;
        this.gameStatus = gameStatus;
        this.moves = moves;
        this.snakes = snakes;
        this.ladders = ladders;
        this.dice = dice;
    }
}
