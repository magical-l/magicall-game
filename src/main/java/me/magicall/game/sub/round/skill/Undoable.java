package me.magicall.game.sub.round.skill;

import me.magicall.game.sub.round.Round;

import java.util.List;

/**
 * @author MaGiCalL
 */
public interface Undoable {

	List<? extends Round> undo(int undoRoundCount);

	Round undo();

	/**
	 * @author MaGiCalL
	 */
	public static interface Redoable extends Undoable {
		List<? extends Round> redo(int redoRoundCount);

		Round redo();
	}
}
