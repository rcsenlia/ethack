package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.item.Item;
import id.ac.ui.cs.advprog.tutorial4.core.util.RedeemCodeUtil;

import java.util.Map;

public abstract class CodeFactory {
    public abstract RedeemCode createCode(String codeType, String code, Item item, Map<String,String> data);
}
