package sirglitchalot.bestmodever.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import sirglitchalot.bestmodever.Reference;

public class ItemTinIngot extends Item {

	
	public ItemTinIngot(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, registryName));
	}
}
