package com.klu.ifm.strategy;

import com.klu.ifm.strategy.ForecastProvider;
	import com.klu.ifm.strategy.DemandForecasting;

	public class Main {
	    public static void main(String[] args) {
	        ForecastProvider fp = new DemandForecasting();

	        fp.basic();   
	    }
	}

