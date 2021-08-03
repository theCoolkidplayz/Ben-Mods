
package net.mcreator.benmods.item;

@BenModsModElements.ModElement.Tag
public class CobbleArmorItem extends BenModsModElements.ModElement {

	@ObjectHolder("ben_mods:cobble_armor_helmet")
	public static final Item helmet = null;

	@ObjectHolder("ben_mods:cobble_armor_chestplate")
	public static final Item body = null;

	@ObjectHolder("ben_mods:cobble_armor_leggings")
	public static final Item legs = null;

	@ObjectHolder("ben_mods:cobble_armor_boots")
	public static final Item boots = null;

	public CobbleArmorItem(BenModsModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1, 3, 4, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 5;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.COBBLESTONE, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "cobble_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ModdedstuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ben_mods:textures/models/armor/coble_armor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("cobble_armor_helmet"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ModdedstuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ben_mods:textures/models/armor/coble_armor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("cobble_armor_chestplate"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ModdedstuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ben_mods:textures/models/armor/coble_armor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("cobble_armor_leggings"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ModdedstuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ben_mods:textures/models/armor/coble_armor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("cobble_armor_boots"));
	}

}
