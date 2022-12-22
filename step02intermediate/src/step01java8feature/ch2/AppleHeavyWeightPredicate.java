package step01java8feature.ch2;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean predicate(Apple apple) {
		return apple.getWeight() > 150;
	}

}
