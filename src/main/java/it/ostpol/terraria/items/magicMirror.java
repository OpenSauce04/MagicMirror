package it.ostpol.terraria.items;

import java.util.Random;

import it.ostpol.terraria.Reference;
import it.ostpol.terraria.terraria;
import it.ostpol.terraria.util.SoundHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraftforge.common.DungeonHooks;

public class magicMirror extends Item {
	
	Random rand = new Random();
	
	public magicMirror() {
		setUnlocalizedName(Reference.TerrariaItems.MAGIC_MIRROR.getUnlocalizedName());
		setRegistryName(Reference.TerrariaItems.MAGIC_MIRROR.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
		maxStackSize = 1;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			if (!worldIn.isRemote) {
				BlockPos pos;
				if (playerIn.getBedLocation() != null) {
					if (playerIn.getBedSpawnLocation(worldIn, playerIn.getBedLocation(), true) != null) {
						pos = playerIn.getBedSpawnLocation(worldIn, playerIn.getBedLocation(), true);
						initTp(pos, playerIn);
					} else { // Bed spawn location Invalid
						playerIn.sendMessage(new TextComponentTranslation(Reference.MOD_ID+".msg.noBed.0"));
					}
				} else { // No bed found
					pos = playerIn.world.getSpawnPoint();
					initTp(pos, playerIn);
				}
			} else {
				worldIn.playSound(playerIn, playerIn.getPosition(), SoundHandler.magicMirror, SoundCategory.BLOCKS, 1, 1);
			}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	private void initTp(BlockPos pos, EntityPlayer player) {
		try {
			java.util.concurrent.TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("Something went wrong! Very wrong: "+e);
		} finally {
			player.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
		}
	}
}
