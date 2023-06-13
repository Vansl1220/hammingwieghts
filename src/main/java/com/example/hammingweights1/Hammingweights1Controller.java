package com.example.hammingweights1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hammingweights1Controller {

    @RequestMapping("/")
    public class defaultwebseite {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {

            int ones = 0;

            while(n != 0)
            {
                ones += n & 1;
                n >>>= 1;
            }
            return ones;
        }
    }

}
