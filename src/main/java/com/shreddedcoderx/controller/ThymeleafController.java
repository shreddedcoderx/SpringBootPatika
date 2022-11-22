package com.shreddedcoderx.controller;

import com.shreddedcoderx.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    // option : root {}
    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }

    // http://127.0.0.1:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody
    public String getThymeleaf1Model() {
        return "thymeleaf1";
    }

    // http://127.0.0.1:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getTyhmeleaf2Model(Model model) {
        model.addAttribute("key_value1", "Ben modelden geldim.1");
        model.addAttribute("key_value2", "Ben modelden geldim.2");
        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf3")
    public String getTyhmeleaf3Model(Model model) {
        model.addAttribute("key_value1", "Ben modelden geldim.1");
        model.addAttribute("key_value2", "Ben modelden geldim.2");
        model.addAttribute("key_value3", "Ben modelden geldim.3");
        return "thymeleaf_file/thymeleaf3";
    }

    // model object olarak göndermek.
    @GetMapping("/thymeleaf5")
    public String getTyhmeleaf5ModelObject(Model model) {
        model.addAttribute("key_model1", "text");
        ProductDto productDto = ProductDto.builder()
                .productId(1L).productName("Magic Keyboard Apple").productPrice(2000.0).build();

        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }

    // model object List olarak göndermek.
    @GetMapping("/thymeleaf6")
    public String getTyhmeleaf6ModelObjectList(Model model) {
        model.addAttribute("key_model1", "text");
        ProductDto productDto = ProductDto.builder()
                .productId(1L)
                .productName("Magic Keyboard Apple")
                .productPrice(2000.0).build();


        ProductDto productDto2 = ProductDto.builder()
                .productId(2L)
                .productName("Magic Mouse Apple")
                .productPrice(1500.0).build();

        ProductDto productDto3 = ProductDto.builder()
                .productId(3L)
                .productName("Macbook Apple")
                .productPrice(25000.0).build();

        ProductDto productDto4 = ProductDto.builder()
                .productId(4L)
                .productName("Magic TrackPad Apple")
                .productPrice(4000.0).build();

        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.add(productDto);
        productDtoList.add(productDto2);
        productDtoList.add(productDto3);
        productDtoList.add(productDto4);


        model.addAttribute("key_model2", productDtoList);
        return "thymeleaf6";
    }

    // http://127.0.0.1:8080/thymeleaf7
    // @PathVariable
    @GetMapping({"/thymeleaf7/{id}", "/thymeleaf7/"})
    public String getTyhmeleaf7ModelObject(Model model, @PathVariable(name = "id", required = false) Long id) {

        if (id != null) {
            model.addAttribute("key_model1", "id : " + id);
        } else {
            model.addAttribute("key_model1", "id bulunamadı.");
        }
        return "thymeleaf7";
    }
    
    @GetMapping({"/thymeleaf8"})
    public String getTyhmeleaf8ModelObjectRequestParam(Model model,
                                                       @RequestParam(name = "id") Long id,
                                                       @RequestParam(name="name") String name){
        if ((id != null) && (name != null)){
            model.addAttribute("key_model1", String.format("id : %s and name : %s", id, name));
        } else {
            model.addAttribute("key_model1", "id ve name'i doldurunuz.");
        }
        return "thymeleaf8";
    }

    @GetMapping({"/thymeleaf81/{id}","/thymeleaf81" })
    public String getThymeleaf81ModelObjectRequestParamAndPathVariable(Model model,
                                                                       @PathVariable(name = "id", required = false) Long id,
                                                                       @RequestParam(name = "name", required = false) String name){
        if ((id != null) && (name != null)){
            model.addAttribute("key_model1", String.format("id : %d and name : %s", id, name));
        } else {
            model.addAttribute("key_model1", "id ve name'i doldurunuz. 🏁");
        }
        return "thymeleaf9";
    }




}
