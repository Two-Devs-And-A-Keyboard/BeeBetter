package com.twodevsandakeyboard.beebetter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("beebetter")
public class BeeBetter {
	
	public static BeeBetter instance;
	public static final String modid = "beebetter";
	
	private static final Logger logger = LogManager.getLogger(modid);
	
	public BeeBetter() {
		instance = null;
		// TODO Auto-generated constructor stub
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		logger.info("setup method registiered.");
		
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		logger.info("setup method registiered.");
	}
	
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public	static	 class RegsitryEvents{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			logger.info("Items Registered!");
		}
	}
}
