package papai.sinistrao;

import papai.sinistrao.blocs.GerenciadorDeBlocos;
import papai.sinistrao.itens.GerenciadorDeItens;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CrazyMod extends CreativeTabs {

	public CrazyMod(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return GerenciadorDeItens.itemPepitaDeGrama;
	}

}
