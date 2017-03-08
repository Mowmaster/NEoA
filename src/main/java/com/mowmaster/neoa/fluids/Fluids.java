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
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Fluids
{
    private static ModelResourceLocation cake_location = new ModelResourceLocation(Reference.MODID + ":" + BlockCake.name, "fluid");
    private static ModelResourceLocation pie_location = new ModelResourceLocation(Reference.MODID + ":" + BlockPie.name, "fluid");
    private static ModelResourceLocation cookie_location = new ModelResourceLocation(Reference.MODID + ":" + BlockCookie.name, "fluid");
    private static ModelResourceLocation bread_location = new ModelResourceLocation(Reference.MODID + ":" + BlockBread.name, "fluid");
    private static ModelResourceLocation msoup_location = new ModelResourceLocation(Reference.MODID + ":" + BlockMSoup.name, "fluid");
    private static ModelResourceLocation rsoup_location = new ModelResourceLocation(Reference.MODID + ":" + BlockRSoup.name, "fluid");
    private static ModelResourceLocation bsoup_location = new ModelResourceLocation(Reference.MODID + ":" + BlockBSoup.name, "fluid");

    public static void register() {
        FluidRegistry.enableUniversalBucket();
        
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

        FluidRegistry.registerFluid(FluidPie.instance);
        GameRegistry.registerBlock(BlockPie.instance, BlockPie.name);
        Item pie = Item.getItemFromBlock(BlockPie.instance);
        ModelLoader.setCustomMeshDefinition(pie, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return pie_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockPie.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return pie_location;
            }
        });

        FluidRegistry.registerFluid(FluidCookie.instance);
        GameRegistry.registerBlock(BlockCookie.instance, BlockCookie.name);
        Item cookie = Item.getItemFromBlock(BlockCookie.instance);
        ModelLoader.setCustomMeshDefinition(cookie, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return cookie_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockCookie.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return cookie_location;
            }
        });

        FluidRegistry.registerFluid(FluidBread.instance);
        GameRegistry.registerBlock(BlockBread.instance, BlockBread.name);
        Item bread = Item.getItemFromBlock(BlockBread.instance);
        ModelLoader.setCustomMeshDefinition(bread, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return bread_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockBread.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return bread_location;
            }
        });

        FluidRegistry.registerFluid(FluidMSoup.instance);
        GameRegistry.registerBlock(BlockMSoup.instance, BlockMSoup.name);
        Item msoup = Item.getItemFromBlock(BlockMSoup.instance);
        ModelLoader.setCustomMeshDefinition(msoup, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return msoup_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockMSoup.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return msoup_location;
            }
        });

        FluidRegistry.registerFluid(FluidRSoup.instance);
        GameRegistry.registerBlock(BlockRSoup.instance, BlockRSoup.name);
        Item rsoup = Item.getItemFromBlock(BlockRSoup.instance);
        ModelLoader.setCustomMeshDefinition(rsoup, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return rsoup_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockRSoup.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return rsoup_location;
            }
        });

        FluidRegistry.registerFluid(FluidBSoup.instance);
        GameRegistry.registerBlock(BlockBSoup.instance, BlockBSoup.name);
        Item bsoup = Item.getItemFromBlock(BlockBSoup.instance);
        ModelLoader.setCustomMeshDefinition(bsoup, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return bsoup_location;
            }
        });
        ModelLoader.setCustomStateMapper(BlockBSoup.instance, new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return bsoup_location;
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

    public static final class FluidPie extends Fluid {

        public static final String name = "pie";
        public static final FluidPie instance = new FluidPie();

        public FluidPie() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(10000);
        }
    }

    public static final class FluidCookie extends Fluid {

        public static final String name = "cookie";
        public static final FluidCookie instance = new FluidCookie();

        public FluidCookie() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(20000);
        }
    }

    public static final class FluidBread extends Fluid {

        public static final String name = "bread";
        public static final FluidBread instance = new FluidBread();

        public FluidBread() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(20000);
        }
    }

    public static final class FluidMSoup extends Fluid {

        public static final String name = "msoup";
        public static final FluidMSoup instance = new FluidMSoup();

        public FluidMSoup() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(5000);
        }
    }

    public static final class FluidRSoup extends Fluid {

        public static final String name = "rsoup";
        public static final FluidRSoup instance = new FluidRSoup();

        public FluidRSoup() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(5000);
        }
    }

    public static final class FluidBSoup extends Fluid {

        public static final String name = "bsoup";
        public static final FluidBSoup instance = new FluidBSoup();

        public FluidBSoup() {
            super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flowing"));
            this.setViscosity(5000);
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

    public static final class BlockPie extends BlockFluidClassic {

        public static final BlockPie instance = new BlockPie();
        public static final String name = "pie";

        public BlockPie() {
            super(FluidPie.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }

    public static final class BlockCookie extends BlockFluidClassic {

        public static final BlockCookie instance = new BlockCookie();
        public static final String name = "cookie";

        public BlockCookie() {
            super(FluidCookie.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }

    public static final class BlockBread extends BlockFluidClassic {

        public static final BlockBread instance = new BlockBread();
        public static final String name = "bread";

        public BlockBread() {
            super(FluidBread.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }

    public static final class BlockMSoup extends BlockFluidClassic {

        public static final BlockMSoup instance = new BlockMSoup();
        public static final String name = "msoup";

        public BlockMSoup() {
            super(FluidMSoup.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }

    public static final class BlockRSoup extends BlockFluidClassic {

        public static final BlockRSoup instance = new BlockRSoup();
        public static final String name = "rsoup";

        public BlockRSoup() {
            super(FluidRSoup.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }

    public static final class BlockBSoup extends BlockFluidClassic {

        public static final BlockBSoup instance = new BlockBSoup();
        public static final String name = "bsoup";

        public BlockBSoup() {
            super(FluidBSoup.instance, Material.WATER);
            setUnlocalizedName(name);
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
            return EnumBlockRenderType.MODEL;
        }
    }
}
