package com.mowmaster.neoa.modtweaks;

import com.mowmaster.neoa.configabs.Config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;

import static com.mowmaster.neoa.items.ItemRegistry.glass_pile;
import static com.mowmaster.neoa.items.ItemRegistry.glass_tinypile;
import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;
import static slimeknights.tconstruct.shared.TinkerFluids.*;
import static slimeknights.tconstruct.shared.TinkerFluids.blueslime;
import static slimeknights.tconstruct.shared.TinkerFluids.purpleSlime;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.cast;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.castCustom;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.clayCast;

/**
 * Created by KingMowmaster on 1/25/2017.
 */
public class TinkerersConstruct
{
    public static void checkTinkerersConstruct()
    {

        if (Loader.isModLoaded("tconstruct"))
        {


            //Smeltable Casts
            TinkerRegistry.registerMelting(cast, brass, 144);
            TinkerRegistry.registerMelting(castCustom, brass, 144);
            TinkerRegistry.registerMelting(clayCast, clay, 288);
            // Ways to get Steel
            //Using Itemstack required an unbroken items to be meltable
            TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_HELMET), steel, 720);
            TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_CHESTPLATE), steel, 1152);
            TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_LEGGINGS), steel, 1008);
            TinkerRegistry.registerMelting(new ItemStack(Items.CHAINMAIL_BOOTS), steel, 576);

            if (Config.recyclableGlass)
            {
                // Glass Recycling
                TinkerRegistry.registerMelting(glass_pile, glass, 1296);
                TinkerRegistry.registerMelting(glass_tinypile, glass, 486);
            }

            TinkerRegistry.registerMelting(Items.GLASS_BOTTLE, glass, 1296);

            if (Loader.isModLoaded("foundry"))
            {
                // Smelting Substratum ingots down into Foundry Fluids
                TinkerRegistry.registerMelting(Items.ENDER_PEARL, FluidRegistry.getFluid("liquidenderpearl"), 250);
                TinkerRegistry.registerMelting(Items.GLOWSTONE_DUST, FluidRegistry.getFluid("liquidglowstone"), 100);
                TinkerRegistry.registerMelting(Blocks.GLOWSTONE, FluidRegistry.getFluid("liquidglowstone"), 400);
                TinkerRegistry.registerMelting(Items.REDSTONE, FluidRegistry.getFluid("liquidredstone"), 100);
                TinkerRegistry.registerMelting(Blocks.REDSTONE_BLOCK, FluidRegistry.getFluid("liquidredstone"), 900);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 15), FluidRegistry.getFluid("liquidenderium"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 11), FluidRegistry.getFluid("liquidplatinum"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 13), FluidRegistry.getFluid("liquidsignalum"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 14), FluidRegistry.getFluid("liquidlumium"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 4), FluidRegistry.getFluid("liquidinvar"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 12), FluidRegistry.getFluid("liquidcupronickel"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 18), FluidRegistry.getFluid("liquidchrome"), 108);
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot")), 1, 16), aluminum, 144);
                //EnderIO Added dark steel to the liquid options
                TinkerRegistry.registerMelting(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("enderio:itemAlloy")), 1, 6), FluidRegistry.getFluid("liquiddarksteel"), 108);

                TinkerRegistry.registerMelting("oreChrome", FluidRegistry.getFluid("liquidchrome"), 216);
                TinkerRegistry.registerMelting("orePlatinum", FluidRegistry.getFluid("liquidplatinum"), 216);
                TinkerRegistry.registerMelting("oreAlumina", aluminum, 288);

            }

            Item SlimeBall = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:edible"));
            Item ConSlime = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:slime_congealed"));

            TinkerRegistry.registerMelting(new ItemStack(SlimeBall, 1, 1), blueslime, 250);
            TinkerRegistry.registerMelting(new ItemStack(ConSlime, 1, 1), blueslime, 1000);
            TinkerRegistry.registerTableCasting(new ItemStack(SlimeBall, 1, 2), null, purpleSlime, 250);
            TinkerRegistry.registerTableCasting(new ItemStack(SlimeBall, 1, 1), null, blueslime, 250);
            TinkerRegistry.registerBasinCasting(new ItemStack(ConSlime, 1, 2), null, purpleSlime, 1000);
            TinkerRegistry.registerBasinCasting(new ItemStack(ConSlime, 1, 1), null, blueslime, 1000);


            Item ThrowBall = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:throwball"));
            Item TCMSlimeCrystal = Item.REGISTRY.getObject(new ResourceLocation("tconstruct:materials"));


            //Removed Recipies
            removeCrafting(ThrowBall);


            //Added Recipies
            //EFLN
            GameRegistry.addShapedRecipe(new ItemStack(ThrowBall, 2, 1), new Object[]{"XYX", "YZY", "XYX", 'X', new ItemStack(Items.GUNPOWDER, 1), 'Y', new ItemStack(Items.SLIME_BALL, 1), 'Z', new ItemStack(Items.MAGMA_CREAM, 1)});
            //GlowstoneThrowableThingy
            GameRegistry.addShapedRecipe(new ItemStack(ThrowBall, 4, 0), new Object[]{"XXX", "XYX", "XXX", 'X', new ItemStack(Items.SNOWBALL, 1), 'Y', new ItemStack(Items.GLOWSTONE_DUST)});


        }
    }
}
