package id.ac.ui.cs.advprog.tutorial4.service;
import java.util.Map;

public interface AntriService {
    
    Integer newTiket();
    Boolean cekTiket(Integer id);
    Byte getAntrian();
    Byte nomorAntrian(Integer id);
}