package id.ac.ui.cs.advprog.tutorial4.repository;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Random;
@Repository
public class TiketRepository {
    private final Map<Integer, Byte> tiket = new HashMap<>();

    public Integer newTiket(Byte urut) {
        Random rand = new Random();
   
        // Generate random integers in range 0 to 999
        int id = rand.nextInt(1000);
        tiket.put(id,urut);
        return id;
    }

    public Byte getTiket(Integer id) {
        return tiket.get(id);
    }

}
