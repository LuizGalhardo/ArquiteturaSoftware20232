package PdObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Galhardo
 */


public abstract class Cidades {
    
    private List<Cidades> baseCidades = new ArrayList<Cidades>();
    private String cid = "";

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    
    
    
    public Cidades consCidades(Cidades cidade){
		for(int i = 0; i < baseCidades.size(); i++){
			if(cidade.getCid() == baseCidades.get(i).getCid()){
				return baseCidades.get(i);
			}
		}
		return null;
	}
    
    
    public Cidades addCid(Cidades cidade){

		if(consCidades(cidade)== null){
			baseCidades.add(cidade);
			return cidade;
		}
		else{
			return null;
		}

	}
    
    
}
