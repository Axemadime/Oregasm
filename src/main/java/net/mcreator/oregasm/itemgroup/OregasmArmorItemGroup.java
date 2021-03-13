
package net.mcreator.oregasm.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.oregasm.item.RubyarmorItem;
import net.mcreator.oregasm.OregasmModElements;

@OregasmModElements.ModElement.Tag
public class OregasmArmorItemGroup extends OregasmModElements.ModElement {
	public OregasmArmorItemGroup(OregasmModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taboregasm_armor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyarmorItem.helmet, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
