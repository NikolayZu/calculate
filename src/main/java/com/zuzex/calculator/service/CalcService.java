package com.zuzex.calculator.service;

import com.zuzex.calculator.entity.Cargo;
import org.springframework.web.client.RestTemplate;

public class CalcService {

    public static double parseJson(Cargo cargo){
        final String uri = String.format("https://router.project-osrm.org/table/v1/foot/%s;%s",
                cargo.getDownloadAddress(), cargo.getShippingAddress()) ;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);

        return -1;
    }
}
