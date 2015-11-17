package me.magicall.game.sub.round;

import me.magicall.coll.CollectionFactory;

import java.util.LinkedList;
import java.util.List;

public class RoundManager<R extends Round> {

	protected final LinkedList<R> rounds;

	public RoundManager(final CollectionFactory collectionFactory) {
		rounds = collectionFactory.newLinkedList();
	}

	public List<R> getRounds() {
		return rounds;
	}

	public boolean addRound(final R round) {
		return rounds.add(round);
	}

	public R popLastRound() {
		return rounds == null ? null : rounds.pollLast();
	}

	public R getLastRound() {
		return rounds.peekLast();
	}

	public int getRoundsCount() {
		return rounds.size();
	}
}
