package com.example.a20201108.bean;

import com.example.a20201108.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone 11 (A2223)", "iphone12 mini", "redmi k30", "Apple iPhone 12 Pro Max (A2412)", "Redmi Note8Pro", "vivo iQOO Z1","OPPO K7","Apple iPhone SE (A2298)"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 11 (A2223) 128GB 黑色 移动联通电信4G手机 双卡双待",
            "Apple iPhone 12 mini (A2400) 64GB 蓝色 手机 支持移动联通电信5G",
            "Redmi K30 王一博同款 120Hz流速屏 前置挖孔双摄 索尼6400万后置四摄 4500mAh超长续航 27W快充 6GB+128GB 紫玉幻境 游戏智能手机 小米 红米",
            "Apple iPhone 12 Pro Max (A2412) 128GB 海蓝色 支持移动联通电信5G 双卡双待手机",
            "Redmi Note8Pro 6400万全场景四摄 液冷游戏芯 4500mAh长续航 NFC 18W快充 红外遥控 6GB+128GB 冰翡翠 游戏智能手机 小米 红米",
            "vivo iQOO Z1 8GB+128GB 星河银 天玑1000Plus旗舰芯片 144Hz竞速屏 44W超快闪充 双模5G全网通手机  iqooz1",
            "OPPO K7 双模5G 骁龙765G OLED屏幕指纹 4800万超清四摄 3200万前摄 8+128GB 秘境 全网通手机",
            " Apple iPhone SE (A2298) 128GB 黑色 移动联通电信4G手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6399, 2099, 2799, 5599, 1999, 1995,1799,5999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone11_s, R.drawable.iphone12mini_s, R.drawable.redmik30_s,
            R.drawable.iphone12promax_s, R.drawable.redminote8pro_s, R.drawable.vivoiqooz1_s, R.drawable.oppok7_s, R.drawable.iphonese_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone11, R.drawable.iphone12mini, R.drawable.redmik30,
            R.drawable.iphone12promax, R.drawable.redminote8pro, R.drawable.vivoiqooz1,
            R.drawable.oppok7,R.drawable.iphonese
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
