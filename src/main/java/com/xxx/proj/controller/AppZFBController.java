package com.xxx.proj.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/*import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeWapPayRequest;*/
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.service.IAppIndexService;
import com.xxx.proj.service.IUsersService;
import com.xxx.proj.service.impl.AppIndexServiceImpl;
import com.xxx.proj.util.EmpUtil;
import com.xxx.proj.util.UserUtil;

@RestController
@RequestMapping("/appZFB")
public class AppZFBController {
	
	@Autowired
	IAppIndexService  service;
	@Autowired
	IUsersService  userservice;
    /**
     *	支付宝分配给开发者的应用ID
     */
    private static final String APP_ID = "2016092400588100";
    /**
     *请求使用的编码格式，如UTF-8，GBK，GB2312等
     */
    private static final String CHARSET = "UTF-8";
    /**
     * 支付宝公钥
     */
    private static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvq98dDIyXWQy4pQeOcYbSVPajYB32ZNyI45zLiDgbkA8gZLzao/XSQETsnYb4ez6bEeZoAJqLfhNDmUCEj75fgZwXmlsa44RnEAfqmS2b1aNFDxDeVHdzj/IhrWFeYDeLEYW6Qg91IH+6RdxITQdNAiWOrO45BFsFv8YSHBYOvST3WOFNbBdAz9zlKnC6zXulVHteaNZGl+iN0jV+/aey86XeVHPJIwid99KwbdkKh25W3zM2TnVX1OrhqG1DgAINLYjCqQhkrXzh45NI6/DUYaT7RCbXh21QIgiFQ58yWX3bUoAVV/ArQFUlTiWAP8x2ylrmqUTzHcu3va8oJlvbwIDAQAB";
    /**
     * 开发者申请的密钥
     */
    private static final String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCajmeVVXfj4LrW4Y0NzLoffS5dbKsis9h+sv0HuL9Lh6NJf7c6ukJjrN6DBobhuDvZX453nhMbmI2qiyB0t6/zqtT4p9ZVDg29x/36LJjQIlABq9M4NYwdeFU3R8Se4HdmZ9exMvq1R52C735VBoKYNB2oXE8ERPT8i73jxISt21f/teOeFeuTH2k393B7BDS5wLtEK/qipBzI+v+ZLLkNo+YiWt7Y4Xw6NkVD0/4A77ylaVYJVT0r2270Rf9srZ7Tg3GBaeJSbXSFip3hJEP2/71UMitD7oL+Pji7I1py5sFh0HjM7fBu5qkpnjzxf7mUuMv84t3c4P+Mj+OWtcpRAgMBAAECggEAST1SOKHXvlSwNUOM5A0v5dwcLIliT3+KCAAph480l0YfSqUK3vmEnFc+2jgtkqkLM2bkzCpMQ7d26mojZyvkZUN+yJZAKu4N9PDgmbyobXjVEPWrkedODmkHeLq5odAcxJpQy9esllrpeTKkWwZKvHV12GJlz1AeB87wnQ5zES8wo07hujaUocaP366bjWKv+2brmAa/Yjex8M/StcrE3+/iAxFtVi1ETHc+TvEGUOcjLYx6e0HkWEqLFrfeP4TqCQgH2TKD4n5D8Jor7QM31bn3Su6g2relqZQDtid+V7DNpL51UIl5/TKpHc0gtTuC8+A/ElRM5qMWX33Leg78QQKBgQDsPjNh7k10F+EkZRlj2jtOv2GTp4vpgkWwU78w16vcXUULR2dCi79SM5gRsdeXyYltLTWKnfoMMqI6IKeW5TtNYNkQ/YpJ+qMKZzgZoSbUfCh2UMfdw+OM7f3N214Bv4YFEqcMJUBv2fM1vwAysZRMi9VoJYhI9HRVZJZHaSmZ0wKBgQCne1kNJvGgTHYtS7EdJb7Ds8DUAHKA5Vr10WkmJzZBf0SXstQV14gHhapg48OC0iDm+THAA1MEcUDUAibf1FAUZkAym2V9ABDKijl8aMBUgBoJ6FQuCHrNKtBVKQKBubc2QzEfgdXGKkdpyN4mt/it7haKEX1oPRkz1DCmZpHwywKBgQC6mxtNNMYbeK1PaUhX9k64kjWKQ2Mh7NQNRumTtBg9tbLPCPTIvMhALx7kgzzP2dLi2T4co1KbBffcwGSArctdAK4VXKA6dW8JzaSjogag+v2fD4oAYzY/4NGFJM0pxlYfda9byaUPdPJGtvt6D4kbuay1Wkg/kFDADvchqzDAHwKBgA/XfAHheCN4eAkqyrL+GgA65XdoH2yPxT3RNAf214v0dNGAic0TGPvVKduGT7z1EUWntov6BIU8DSzAk1rCo1x6m4Ht7viW4/+0eWGKKv8TKuNbBXNhO/RiI1iay3Dn1yubyW64gjb/UsfvxwuUhUI2bg1bQCh29wZPANcMhqtnAoGASFrTbgzThfdSO0N/BAvxZ5dPsLRY++zu0HTEZUrkDEaw7uzk8bksywkgmed5lKmJem/L7ZoPS6YU0TBmWmvkSKZSNLjh4mnoBbUb69rioomn/Otldr+IGVnbKoYpz4yGScFaOUKa7SPVlGZYvb5DLKDMpK70xhZvOooVZcaYZH8=";

    /**
     * 生成支付信息
     * @param httpResponse
     * @param httpRequest
     * @param map   订单信息
     * @throws AlipayApiException
     * @throws IOException
     */
/*
    @RequestMapping("/paymentOrder")
    public void payment(HttpServletResponse httpResponse, HttpServletRequest httpRequest, @RequestParam Map<String, String> map) throws AlipayApiException, IOException {
        */
/**
         * 订单编号
         * 
         *//*

        String out_trade_no = map.get("ordernum");
        */
/**
         * 订单总金额  
         *//*

        String total_amount = map.get("money");
        */
/**
         * 订单标题
         *//*

        String subject = map.get("title");
        //实例化客户端 此处地址-》https://openapi.alipaydev.com/gateway.do为沙箱环境如需要正式化境请使用https://openapi.alipay.com/gateway.do
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
        
        AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();//创建API对应的request
        alipayRequest.setReturnUrl("http://192.168.1.133/sports/appZFB/updateState");
        alipayRequest.setNotifyUrl("页面跳转异步通知页面路径");//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                "    \"out_trade_no\":\"" + out_trade_no + "\"," +
                "    \"total_amount\":" + total_amount + "," +
                "    \"subject\":\"" + subject + "\"," +
                "    \"product_code\":\"QUICK_WAP_WAY\"" +
                "  }");//填充业务参数
        String form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        httpResponse.setContentType("text/html;charset=utf-8");
        httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面 
        httpResponse.getWriter().flush();
    }
*/
    /**
     * 支付成功后修改订单状态
     * @param out_trade_no
     * @param resp
     * @throws IOException
     */
    @RequestMapping("/updateState")
    public void updateState(String out_trade_no,HttpServletResponse resp) throws IOException{
    	System.out.println("--------------------------------------");
    	service.updateState(out_trade_no);
    	resp.sendRedirect("http://192.168.1.132:8020/yundong/pay-ok.html");
    }
    /**
     * App图片上传到本地文件夹
     */
    @Value(value = "${spring.http.multipart.location}") 
	String rootPath; 
    @RequestMapping("/editAppUser")
	public String editAppUser(HttpServletRequest request) throws Exception{
    	String requestURI = request.getRequestURI(); 
		Part part = request.getPart("file");
		System.out.println(part);
		String urlPath = UUID.randomUUID()+part.getContentType().replace("image/", ".");
		String videopicture = "/"+requestURI.split("/")[1]+"/"+urlPath;
		IOUtils.copy(part.getInputStream(), new FileOutputStream(rootPath+urlPath));
		UserPeople user =UserUtil.getUserPeople();
		return videopicture;
	}
    /**
     * App用户信息修改
     * @param map
     * @return
     */
    @RequestMapping("/updateAppUser")
    public Result updateAppUser(@RequestParam Map<String, String> map){
    	String head = map.get("head");
    	System.out.println(head);
    	String name = map.get("name");
    	UserPeople user = UserUtil.getUserPeople();
    	if(head!=null){
    		user.setHead(head);
    	}
    	if(name!=null){
	    	user.setName(name);
    	}
    	Result result = userservice.editUser(user);
    	Integer id = user.getId();
		UserPeople userPeople = userservice.getUserByID(id);
		UserUtil.setUserPeople(userPeople);
    	return result;
    	
    }
    /**
     * App获取登录用户
     * @return
     */
    @RequestMapping("/getAppUser")
    public UserPeople getAppUser(){
    	UserPeople user = UserUtil.getUserPeople();
    	return user;
    }
   
   /* @RequestMapping("/getTicketOrder")
    public UserPeople getTicketOrder(){
    	UserPeople user = UserUtil.getUserPeople();
    	return user;
    }*/

}

