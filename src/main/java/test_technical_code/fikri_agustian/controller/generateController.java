package test_technical_code.fikri_agustian.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test_technical_code.fikri_agustian.service.generateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("generate")
public class generateController {
    @Autowired
    private generateService gs;
    @GetMapping("segitiga/{angka}")
    public Object segitiga(@PathVariable String angka){
        return gs.segitiga(angka);
    }
    @GetMapping("ganjil/{angka}")
    public Object ganjil(@PathVariable String angka){
        return gs.ganjil(angka);
    }
    @GetMapping("prima/{angka}")
    public Object prima(@PathVariable String angka){
        return gs.prima(angka);
    }
}
