package com.stoozy.capsulemod;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.state.properties.StructureMode;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.template.IntegrityProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

import javax.swing.text.Position;

public class CapsuleItem extends Item {

    public CapsuleItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
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
