
package net.mcreator.benmods.block;

import net.minecraft.block.material.Material;

@BenModsModElements.ModElement.Tag
public class RawStonebricksBlock extends BenModsModElements.ModElement {

	@ObjectHolder("ben_mods:raw_stonebricks")
	public static final Block block = null;

	public RawStonebricksBlock(BenModsModElements instance) {
		super(instance, 17);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ModdedstuffItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f, 10f).setLightLevel(s -> 0));

			setRegistryName("raw_stonebricks");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
