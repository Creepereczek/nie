
package net.mcreator.nie.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.nie.itemgroup.NieItemGroup;
import net.mcreator.nie.NieModElements;

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
	}
}
