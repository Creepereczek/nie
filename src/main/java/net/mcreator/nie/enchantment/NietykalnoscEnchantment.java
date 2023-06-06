
package net.mcreator.nie.enchantment;

@NieModElements.ModElement.Tag
public class NietykalnoscEnchantment extends NieModElements.ModElement {

	@ObjectHolder("nie:nietykalnosc")
	public static final Enchantment enchantment = null;

	public NietykalnoscEnchantment(NieModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("nietykalnosc"));
	}

	public static class CustomEnchantment extends Enchantment {

		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 30;
		}

		@Override
		public int getMaxLevel() {
			return 100;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 3;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return false;
		}

		@Override
		public boolean canVillagerTrade() {
			return false;
		}

	}

}
