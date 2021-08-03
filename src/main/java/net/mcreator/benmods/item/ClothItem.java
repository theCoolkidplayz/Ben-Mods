
package net.mcreator.benmods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.benmods.itemgroup.ModdedstuffItemGroup;
import net.mcreator.benmods.BenModsModElements;

@BenModsModElements.ModElement.Tag
public class ClothItem extends BenModsModElements.ModElement {
	@ObjectHolder("ben_mods:cloth")
	public static final Item block = null;
	public ClothItem(BenModsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ModdedstuffItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("cloth");
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
	}
}
