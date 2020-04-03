package mero.tutourialmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("merotutorialmod")
public class TutorialMod {
	
	public static TutorialMod instance;
	public static final String modid = "merotutorialmod";
	
	private static final Logger logger = LogManager.getLogger(modid);
	
	public TutorialMod() {
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
}
