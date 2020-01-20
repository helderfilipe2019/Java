package designPatterns.creationalPatterns.abstractFactory;

public interface IMovieFactory {

	ITollywoodMovie GetTollywoodMovie();
	IBollywoodMovie GetBollywoodMovie();	
}
