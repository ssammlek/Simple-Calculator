package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping("/squ")
    public double getSqr(double n)
    {
        return (n*n);
    }
    @GetMapping("/inv")
    public String getInv(double n)
    {
        if(n==0)
            return "E";
        else
            return (1/n)+"";
    }
    @GetMapping("/root")
    public String getRoot(double n)
    {
        if (n<0)
            return "E";
        else
            return (java.lang.Math.sqrt(n))+"";
    }
    @GetMapping("/per")
    public double getPer(double n)
    {
        return (n/100);
    }
    @GetMapping("/plus")
    public double getAdd(double n,double m)
    {
        return (n+m);
    }
    @GetMapping("/min")
    public double getSub(double n,double m)
    {
        return (n-m);
    }
    @GetMapping("/tim")
    public double getPro(double n,double m)
    {
        return (n*m);
    }
    @GetMapping("/div")
    public String getDiv(double n,double m)
    {
        if(m==0)
            return "E";
        else
            return (n/m)+"";
    }


}
