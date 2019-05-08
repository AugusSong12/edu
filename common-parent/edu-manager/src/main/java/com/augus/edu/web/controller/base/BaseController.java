package com.augus.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseController<T> {
    //===============页面 ================
    protected static  String EDIT_PAGE;//添加编辑页面
    protected static  String INFO_PAGE;//列表界面
    protected static  String MANAGE_PAGE;//管理界面


    public static final String MANAGE="manage";
    public static final String INFO="info";
    public static final String EDIT="edit";

    public BaseController(){
        try {
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            //1.获取泛型真实类型
            Type[] types = pt.getActualTypeArguments();
            //2.把type类型赋值给Class类型
            Class<T> clz = (Class<T>) types[0];
            //3.定义页面的静态变量
            String modelName = clz.getSimpleName().toLowerCase();
            EDIT_PAGE = modelName + "/"+EDIT;
            INFO_PAGE = modelName + "/"+INFO;
            MANAGE_PAGE = modelName + "/"+MANAGE;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
