package com.cmh.kafka;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentUtilsTest{

    public static void main(String[] args) {
        System.out.println(System.getProperty("APP_NAME"));
        System.out.println(System.getProperty("env"));
        System.out.println(System.getProperty("config.dir"));
        System.out.println(System.getProperty("user.home"));
        try {
            System.out.println(System.getProperty(InetAddress.getLocalHost().getHostName()));
            System.out.println(System.getProperty(InetAddress.getLocalHost().getHostAddress()));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMap(){
        Map<String,String> secretsMap = new HashMap<>();
        secretsMap.put("vault.druid.username","mysql_dzj_account");
        secretsMap.put("vault.druid.password","mysql_dzj_pass");
        String[] strings = secretsMap.values().toArray(new String[0]);
        for(String s :strings){
            System.out.println(s);
        }
        String[] sarray = new String[0];
        System.out.println(sarray.length);
        String[] split = "pCcgzcuMrw89bpWciJZNyN86ChKgK7ZSEkncCET5Ez0C".split(",");
        for(String s:split){
            System.out.println(s);
        }
    }

    @Test
    public void testMapContains(){
        Map<String,String> strMap = new HashMap<>();
        strMap.put("ab","dfafda");
        strMap.put("bc","bcbcbc");
        System.out.println(strMap.get("fdaf"));
    }
}
