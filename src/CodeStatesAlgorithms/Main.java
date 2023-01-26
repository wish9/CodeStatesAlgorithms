package CodeStatesAlgorithms;

public class Main {
    public static void main(String[] args) {
        //DailyCoding 코플릿 1번
//        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
//        CodeStatesAlgorithms.TransformFirstAndLast transform = new CodeStatesAlgorithms.TransformFirstAndLast();
//
//
//        HashMap<String, String> output = transform.transformFirstAndLast(arr);
//        System.out.println(output);

        //DailyCoding 코플릿 2번
//        CodeStatesAlgorithms.CalculateWhenThePrincipalDoubles calculateWhenThePrincipalDoubles = new CodeStatesAlgorithms.CalculateWhenThePrincipalDoubles();
//
//        System.out.println(calculateWhenThePrincipalDoubles.computeWhenDouble(7));
//        System.out.println(calculateWhenThePrincipalDoubles.computeWhenDouble(3.2));


        //stringfy 메서드 (자바타입 -> JSON타입) 수동으로 만들기
//        CodeStatesAlgorithms.Json json = new CodeStatesAlgorithms.Json();
//
//        System.out.println(json.stringify(77));
//        System.out.println(json.stringify("stringfy"));
//        System.out.println(json.stringify(true));
//        System.out.println(json.stringify(new String[]{"a", "b", "c", "d", "e"}));
//        System.out.println(json.stringify(new Object[]{7, new Object[]{new Object[]{}, 1, 2}}));
//        System.out.println(json.stringify(new Object[]{new Object[]{new Object[]{}}}));
//
//        HashMap<Object, Object> hashMap = new HashMap<>(){{
//            put("a","apple");
//            put("7",77);
//            put("true", true);
//            put("false", false);
//            put("null", null);
//        }};
//
//        System.out.println(json.stringify(hashMap));

        //DailyCoding 코플릿 3번
//        CodeStatesAlgorithms.MakeMathlog makeMathlog = new CodeStatesAlgorithms.MakeMathlog();
//
//        System.out.println(makeMathlog.mathlog(564872));
//        System.out.println(makeMathlog.mathlog(64));
//        System.out.println(makeMathlog.mathlog(524288));



        //DailyCoding 코플릿 4번
//        CodeStatesAlgorithms.FirstCharacter first = new CodeStatesAlgorithms.FirstCharacter();
//
//        System.out.println(first.firstCharacter("hello world"));
//        System.out.println(first.firstCharacter("1 2 3"));



        //DailyCoding 코플릿 4번
//        CodeStatesAlgorithms.ReverseString reverseString = new CodeStatesAlgorithms.ReverseString();
//
//        System.out.println(reverseString.CodeStatesAlgorithms.ReverseString("Hello java"));

        //DailyCoding 코플릿 6번
//        CodeStatesAlgorithms.LetterCapitalize letterCapitalize = new CodeStatesAlgorithms.LetterCapitalize();
//
//        System.out.println(letterCapitalize.letterCapitalize("iTS  sO     hARD"));

        //DailyCoding 코플릿 7번
//        CodeStatesAlgorithms.ArrayToHashmap arrayToHashmap = new CodeStatesAlgorithms.ArrayToHashmap();
//
//        System.out.println(new String[][]{
//                {"make", "Ford"},
//                {"model", "Mustang"},
//                {"year", "1964"},
//                {"make", "Bill"},
//        });

        //DailyCoding 코플릿 8번
        DoubleSpaceToSingle doubleSpaceToSingle = new DoubleSpaceToSingle();
        System.out.println(doubleSpaceToSingle.convertDoubleSpaceToSingle("Double  space with  Double  "));
        System.out.println(doubleSpaceToSingle.convertDoubleSpaceToSingle2("Double  space with  Double  "));
        System.out.println(doubleSpaceToSingle.convertDoubleSpaceToSingle3("Double  space with  Double  "));
    }
}