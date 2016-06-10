package burlap.mdp.singleagent.model;

import burlap.mdp.core.Action;
import burlap.mdp.core.state.State;


/**
 * Defines the reward function for a task.
 * @author James MacGlashan
 *
 */
public interface RewardFunction {
	
	/**
	 * Returns the reward received when action a is executed in state s and the agent transitions to state sprime.
	 * @param s the state in which the action was executed
	 * @param a the action executed
	 * @param sprime the state to which the agent transitioned
	 * @return the reward received when action a is executed in state s and the agent transitions to state sprime.
	 */
	double reward(State s, Action a, State sprime);

}