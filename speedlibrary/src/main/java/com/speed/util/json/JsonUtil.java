package com.speed.util.json;

import com.google.gson.Gson;

/**
 * Created by Nick on 2017/7/25
 */
public class JsonUtil {
    private static Gson gson = null;


    private JsonUtil() {
    }

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    /**
     * Object to json string
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        String json = null;
        if (gson != null) {
            json = gson.toJson(object);
        }
        return json;
    }


    /**
     * json to Object
     * @param gsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T formJson(String gsonString, Class<T> cls) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(gsonString, cls);
        }
        return t;
    }


}
