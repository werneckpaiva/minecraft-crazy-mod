package papai.sinistrao;

import papai.sinistrao.blocs.GerenciadorDeBlocos;
import papai.sinistrao.itens.GerenciadorDeItens;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CrazyTab extends CreativeTabs {

	public CrazyTab(int position, String label) {
		super(position, label);
	}

	@Override
	public Item getTabIconItem() {
		return GerenciadorDeItens.itemPepitaDeGrama;
	}

}

