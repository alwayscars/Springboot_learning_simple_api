package com.jvlcode.vikcart;


import com.jvlcode.vikcart.controllers.Productcontroller;
import com.jvlcode.vikcart.models.product;
import com.jvlcode.vikcart.reposotories.ProductReposotories;
import com.jvlcode.vikcart.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@Component
public class dataseeder implements CommandLineRunner {
    @Autowired
    private ProductReposotories productRepository;

    @Override
    public void run(String ...args) throws Exception{
        //Check if the table is empty
        if(productRepository.count()==0){
            //seed demo data
            List<product> products = Arrays.asList(
                    new product("OPPO F21s Pro 5G", 245.67, "OPPO F21s Pro 5G is a powerful device with a RAM extension feature, that offers brilliant operational speed to users.", 4.5, "Mobile Phones", "Amazon", 5, 15),
                    new product("WRISTIO HD, Bluetooth Calling Smart Watch", 150.32, "Minix watches are exclusively designed to fulfill the advanced tech needs of today’s generation.", 3.5, "Accessories", "Flipkart", 9, 5),
                    new product("Dell Inspiron 3511 Laptop", 440.57, "Dell Inspiron 3511 11th Generation Intel Core i5-1135G7 Processor (8MB Cache, up to 4.2 GHz);Operating System: Windows 10 Home Single Language, English", 2, "Laptops", "Ebay", 9, 12),
                    new product("Lenovo IdeaPad Slim 3 Laptop", 250.45, "Lenovo IdeaPad Slim 311th Gen Intel Core i5-1135G7 | Speed: 2.4 GHz (Base) - 4.2 GHz (Max) | 4 Cores | 8 Threads | 8 MB Cache", 4, "Laptops", "Ebay", 9, 12),
                    new product("ASUS VivoBook 15 Laptop", 767.32, "ASUS VivoBook 15 15.6-inch (39.62 cm) HD, Dual Core Intel Celeron N4020, Thin and Light Laptop (4GB RAM/256GB SSD/Integrated Graphics/Windows 11 Home/Transparent Silver/1.8 Kg), X515MA-BR011W", 5, "Laptops", "Ebay", 9, 12),
                    new product("PTron Newly Launched Tangent Sports, 60Hrs Playtime", 15.46, "Gigantic 60 + Hours of music playtime on a single charge; BT5.2 Wireless headphones with ENC (Environmental Noise Cancellation) Technology to enhance your voice quality over the voice calls", 5, "Headphones", "Amazon", 4, 20),
                    new product("Campus Men's Maxico Running Shoes", 10.12, "The high raised back cover with extra padding.", 3, "Sports", "Ebay", 6, 9)
            );
            productRepository.saveAll(products);
            System.out.println("Demo data seeded");
        }
    }
}
