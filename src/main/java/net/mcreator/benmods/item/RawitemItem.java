
package net.mcreator.benmods.item;

@BenModsModElements.ModElement.Tag
public class RawitemItem extends BenModsModElements.ModElement {

	@ObjectHolder("ben_mods:rawitem")
	public static final Item block = null;

	public RawitemItem(BenModsModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ModdedstuffItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("rawitem");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("used to make a medieval armor"));
		}

	}

}
