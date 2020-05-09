package interfaces;

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves =0;

    @Override
    public boolean move() {
        return false;
    }
}

public class Games {
}
