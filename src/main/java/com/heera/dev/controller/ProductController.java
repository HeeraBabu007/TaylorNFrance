/**
 * 
 */
package com.heera.dev.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.heera.dev.model.Product;
import com.heera.dev.model.ProductActualResponse;
import com.heera.dev.service.ProductService;

/**
 * @author dell
 *
 */
//creating RestController
@RestController
public class ProductController {

	//autowired the ProductService class
	@Autowired
	ProductService productService;
	
	//creating a get mapping that retrieves all the Product detail from the database 
	@GetMapping("/product")
	private List<Product> getAllProductService() 
	{
		return productService.getAllProduct();
	}

	
	@GetMapping("/product/All")
	public ProductActualResponse convertCurrency()  
	{  	
//		ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://data.fixer.io/api/latest?access_key=816452ebe48074135e359c3fc61b2805", CurrencyConversionBean.class);  
//		CurrencyConversionBean response=responseEntity.getBody();
//		CurrencyConversionBean response=new CurrencyConversionBean();

		ProductActualResponse myres=new ProductActualResponse();
		List<Product> productList=new ArrayList<>();
		
		List<Product> listOfProduct=productService.getAllProduct();
		
		for(Product product:listOfProduct) {
			Map<String, Double> rate=new HashMap<String, Double>();			
			rate.put("AED", 4.463606*product.getPrice());
			rate.put("AFN", 94.784869*product.getPrice());
			rate.put("ALL", 123.459371*product.getPrice());
			rate.put("AMD", 638.115028*product.getPrice());
			rate.put("ANG", 2.174371*product.getPrice());
			rate.put("AOA", 792.007245*product.getPrice());
			rate.put("ARS", 108.688737*product.getPrice());
			rate.put("AUD", 1.538709*product.getPrice());
			rate.put("AWG", 2.187453*product.getPrice());
			rate.put("AZN", 2.054827*product.getPrice());
			rate.put("BAM", 1.951817*product.getPrice());
			rate.put("BBD", 2.445783*product.getPrice());
			rate.put("BDT", 102.714915*product.getPrice());
			rate.put("BGN", 1.952885*product.getPrice());
			rate.put("BHD", 0.458208*product.getPrice());
			rate.put("BIF", 2354.980319*product.getPrice());
			rate.put("BMD", 1.215251*product.getPrice());
			rate.put("BND", 1.60247*product.getPrice());
			rate.put("BOB", 8.363305*product.getPrice());
			rate.put("BRL", 6.643198*product.getPrice());
			rate.put("BSD", 1.211364*product.getPrice());
			rate.put("BTC", 0.000025364598*product.getPrice());
			rate.put("BTN", 87.594703*product.getPrice());
			rate.put("BWP", 13.22408*product.getPrice());
			rate.put("BYN", 3.148641*product.getPrice());
			rate.put("BYR", 23818.927541*product.getPrice());
			rate.put("BZD", 2.441701*product.getPrice());
			rate.put("CAD", 1.53324*product.getPrice());
			rate.put("CDF", 2404.303371*product.getPrice());
			rate.put("CHF", 1.093769*product.getPrice());
			rate.put("CLF", 0.031138*product.getPrice());
			rate.put("CLP", 859.182656*product.getPrice());
			rate.put("CNY", 7.854532*product.getPrice());
			rate.put("COP", 4367.005924*product.getPrice());
			rate.put("CRC", 741.471778*product.getPrice());
			rate.put("CUC", 1.215251*product.getPrice());
			rate.put("CUP", 32.204162*product.getPrice());
			rate.put("CVE", 110.038757*product.getPrice());
			rate.put("CZK", 25.888484*product.getPrice());
			rate.put("DJF", 215.654114*product.getPrice());
			rate.put("DKK", 7.436548*product.getPrice());
			rate.put("DOP", 70.170944*product.getPrice());
			rate.put("DZD", 161.576846*product.getPrice());
			rate.put("EGP", 19.052103*product.getPrice());
			rate.put("ERN", 18.228759*product.getPrice());
			rate.put("ETB", 48.79849*product.getPrice());
			rate.put("EUR", (double) 1*product.getPrice());
			rate.put("FJD", 2.460095*product.getPrice());
			rate.put("FKP", 0.86295*product.getPrice());
			rate.put("GBP", 0.862944*product.getPrice());
			rate.put("GEL", 4.028486*product.getPrice());
			rate.put("GGP", 0.86295*product.getPrice());
			rate.put("GHS", 6.988531*product.getPrice());
			rate.put("GIP", 0.86295*product.getPrice());
			rate.put("GMD", 62.282378*product.getPrice());
			rate.put("GNF", 12288.797866*product.getPrice());
			rate.put("GTQ", 9.365544*product.getPrice());
			rate.put("GYD", 253.169476*product.getPrice());
			rate.put("HKD", 9.422233*product.getPrice());
			rate.put("HNL", 29.190227*product.getPrice());
			rate.put("HRK", 7.572843*product.getPrice());
			rate.put("HTG", 91.178912*product.getPrice());
			rate.put("HUF", 359.28787*product.getPrice());
			rate.put("IDR", 17162.995595*product.getPrice());
			rate.put("ILS", 3.964332*product.getPrice());
			rate.put("IMP", 0.86295*product.getPrice());
			rate.put("INR", 88.093392*product.getPrice());
			rate.put("IQD", 1776.089929*product.getPrice());
			rate.put("IRR", 51168.160256*product.getPrice());
			rate.put("ISK", 155.394102*product.getPrice());
			rate.put("JEP", 0.86295*product.getPrice());
			rate.put("JMD", 182.91025*product.getPrice());
			rate.put("JOD", 0.861564*product.getPrice());
			rate.put("JPY", 127.889395*product.getPrice());
			rate.put("KES", 133.321184*product.getPrice());
			rate.put("KGS", 102.866415*product.getPrice());
			rate.put("KHR", 4946.07331*product.getPrice());
			rate.put("KMF", 492.723378*product.getPrice());
			rate.put("KPW", 1093.730311*product.getPrice());
			rate.put("KRW", 1352.702457*product.getPrice());
			rate.put("KWD", 0.367625*product.getPrice());
			rate.put("KYD", 1.009325*product.getPrice());
			rate.put("KZT", 504.931844*product.getPrice());
			rate.put("LAK", 11362.600109*product.getPrice());
			rate.put("LBP", 1831.774985*product.getPrice());
			rate.put("LKR", 234.365238*product.getPrice());
			rate.put("LRD", 210.51192*product.getPrice());
			rate.put("LSL", 17.900761*product.getPrice());
			rate.put("LTL", 3.588321*product.getPrice());
			rate.put("LVL", 0.735093*product.getPrice());
			rate.put("LYD", 5.402603*product.getPrice());
			rate.put("MAD", 10.797516*product.getPrice());
			rate.put("MDL", 21.256396*product.getPrice());
			rate.put("MGA", 4566.1491*product.getPrice());
			rate.put("MKD", 61.488578*product.getPrice());
			rate.put("MMK", 1708.00227*product.getPrice());
			rate.put("MNT", 3463.010136*product.getPrice());
			rate.put("MOP", 9.672713*product.getPrice());
			rate.put("MRO", 433.844543*product.getPrice());
			rate.put("MUR", 48.610856*product.getPrice());
			rate.put("MVR", 18.711491*product.getPrice());
			rate.put("MWK", 943.215499*product.getPrice());
			rate.put("MXN", 25.179405*product.getPrice());
			rate.put("MYR", 4.913872*product.getPrice());
			rate.put("MZN", 91.192243*product.getPrice());
			rate.put("NAD", 17.900929*product.getPrice());
			rate.put("NGN", 463.31433*product.getPrice());
			rate.put("NIO", 42.274431*product.getPrice());
			rate.put("NOK", 10.338749*product.getPrice());
			rate.put("NPR", 140.167382*product.getPrice());
			rate.put("NZD", 1.660981*product.getPrice());
			rate.put("OMR", 0.467888*product.getPrice());
			rate.put("PAB", 1.21121*product.getPrice());
			rate.put("PEN", 4.423306*product.getPrice());
			rate.put("PGK", 4.273353*product.getPrice());
			rate.put("PHP", 59.1985*product.getPrice());
			rate.put("PKR", 192.599712*product.getPrice());
			rate.put("PLN", 4.507064*product.getPrice());
			rate.put("PYG", 7990.095348*product.getPrice());
			rate.put("QAR", 4.424728*product.getPrice());
			rate.put("RON", 4.875958*product.getPrice());
			rate.put("RSD", 117.318789*product.getPrice());
			rate.put("RUB", 90.205689*product.getPrice());
			rate.put("RWF", 1203.030175*product.getPrice());
			rate.put("SAR", 4.557655*product.getPrice());
			rate.put("SBD", 9.722633*product.getPrice());
			rate.put("SCR", 25.771454*product.getPrice());
			rate.put("SDG", 67.142709*product.getPrice());
			rate.put("SEK", 10.08802*product.getPrice());
			rate.put("SGD", 1.605687*product.getPrice());
			rate.put("SHP", 0.86295*product.getPrice());
			rate.put("SLL", 12407.717561*product.getPrice());
			rate.put("SOS", 709.706777*product.getPrice());
			rate.put("SRD", 17.200705*product.getPrice());
			rate.put("STD", 24647.891822*product.getPrice());
			rate.put("SVC", 10.59821*product.getPrice());
			rate.put("SYP", 623.151412*product.getPrice());
			rate.put("SZL", 17.973273*product.getPrice());
			rate.put("THB", 36.496426*product.getPrice());
			rate.put("TJS", 13.801524*product.getPrice());
			rate.put("TMT", 4.25338*product.getPrice());
			rate.put("TND", 3.310957*product.getPrice());
			rate.put("TOP", 2.780979*product.getPrice());
			rate.put("TRY", 8.544317*product.getPrice());
			rate.put("TTD", 8.217205*product.getPrice());
			rate.put("TWD", 33.863706*product.getPrice());
			rate.put("TZS", 2818.167988*product.getPrice());
			rate.put("UAH", 33.805051*product.getPrice());
			rate.put("UGX", 4448.65343*product.getPrice());
			rate.put("USD", 1.215251*product.getPrice());
			rate.put("UYU", 51.791122*product.getPrice());
			rate.put("UZS", 12776.840417*product.getPrice());
			rate.put("VEF", 12.137317*product.getPrice());
			rate.put("VND", 27987.23986*product.getPrice());
			rate.put("VUV", 130.141239*product.getPrice());
			rate.put("WST", 3.042143*product.getPrice());
			rate.put("XAF", 654.683677*product.getPrice());
			rate.put("XAG", 0.043532*product.getPrice());
			rate.put("XAU", 0.000672*product.getPrice());
			rate.put("XCD", 3.284278*product.getPrice());
			rate.put("XDR", 0.839567*product.getPrice());
			rate.put("XOF", 654.694431*product.getPrice());
			rate.put("XPF", 119.825364*product.getPrice());
			rate.put("YER", 304.23812*product.getPrice());
			rate.put("ZAR", 17.878057*product.getPrice());
			rate.put("ZMK", 10938.718305*product.getPrice());
			rate.put("ZMW", 26.331728*product.getPrice());
			rate.put("ZWL", 391.311355*product.getPrice());
			product.setRate(rate);
			productList.add(product);
		}
		 myres.setProduct(productList);
		return myres;
	}  

}
