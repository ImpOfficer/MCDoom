package mod.azure.doom.rei;

public class DoomDisplay { // implements Display {
//	public final List<EntryIngredient> input;
//	public final List<Integer> count;
//	public final EntryIngredient output;
//	public final GunTableRecipe recipe2;
//
//	public DoomDisplay(GunTableRecipe recipe) {
//		input = Arrays.stream(recipe.ingredients).map(Pair::getLeft).map(EntryIngredients::ofIngredient).toList();
//		count = Arrays.stream(recipe.ingredients).map(Pair::getRight).toList();
//		this.output = EntryIngredients.of(recipe.getResultItem());
//		this.recipe2 = recipe;
//	}
//
//	@Override
//	public List<EntryIngredient> getInputEntries() {
//		return Arrays.stream(recipe2.ingredients).map(Pair::getLeft).map(EntryIngredients::ofIngredient).toList();
//	}
//
//	@Override
//	public List<EntryIngredient> getOutputEntries() {
//		return Collections.singletonList(output);
//	}
//
//	@Override
//	public CategoryIdentifier<?> getCategoryIdentifier() {
//		return ReiPlugin.CRAFTING;
//	}
}