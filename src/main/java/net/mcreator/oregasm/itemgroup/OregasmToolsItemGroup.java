
package net.mcreator.oregasm.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.oregasm.item.RubytoolPickaxeItem;
import net.mcreator.oregasm.OregasmModElements;

@OregasmModElements.ModElement.Tag
public class OregasmToolsItemGroup extends OregasmModElements.ModElement {
	public OregasmToolsItemGroup(OregasmModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taboregasm_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubytoolPickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
