package id.ac.ui.cs.advprog.tutorial4.service;

import id.ac.ui.cs.advprog.tutorial4.core.code.RedeemCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CreateCodeServiceImpl implements CreateCodeService {

    @Override
    public RedeemCode createCode(String itemType, String codeType, String code, String itemName, Map<String, String> data) {

        //TODO

        return null;
    }
}
