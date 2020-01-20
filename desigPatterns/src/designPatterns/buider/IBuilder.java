package designPatterns.buider;

public interface IBuilder {
	
	void BuildBody();
	void InsertWheels();
	void AddHeadlights();
	Product GetVehicle();

}
