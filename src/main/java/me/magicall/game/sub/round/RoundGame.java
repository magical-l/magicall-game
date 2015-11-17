package me.magicall.game.sub.round;

import me.magicall.game.Game;
import me.magicall.game.sub.round.plugin.RoundPlugin;

import java.util.List;

public interface RoundGame extends Game {

	@Override
	RoundGameConfig getConfig();

	/**
	 * 上一个回合或本回合
	 * 
	 * @return
	 */
	Round getLastRound();

	int getRoundsCount();

	List<? extends Round> getRounds();

	void addRoundPlugin(RoundPlugin plugin);

	/**
	 * 当前回合
	 * 
	 * @return
	 */
	Round getCurRound();

	boolean containsRoundPlugin(RoundPlugin plugin);
}
