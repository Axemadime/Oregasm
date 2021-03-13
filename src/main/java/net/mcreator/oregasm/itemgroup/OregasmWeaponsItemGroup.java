
package net.mcreator.oregasm.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.oregasm.item.RubytoolSwordItem;
import net.mcreator.oregasm.OregasmModElements;

@OregasmModElements.ModElement.Tag
public class OregasmWeaponsItemGroup extends OregasmModElements.ModElement {
	public OregasmWeaponsItemGroup(OregasmModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taboregasm_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubytoolSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
