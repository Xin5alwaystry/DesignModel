package com.xinwu.gof23.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    //使用单例模式创建享元工厂
    private static class ChessFactorySingleton {
        private static final ChessFactory instance = new ChessFactory();
    }

    private ChessFactory() {
    }

    public static ChessFactory getInstance() {
        return ChessFactorySingleton.instance;
    }

    //key: color value: concreteFlyWeight
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    public ChessFlyWeight factory(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight chessFlyWeight = new ConcreteChessFlyWeight(color);
            map.put(color, chessFlyWeight);
            return chessFlyWeight;
        }
    }
}
