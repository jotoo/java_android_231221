package ru.jotoo.Lesson11;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

/**
 * Литерал типа описывает тип, который может быть обощённым,
 * например, ArrayList<String>.
 */
class TypeLiteral<T> {
    private Type type;

    /**
     * Этот конструктор должен вызываться из анонимного класса как
     * в операции new TypeLiteral<. . .>(){}.
     */

    public TypeLiteral() {
        Type parentType = getClass().getGenericSuperclass();
        if (parentType instanceof ParameterizedType paramType)
            type = paramType.getActualTypeArguments()[0];
        else
            throw new UnsupportedOperationException(
                    "Construct as new TypeLiteral<. . .>(){}");
    }

    private TypeLiteral(Type type) {
        this.type = type;
    }

    /**
     * Выдаёт литерал типа описывающий заданный тип
     */

    public static TypeLiteral<?> of(Type type) {
        return new TypeLiteral<Object>(type);
    }

    @Override
    public boolean equals(Object otherObject) {
        return otherObject instanceof TypeLiteral otherLIteral
                && type.equals(otherLIteral.type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public String toString() {
        if (type instanceof Class clazz) return clazz.getName();
        else return type.toString();
    }
}

/**
 * Форматирует обьекты по правилам, связывающим типы
 * с функциями форматирования
 */
class Formatter {
    private HashMap<TypeLiteral<?>, Function<?, String>> rules = new HashMap<>();

    /**
     * Присоединяет правило форматирования к данному средству форматирования
     *
     * @param type             Тип, к которому применяется данное правило
     * @param formatterForType Функция, форматирующая обьекты данного типа
     */

    public <T> void forType(TypeLiteral<T> type, Function<T, String> formatterForType) {
        rules.put(type, formatterForType);
    }

    /**
     * Формирует все поля обьекта по правилам данного средства форматирования
     *
     * @param obj an object
     * @return Возвращает символьную строку с именами всех полей и
     * отформатированными значеними
     */

    public String formatFields(Object obj) throws IllegalArgumentException, IllegalAccessException {
        var result = new StringBuilder();
        for (Field f : obj.getClass().getDeclaredFields()) {
            result.append(f.getName());
            result.append("=");
            f.setAccessible(true);
            Function<?, String> formatterForType = rules.get(TypeLiteral.of(f.getGenericType()));
            if (formatterForType != null) {
                //параметр formatterForType имеет тип ?, поэтому его методу apply() ничего не передаётся.
                //Тип параметра приводиться к типу Object, чтобы можно было вызвапть данный метод
                @SuppressWarnings("unchecked")
                Function<Object, String> objectFormatter = (Function<Object, String>) formatterForType;
                result.append(objectFormatter.apply(f.get(obj)));
            } else result.append(f.get(obj).toString());
            result.append("\n");
        }
        return result.toString();
    }
}

public class TypeLiterals {
    public static class Sample {
        ArrayList<Integer> nums;
        ArrayList<Character> chars;
        ArrayList<String> strings;

        public Sample() {
            nums = new ArrayList<>();
            nums.add(42);
            nums.add(1729);
            chars = new ArrayList<>();
            chars.add('H');
            chars.add('i');
            strings = new ArrayList<>();
            strings.add("Hello");
            strings.add("World");
        }
    }

    private static <T> String join(String separator, ArrayList<T> elements) {
        var result = new StringBuilder();
        for (T e : elements) {
            if (result.length() > 0) result.append(separator);
            result.append(e.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        var formatter = new Formatter();
        formatter.forType(new TypeLiteral<ArrayList<Integer>>() {
        }, ist -> join(" ", ist));
        formatter.forType(new TypeLiteral<ArrayList<Character>>() {
        }, ist -> "\"" + join("", ist) + "\"");
        System.out.println(formatter.formatFields(new Sample()));

    }
}