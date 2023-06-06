
package net.mcreator.nie.item;

@NieModElements.ModElement.Tag
public class HunterItem extends NieModElements.ModElement {

	@ObjectHolder("nie:hunter")
	public static final Item block = null;

	public HunterItem(NieModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, NieModElements.sounds.get(new ResourceLocation("nie:hunter")),
					new Item.Properties().group(NieItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("hunter");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("nie"));
		}

	}

}
