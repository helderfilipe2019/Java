package designPatterns.abstractFactory;

public interface IMovieFactory {

	ITollywoodMovie GetTollywoodMovie();
	IBollywoodMovie GetBollywoodMovie();	
}
