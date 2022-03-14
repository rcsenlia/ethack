package id.ac.ui.cs.advprog.tutorial4.service;

import id.ac.ui.cs.advprog.tutorial4.core.code.RedeemCode;
import id.ac.ui.cs.advprog.tutorial4.core.item.Item;
import id.ac.ui.cs.advprog.tutorial4.repository.*;
import id.ac.ui.cs.advprog.tutorial4.core.item.ItemType;
import id.ac.ui.cs.advprog.tutorial4.core.item.MembershipItem;
import id.ac.ui.cs.advprog.tutorial4.core.item.MerchItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CreateCodeServiceTest {
    @Mock
    private RedeemCodeRepository redeemCodeRepository;
    @Mock
    private ItemService itemService;
    @Mock
    RedeemCode redeemCode;
    @Mock
    Item item;

    CreateCodeService createCodeService;

    @BeforeEach
    public void setup() {
        createCodeService = new CreateCodeServiceImpl(itemService,redeemCodeRepository);
    }

    @Test
    public void whenCreateCodeShouldCallGetItem() throws Exception {
        when(itemService.getItem("test",ItemType.MERCH)).thenReturn(item);
        Map<String,String> data = new HashMap();
        data.put("amount","10");
        createCodeService.createCode("merch","giveaway","","test",data);
        verify(itemService, times(1)).getItem("test",ItemType.MERCH);
    }

}
