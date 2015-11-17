package me.magicall.game.skill;

import me.magicall.game.Game;

import java.util.Collection;

@FunctionalInterface
public interface TargetSelector {

	Collection<?> select(Game game, Command command) throws NoTargetToBeSelectingException;
}
