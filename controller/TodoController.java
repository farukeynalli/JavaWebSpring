package com.example.deneme2.controller;

import com.example.deneme2.model.Product;
import com.example.deneme2.repository.ProductRepository;
import com.example.deneme2.resource.ProductRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Timer;


@RestController
public class TodoController {

    private final ProductRepository productRepository;

    public TodoController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts(){

        return ResponseEntity.ok(this.productRepository.findAll());

    }
    @PostMapping ("/product")
    public ResponseEntity<Product> createProduct(ProductRequest productRequest){
        Product product = new Product();
        product.setGelenMetin(List.of(productRequest.getGelenMetin()));
        product.setBirlesen_metin(productRequest.getBirlesen_metin());
        product.setSaniye(productRequest.getSaniye());
        return ResponseEntity.status(201).body(this.productRepository.save(product));

    }

    double time;

    @RequestMapping(value="/eynalli", method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestParam(value="array[]") String[] array) {

        double startTime = System.nanoTime();
        String[] cumleArray=new String[] {""};
        String[] ilkMetin=new String[] {""};
        String returnDeger="";
        int sayac=0;
        int karsilasma =0;
        int karsilasmadi =0;
        String str ="";
        String result="";
        String metin1 ="";
        metin1=array[0];
        ilkMetin =metin1.split(" ");

        for(int i=1;i<array.length;i++){
            sayac=0;
            karsilasma=0;
            karsilasmadi=0;
            str=array[i];
            cumleArray =str.split(" ");



            System.out.println("cumlearray--"+str);
            System.out.println("ilkmetin--"+result);

            for (String a: cumleArray){
                for (String b: ilkMetin){

                    if(karsilasma==0){
                        if (a.contains(b)==true){
                            karsilasma=1;
                            karsilasmadi=1;
                            System.out.println("cumlearray a sı- "+a);
                            System.out.println("ilkmetin b sı- "+b);
                            System.out.println(result+"  if");

                        }
                        else{
                            result+=" "+b;
                            System.out.println(result+"  else");
                        }
                    }
                    else{
                        if (sayac==0){
                            result+=" "+str;
                            result=result.trim();
                            sayac++;
                        }


                    }

                }
            }

            for (int j = 0; j < ilkMetin.length; j++) {
                ilkMetin[j]="";

            }
            ilkMetin=result.split(" ");
            returnDeger=result;
            result="";

            System.out.print("ilkmetin son hali --");
            for (int j = 0; j < ilkMetin.length; j++) {
                System.out.println(ilkMetin[j]);

            }


            if (karsilasmadi==0){
                result=metin1 +" "+str;
                result=result.trim();
                returnDeger=result;

            }
        }

        double endTime = System.nanoTime();
        time= (endTime-startTime)/10000000;
        System.out.println(time);



        return new ResponseEntity<String>(returnDeger, HttpStatus.OK);
    }

    @RequestMapping(value="/timer", method = RequestMethod.POST)
    public ResponseEntity<String> timePost(@RequestParam(value="array[]") String[] array) {

        return new ResponseEntity<String>(String.valueOf(time), HttpStatus.OK);
    }




}

