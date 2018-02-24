package sirglitchalot.bestmodever.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sirglitchalot.bestmodever.Reference;
import sirglitchalot.bestmodever.items.ItemTinIngot;
import sirglitchalot.bestmodever.util.Utils;

public class ModItems {
	
	public static Item tinIngot;

	public static void init() {
		tinIngot = new ItemTinIngot("tin_ingot", "tin_ingot");
	}
	
	public static void register() {
		registerItem(tinIngot);
	}
	
	public static void registryRenders() {
		registerRender(tinIngot);
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Register Item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)),"inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
	
	
}
