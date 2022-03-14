package id.ac.ui.cs.advprog.tutorial4.core.code;


import id.ac.ui.cs.advprog.tutorial4.core.item.MerchItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ConcreteFactoryTest {
    ConcreteFactory concreteFactory;
    @BeforeEach
    public void setup(){
        concreteFactory = new ConcreteFactory();
    }

    @Test
    public void whenCreateCodeIsCalledItShouldReturnCorrectCode(){
        Map<String,String> data = new HashMap();
        data.put("amount","1");
        RedeemCode temp = concreteFactory.createCode("giveaway","halo",new MerchItem("test"),data);
        assert(temp.getCode().equals("halo"));
    }
}
