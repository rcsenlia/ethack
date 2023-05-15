package id.ac.ui.cs.advprog.tutorial4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import id.ac.ui.cs.advprog.tutorial4.service.AntriService;
@Controller
@RequestMapping("/antri")
@RequiredArgsConstructor
public class TiketController {
    private final AntriService antriService;
    
    @GetMapping({"", "/"})
    public String getCreatePage(Model model) {

        model.addAttribute("antrian",antriService.getAntrian());
        return "create";
    }

    @GetMapping( {"/get"})
    public String createCode(Model model) {
        Integer tiket = antriService.newTiket();
        model.addAttribute("antrian",antriService.getAntrian());
        model.addAttribute("tiket",tiket);
        return "create2";
    }
    @GetMapping({"/cek"})
    public String cekCode(@RequestParam Integer id,Model model){
        Boolean cek = antriService.cekTiket(id);
        Byte urut = antriService.nomorAntrian(id);
        model.addAttribute("cek",cek);
        model.addAttribute("urut",urut);
        File file = new File("./flag.txt");
        try{
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext())
            {
            // Read the next name.
                String flag = inputFile.nextLine();
  
            // Display the last name read.
                System.out.println(flag);
                model.addAttribute("flag", flag);
            }
  
            // Close the file.
            inputFile.close();
            
        }
        catch(FileNotFoundException e){
            model.addAttribute("flag", "file not found");

        }
        
        return "cek";
      // Read lines from the file until no more are left.
      
    }
}
