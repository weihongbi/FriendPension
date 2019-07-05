package com.alipay.config;


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class alipay {

    @RequestMapping("pay")
    public void pay(HttpSession session,HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {

        String app_id = "2016092100564602";
        String sign_type = "RSA2";
        String charset = "utf-8";
        String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
        String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC5j/htsjHNKAGcTNW4UO4JWEIVcGxWLVpCzndgspawXGz7S5KgIjvgNU0NKzv7/Q1cgXBE8CpMdLk3hAc9i9f/OSn0bvQzXMyD74+cc5AanJYIh7NjIDgHk5h5kjYk7K8W6HbTPVKcwBryqw648sdLVW+hyckMembfmpyllSdupig70X0ITR2EP60pKCq+fnEPvAojgdbP6rpdPOW6akaV8xQJ/BZ0ulWzWaT/9Culz0HwHCQtQe93fdwibct6et5a9rgN3rD2VunCTQZvCZOzCe0ZOKA3p9llWj3EsRLp0R1LE89SkQjwBWDxsEfCF4fRmOmWSGnPf96TZFtAYri3AgMBAAECggEAUsYH+VbNpEg+P6x+gVOIex6li860ZNSiOL7EvZusYEs6SfZyF4Bt2RutnTw167f7p9INdJL1K1m97Se12xxwY2bqciC0Sd0RVaEdHJroIxbKTk/KE2Oh2q9aCpDQGjSB/eQAbUYjfcyruKfZT2Lsx4v62d6bEjfff8sGKU6ZYl91DnWytVxm//mVRI0TDackTnbyz6v8a+GawquU33Pt58OPYoVzd7qDpViPXTsuA39STKXIZxNPZHadiZ9ymwU5M9BNp8rUnO8BVyA5U/h0AUQ7IDAkky2r0p1a4wABkcUIFENhSPOCbd2EWgjyiJb1ygSBaELsGMPl4zElAVtwYQKBgQDqBH8+c14PP0tzHDvXiEX9O3o4LB8OYCaYt1XagcWYlREpjGQDcP9dbV8frl/LAAbpdiTaM5RxRRt9Iu6odE/CgX2XcHSSsWHzNLXm+5eMsE116WimOmXplncA6n/ONqjjfGGVyCElaJxE2agnnGP9rEeizwGkszFO3KJIArxrqQKBgQDK/kEogUqCil+yyjE+2rV79YFC/s4E+68gb+v8mwvt8v+pdgDTIZd1CxPkYr0Ipu1EP4n+SllaMLhqqQEs2GOAXrSS9kaLRxRT+Iiiilr/M7Pu0frGERBGtZrW/Rb5nrIYn/TZ9vshHPY8BoqiQwGl6gfPlwXcSL1UrsNDrgO9XwKBgEKqkU1LNGqHj4j1bB7UlYu0m/bQqvA/d/9dizm6an4zSTZa5ksMr9L/y2+ND4EXOuDbZVg8BXfXRiN6Bh87M1Wn6g1wXeVEXzEXvRJWbjAIMaj7m3JvhITs9m3uYAZxD9/umSZAYyDzEkGS+BKAvQORRr8c1c0Dt3JN7HUzQlYxAoGBAJrz6PMtdp4dWJ3XIC5Vr1GXf3uPm95L7Uv6g46JIFscMjK+hDSmoMHUmfOtt5TiL534TrMROBHTvQKWTfJYn+O+52KDoifxM0BCKLLCoGHMqt5z5VTKc702JaNVAPO9Qz/u4m57zQli3UfGyo7ATYLEGgBJzUxxLi11VlLUg8BLAoGAcSB5ZerjT/+TnFfC+lyWBmaD6ujuHM1Gb4Q1dzTcEeo/HpIbQPdUXacYTj6MPWqCJHfTVWsQld2kr/MMLsvbhQ7H4kgskKN56ERDVa34GQl1S9keH4DEZ+74EH675I0t8dZr2+hUhpaTpRHOE/UI4lnWuNN+KJetMycNJyRbkHA=";
        String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmZOZgK9+WksD5zkj4QH3yrrHOjH0D8umEWugcZp4uCvhBi489Jgvd2y2/ZAehUuLqp8WfS0ncKIedWdyL9T883G/OEPkWrnLQ2dkc5576NCsqtd54HZQdn9FVbkjR3TxDNm3Ol0aMoVHs2dxFroMdlHkmR2wK70z2WsqcOuYunfuFWXhO7/5EICXoAK2ysp9CuylmQmoQvoVWRWhadQ10n3mvYhdFdUpdNrsdJYeXinLfiMGe6T5dPbPMgroXbw9nNlNtoUJXFusxc/s2/vLsAXhkjcSGIJpGdZ5rSwSCUapGFurc7l8bgmAn7Gtsv1bDlCm0NfZqU6YWwFC9RoNCQIDAQAB";
        int money = (int) session.getAttribute("total");
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "", charset, alipay_public_key, sign_type); // 获得初始化的AlipayClient
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();// 创建API对应的request
        
        // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        alipayRequest.setReturnUrl("http://localhost:8081/house/fangkeorder");
        
        // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        alipayRequest.setNotifyUrl("http://localhost:8081/cust/frontHtml");// 在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" + "    \"out_trade_no\":\"2015032001010100" + (int) (Math.random() * 1000) + "\","
                + "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," + "    \"total_amount\":" + money + ","
                + "    \"subject\":\"支付中..\"," + "    \"body\":\"房屋预订支付\","
                + "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\","
                + "    \"extend_params\":{" + "    \"sys_service_provider_id\":\"2088511833207846\"" + "    }" + "  }");// 填充业务参数
        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + charset);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }    
}
