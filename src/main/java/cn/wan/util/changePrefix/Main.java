package cn.wan.util.changePrefix;

import cn.wan.util.JavaHTMLCoder.JavaHTMLDecoder;

/**
 * Created by wanzhenghang on 2017/7/27.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(JavaHTMLDecoder.decode(
                "{&quot;Id&quot;:18003916,&quot;Name&quot;:&quot;美国洛杉矶+拉斯维加斯+旧金山13日半自助游(3钻)&middot;黄石+羚羊彩穴+纳帕+深度+主题自选+含必付&quot;,&quot;PackageName&quot;:&quot;&quot;,&quot;Level&quot;:3,&quot;Bu&quot;:&quot;GT&quot;,&quot;Url&quot;:&quot;//vacations.ctrip.com/grouptravel/p18003916s475.html?kwd=%e7%be%8e%e5%9b%bd&quot;,&quot;DepartureId&quot;:7,&quot;Count&quot;:0,&quot;SaleMode&quot;:&quot;P&quot;,&quot;SoldOut&quot;:false,&quot;BrandName&quot;:&quot;供应商：达美国旅&quot;,&quot;Schedule&quot;:&quot;&lt;em class='date'&gt;国庆&lt;/em&quot;,&quot;Festival&quot;:&quot;国庆&quot;,&quot;IsCircleLine&quot;:false,&quot;CssName&quot;:&quot;sr_semibuffet&quot;,&quot;TypeName&quot;:&quot;半自助游&quot;,&quot;IsFirst&quot;:false,&quot;Type&quot;:2048}"
        ));
    }
}
