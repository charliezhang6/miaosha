package com.imooc.miaosha.redis;

public class MiaoshaKey extends BasePrefix{

    public MiaoshaKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public MiaoshaKey(String prefix) {
        super(prefix);
    }
    public static MiaoshaKey isGoodsOver = new MiaoshaKey("go");
    public static MiaoshaKey getMiaoshaVerifyCode=new MiaoshaKey(300,"vc");
    public static MiaoshaKey getMiaoshaPath=new MiaoshaKey(60,"mp");

}
