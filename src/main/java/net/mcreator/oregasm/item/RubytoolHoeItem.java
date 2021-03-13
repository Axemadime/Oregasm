
package net.mcreator.oregasm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.oregasm.itemgroup.OregasmToolsItemGroup;
import net.mcreator.oregasm.OregasmModElements;

@OregasmModElements.ModElement.Tag
public class RubytoolHoeItem extends OregasmModElements.ModElement {
	@ObjectHolder("oregasm:ruby_hoe")
	public static final Item block = null;
	public RubytoolHoeItem(OregasmModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3069;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 0, -2.8f, new Item.Properties().group(OregasmToolsItemGroup.tab)) {
		}.setRegistryName("ruby_hoe"));
	}
}
