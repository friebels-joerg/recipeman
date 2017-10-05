package de.friebels.recipeman.domain.recipe;

import de.friebels.recipeman.domain.attribute.Name;

public class RecipeBuilder {

	private Recipe recipe = new Recipe();
	
	public Recipe build()  {
		return recipe;
	}
	
	public RecipeBuilder setName(final String name) {
		recipe = recipe.setName(Name.fromValue(name));
		return this;
	}
	
}
