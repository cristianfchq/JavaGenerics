package generic1;

public class Main {

    public static void main(String[] args){

        Param<Integer> integerParam = new Param<>();
        integerParam.setValue(10);
        System.out.println(integerParam.getValue());

        Param<String> stringParam = new Param<>();
        stringParam.setValue("Hello");
        System.out.println(stringParam.getValue());

        Param<String[]> stringArrayParam = new Param<>();
        stringArrayParam.setValue(new String[]{"Hello", "World"});
        System.out.println(stringArrayParam.getValue()[1]);

        Param<int[][]> intTwoArrayParam = new Param<>();
        intTwoArrayParam.setValue(new int[][]{{1, 2}, {3, 4}});
        System.out.println(intTwoArrayParam.getValue()[0][1]);

        Param<Object> objectParam = new Param<>();
        objectParam.setValue("Hello Object param");
        System.out.println(objectParam.getValue());;
        Param<Param<Object>> objectNestedParam = new Param<>();
        objectNestedParam.setValue(objectParam);
        System.out.println(objectNestedParam.getValue().getValue());

    }

}
