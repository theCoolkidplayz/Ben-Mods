
package net.mcreator.benmods.item;

@BenModsModElements.ModElement.Tag
public class KnifeItem extends BenModsModElements.ModElement {

	@ObjectHolder("ben_mods:knife")
	public static final Item block = null;

	public KnifeItem(BenModsModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 0.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(ModdedstuffItemGroup.tab)) {

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("A Simple Weapon With A Deadly Blade"));
			}

		}.setRegistryName("knife"));
	}

}
