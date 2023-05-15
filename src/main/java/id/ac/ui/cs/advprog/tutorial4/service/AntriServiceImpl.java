package id.ac.ui.cs.advprog.tutorial4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import id.ac.ui.cs.advprog.tutorial4.repository.TiketRepository;
import id.ac.ui.cs.advprog.tutorial4.repository.AntrianRepository;
@Service
@RequiredArgsConstructor
public class AntriServiceImpl implements AntriService {

    private final AntrianRepository antrianRepository;
    private final TiketRepository tiketRepository;

    @Override
    public Integer newTiket(){
        Byte curr = antrianRepository.getAntrian();
        Integer id = tiketRepository.newTiket(curr);
        antrianRepository.addAntrian();  
        return id;  
    }

    @Override
    public Boolean cekTiket(Integer id){
        return tiketRepository.getTiket(id) == (byte)1;
    }
    
    @Override
    public Byte nomorAntrian(Integer id){
        
        return tiketRepository.getTiket(id);
    }
    public Byte getAntrian(){
        return antrianRepository.getAntrian();
    }

}
