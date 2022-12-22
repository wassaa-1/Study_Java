package step01java8feature.ch2;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean predicate(Apple apple) {
		return Color.GREEN.equals(apple.getColor());
	}

}
