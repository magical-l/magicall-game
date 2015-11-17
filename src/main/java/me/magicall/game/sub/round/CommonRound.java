package me.magicall.game.sub.round;

import me.magicall.game.skill.SkillOperation;

import java.util.Collection;
import java.util.LinkedList;

public class CommonRound implements Round {

	private final Collection<SkillOperation> skillOperations = new LinkedList<>();

	public CommonRound() {
		super();
	}

	@Override
	public String toString() {
		return skillOperations.toString();
	}

	@Override
	public Collection<SkillOperation> getSkillOperations() {
		return skillOperations;
	}

	@Override
	public void addSkillOperation(final SkillOperation skillOperation) {
		skillOperations.add(skillOperation);
	}
}
