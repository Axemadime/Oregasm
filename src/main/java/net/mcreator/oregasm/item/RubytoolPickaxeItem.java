
package net.mcreator.oregasm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.oregasm.itemgroup.OregasmItemGroup;
import net.mcreator.oregasm.OregasmModElements;

@OregasmModElements.ModElement.Tag
public class RubytoolPickaxeItem extends OregasmModElements.ModElement {
	@ObjectHolder("oregasm:rubytool_pickaxe")
	public static final Item block = null;
	public RubytoolPickaxeItem(OregasmModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -2.8f, new Item.Properties().group(OregasmItemGroup.tab)) {
		}.setRegistryName("rubytool_pickaxe"));
	}
}
