package cn.wan.common;

import java.util.Scanner;

/**
 * Created by wanzhenghang on 2017/7/27.
 */
public class In {

    public static Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        scanner.reset();
        return scanner.nextLine();
    }

    public static void close(){
        scanner.close();
    }
}
