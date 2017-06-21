package cn.wan.util.EditThisCookieUtil;

import java.util.Scanner;

/**
 * Created by 万洪基 on 2017/6/21.
 */
public class Main {

    public static void main(String[] args) {
        String domain = "";
        String cookies = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入domain：\n");
        domain = scanner.nextLine();
        System.out.println("请输入cookies：\n");
        cookies = scanner.nextLine();
        System.out.println(Cookies2Json.getCookiesOfJson(domain,cookies));
    }
}
