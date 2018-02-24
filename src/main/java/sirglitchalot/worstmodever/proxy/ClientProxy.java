package sirglitchalot.bestmodever.proxy;

import sirglitchalot.bestmodever.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void registerRenders() {
		
		ModItems.registryRenders();
	}

}
