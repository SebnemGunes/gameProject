package Concrete;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getGameName()+" oyunu eklendi!");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+" oyunu silindi!");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+" oyunu güncellendi!");

    }

    @Override
    public void addAll(Game[] games) {
for (Game game:games){
    System.out.println(game.getGameName());
}
    }
}
