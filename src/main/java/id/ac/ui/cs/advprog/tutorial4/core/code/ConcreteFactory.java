package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.item.Item;
import id.ac.ui.cs.advprog.tutorial4.core.util.RedeemCodeUtil;

import java.util.Map;

public class ConcreteFactory extends CodeFactory{
    public RedeemCode createCode(String codeType, String code, Item item, Map<String,String> data){
        RedeemCode temp= null;
        if(code.equals("")){
            code = RedeemCodeUtil.generateCode();
        }
        if(codeType.equals("giveaway"))
        {

            temp = new Giveaway(code,item, Integer.parseInt(data.get("amount")));
        }
        else if(codeType.equals("promo"))
        {
            temp = new Promo(code,item, Double.parseDouble(data.get("discount")));
        }
        return temp;
    }
}
