package id.ac.ui.cs.advprog.tutorial4.repository;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

@Repository
public class AntrianRepository {
    private byte curr = 2;
    public byte getAntrian() {
        return this.curr;
    }
    public void addAntrian() {
        this.curr = (byte)(this.curr+ (byte)1);
    }
    


}
