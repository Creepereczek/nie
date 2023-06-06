
package net.mcreator.nie.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.nie.itemgroup.NieItemGroup;
import net.mcreator.nie.NieModElements;

@NieModElements.ModElement.Tag
public class USSRAthemItem extends NieModElements.ModElement {
	@ObjectHolder("nie:ussr_athem")
	public static final Item block = null;

	public USSRAthemItem(NieModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, NieModElements.sounds.get(new ResourceLocation("nie:ussr_athen")),
					new Item.Properties().group(NieItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ussr_athem");
		}
	}
}
