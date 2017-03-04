package com.mowmaster.neoa.fluids;

import com.mowmaster.neoa.references.Reference;
import net.minecraft.block.BlockCake;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class FluidCakeBatter
{
    private static ModelResourceLocation cake_location = new ModelResourceLocation(Reference.MODID + ":" + BlockCake.name, "fluid");

    public static void register() {
        FluidRegistry.registerFluid(FluidCake.instance);
        GameRegistry.registerBlock(BlockCake.instance, BlockCake.name);
        Item cake = Item.getItemFromBlock(BlockCake.instance);
        ModelLoader.setCustomMeshDefinition(cake, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return cake_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockCake.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return cake_location;
            }
        });
    }

    public static final class FluidCake extends Fluid {

        public static final String name = "cake";
        public static final FluidCake instance = new FluidCake();

        public FluidCake() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(10000);
        }
    }

    public static final class BlockCake extends BlockFluidClassic {

        public static final BlockCake instance = new BlockCake();
        public static final String name = "cake";

        public BlockCake() {
            super(FluidCake.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }
}
