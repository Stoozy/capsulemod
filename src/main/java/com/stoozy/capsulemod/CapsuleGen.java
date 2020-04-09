package com.stoozy.capsulemod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.StructureBlockTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.ResourceLocationException;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

public class  CapsuleGen {
    public CapsuleGen(){
        super();
    }

    public boolean load(TemplateManager templateManager, World world, PlayerEntity player){
        try{
            Template template = templateManager.getTemplate(new ResourceLocation("capsulemod","house"));
        }catch (ResourceLocationException  exception){
            System.out.println(exception);
            return false;
        }
        return true;

    }

    public void addStructure(Template template, World world, BlockPos pos ){
        PlacementSettings settings = new PlacementSettings();
        template.addBlocksToWorld(world, pos, settings);
    }


}