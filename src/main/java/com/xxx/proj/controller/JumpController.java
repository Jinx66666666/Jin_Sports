package com.xxx.proj.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeWapPayRequest;*/
import com.xxx.proj.util.EmpUtil;

@Controller
public class JumpController {
	/**
	 * 跳转到主页面
	 * 
	 * @return
	 */
	@RequestMapping("/home")
	public String goToHome() {

		return "home";

	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/emp")
	public String goToEmp() {
		return "emp";

	}

	/*@RequestMapping("/toback")
	public String String (EmpUtil e){
		e.removeEmp();
		return "redirect:/";
	}*/
	/**
	 * 跳转到体育场管理页面
	 * @return
	 */
	@RequestMapping("/sport")
	public String goVenueInformation(){
		return "sport";
	}
	/**
	 * 跳转到场馆管理页面
	 * @return
	 */
	@RequestMapping("/stadium")
	public String goStadium(){
		return "stadium";
	}
	/**
	 * 跳转到场馆票务管理页面
	 * @return
	 */
	@RequestMapping("/stadiumticket")
	public String goStadiumticket(){
		return "stadiumticket"; 
	}

	/**
	 * 跳转到赛事声明
	 * @return
	 */ 
	@RequestMapping("/disclaimer")
	public String godisclaimer() {
		return "disclaimer";
	}

	/**
	 * 跳转到组类别页面
	 * @return
	 */ 
	@RequestMapping("/grouptype")
	public String gogrouptype() {
		return "grouptype";
	}
	/**
	 * 跳转到赛事基本信息页面
	 * @return
	 */ 
	@RequestMapping("/gameinfo")
	public String gogameinfo() {
		return "gameinfo";
	}


	
	 
	/**
	 * 跳转到用户信息管理页面
	 * @return
	 */
	 
	@RequestMapping("/user")
	public String goToUser() {
		return "user";
	}

	/**
	 * 跳转到精彩回顾页面
	 * @return
	 */
	@RequestMapping("/review")
	public String goToReview() {
		return "review";
	}

	/**
	 * 跳转到最新动态页面
	 * @return
	 */
	@RequestMapping("/dynamic")
	public String goToDynamic() {
		return "dynamic";
	}
	/**
	 * 跳转到场馆票务管理页面
	 * @return
	 */
	@RequestMapping("/ticket")
	public String goToTicket() {
		return "ticket";
	}


	
	/**
	 * 跳转到场馆票务订单核销页面
	 * @return
	 */
	@RequestMapping("/orderlook")
	public String goOrderlook(){
		return "orderlook";
	}
	/**
	 * 跳转到票务统计图页面
	 * @return
	 */
	@RequestMapping("/ticketsome")
	public String goTicketsome(){
		return "ticketsome";
	}

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
         * 使用工具类生成
         *//*

        String out_trade_no = "201901160225";
        */
/**
         * 订单总金额  后续可以手动更改
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
        alipayRequest.setReturnUrl("页面跳转同步通知页面路径");
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
	 * 跳转到  开启关闭赛事页面
	 * @return
	 */
	@RequestMapping("/opengame")
	public String goOpenGame(){
		return "opengame";
	} 


}

