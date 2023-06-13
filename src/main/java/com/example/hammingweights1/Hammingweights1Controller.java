package com.example.hammingweights1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hammingweights1Controller {

    @RequestMapping("/api/hamming")
    public class defaultwebseite {

        public int hammingWeight(int n) {

            int cnt = 0;

            while(n != '0')
            {
                cnt += n & 1;
                n >>>= 1;
            }
            return cnt;
        }
    }


}
