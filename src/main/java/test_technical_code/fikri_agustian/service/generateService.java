package test_technical_code.fikri_agustian.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import test_technical_code.fikri_agustian.dto.responseDto;

@Service
public class generateService {
    public Object segitiga(String angka){
        try {
            Integer.parseInt(angka);
            List<Object> result= new ArrayList<>();
            String n0="0";
            for (int i = 0; i < angka.length(); i++) {
                result.add(angka.substring(i, i+1)+n0);
                n0+="0";
            }
            return new ResponseEntity<Object>(new responseDto("Succeed", result),HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
            return new ResponseEntity<Object>(new responseDto("Is Not Numeric", null),HttpStatus.BAD_REQUEST);
        }
    }
    public Object ganjil(String angka){
        try {
            int intAngka = Integer.parseInt(angka);
            List<Object> result= new ArrayList<>();
            for (int i = 0; i < intAngka; i++) if(i%2==1) result.add(i);
            return new ResponseEntity<Object>(new responseDto("Succeed", result),HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
            return new ResponseEntity<Object>(new responseDto("Is Not Numeric", null),HttpStatus.BAD_REQUEST);
        }
    }
    public Object prima(String angka){
        try {
            int intAngka = Integer.parseInt(angka);
            Boolean isPrima=true;
            if(intAngka==1) isPrima=false;
            else if(intAngka!=2){
                for (int i = intAngka-1; i >=2; i--) {
                    if(intAngka%i==0) {
                        isPrima=false;
                        break;
                    }
                }
            }
            return new ResponseEntity<Object>(new responseDto("Succeed", isPrima),HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
            return new ResponseEntity<Object>(new responseDto("Is Not Numeric", null),HttpStatus.BAD_REQUEST);
        }
    }
}
