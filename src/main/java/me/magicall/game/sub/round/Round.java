package me.magicall.game.sub.round;

import me.magicall.game.skill.SkillOperation;

import java.util.Collection;

/**
 * 一个回合
 * 
 * @author MaGiCalL
 */
public interface Round {

	Collection<SkillOperation> getSkillOperations();

	void addSkillOperation(SkillOperation skillOperation);

}
