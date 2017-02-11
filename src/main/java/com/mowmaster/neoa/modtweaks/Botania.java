package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import vazkii.botania.api.recipe.RecipeElvenTrade;
import vazkii.botania.api.recipe.RecipeManaInfusion;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;
import static vazkii.botania.api.BotaniaAPI.*;

/**
 * Created by KingMowmaster on 2/10/2017.
 */
public class Botania
{
    public static void checkBotania()
    {
        String[] type= new String[] {"Helm","Chest","Legs","Boots","Sword","Axe","Pick","Shovel","Shears"};
        for(int x = 0; x < type.length; x++) {
            removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("botania:manasteel" + type[x])));
        }
        for(int x = 0; x < type.length; x++) {
            removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("botania:elementium" + type[x])));
        }

        Item BHelm = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelHelm"));
        Item BChest = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelChest"));
        Item BLegs = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelLegs"));
        Item BBoots = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelBoots"));
        Item BSword = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelSword"));
        Item BAxe = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelAxe"));
        Item BPickaxe = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelPick"));
        Item BShovel = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelShovel"));
        Item BShears = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelShears"));

        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BHelm),new ItemStack(Items.IRON_HELMET),15000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BChest),new ItemStack(Items.IRON_CHESTPLATE),24000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BLegs),new ItemStack(Items.IRON_LEGGINGS),21000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BBoots),new ItemStack(Items.IRON_BOOTS),12000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BSword),new ItemStack(Items.IRON_SWORD),6000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BAxe),new ItemStack(Items.IRON_AXE),9000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BPickaxe),new ItemStack(Items.IRON_PICKAXE),9000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BShovel),new ItemStack(Items.IRON_SHOVEL),3000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BShears),new ItemStack(Items.SHEARS),6000));



        Item BEHelm = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumHelm"));
        Item BEChest = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumChest"));
        Item BELegs = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumLegs"));
        Item BEBoots = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumBoots"));
        Item BESword = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumSword"));
        Item BEAxe = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumAxe"));
        Item BEPickaxe = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumPick"));
        Item BEShovel = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumShovel"));
        Item BEShears = Item.REGISTRY.getObject(new ResourceLocation("botania:elementiumShears"));

        registerElvenTradeRecipe(new ItemStack(BEHelm),new ItemStack(BHelm),new ItemStack(BHelm));
        registerElvenTradeRecipe(new ItemStack(BEChest),new ItemStack(BChest),new ItemStack(BChest));
        registerElvenTradeRecipe(new ItemStack(BELegs),new ItemStack(BLegs),new ItemStack(BLegs));
        registerElvenTradeRecipe(new ItemStack(BEBoots),new ItemStack(BBoots),new ItemStack(BBoots));
        registerElvenTradeRecipe(new ItemStack(BESword),new ItemStack(BSword),new ItemStack(BSword));
        registerElvenTradeRecipe(new ItemStack(BEAxe),new ItemStack(BAxe),new ItemStack(BAxe));
        registerElvenTradeRecipe(new ItemStack(BEPickaxe),new ItemStack(BPickaxe),new ItemStack(BPickaxe));
        registerElvenTradeRecipe(new ItemStack(BEShovel),new ItemStack(BShovel),new ItemStack(BShovel));
        registerElvenTradeRecipe(new ItemStack(BEShears),new ItemStack(BShears),new ItemStack(BShears));

    }
}
