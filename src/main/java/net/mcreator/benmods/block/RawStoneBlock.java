
package net.mcreator.benmods.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.benmods.itemgroup.ModdedstuffItemGroup;
import net.mcreator.benmods.item.RawitemItem;
import net.mcreator.benmods.BenModsModElements;

import java.util.List;
import java.util.Collections;

@BenModsModElements.ModElement.Tag
public class RawStoneBlock extends BenModsModElements.ModElement {
	@ObjectHolder("ben_mods:raw_stone")
	public static final Block block = null;
	public RawStoneBlock(BenModsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ModdedstuffItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0));
			setRegistryName("raw_stone");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(RawitemItem.block, (int) (1)));
		}
	}
}
