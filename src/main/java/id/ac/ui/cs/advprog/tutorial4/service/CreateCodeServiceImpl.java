package id.ac.ui.cs.advprog.tutorial4.service;

import id.ac.ui.cs.advprog.tutorial4.core.code.CodeFactory;
import id.ac.ui.cs.advprog.tutorial4.core.code.RedeemCode;
import id.ac.ui.cs.advprog.tutorial4.core.item.Item;
import id.ac.ui.cs.advprog.tutorial4.core.item.ItemType;
import id.ac.ui.cs.advprog.tutorial4.repository.RedeemCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CreateCodeServiceImpl implements CreateCodeService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private RedeemCodeRepository redeemCodeRepository;

    @Override
    public RedeemCode createCode(String itemType, String codeType, String code, String itemName, Map<String, String> data) {

        //TODO
        //create item

        Item item = null;
        if(itemType.equals("merch"))
        {
            item = itemService.getItem(itemName,ItemType.MERCH);
        }
        else if(itemType.equals("membership"))
        {
            item = itemService.getItem(itemName,ItemType.MEMBERSHIP);
        }
        //create code
        RedeemCode temp = CodeFactory.createCode(codeType,code,item,data);
        return temp;
    }
}
