package org.json.database;

import java.util.Scanner;

public class JsonMain {

    public static void main(String[] args) {
        // TODO 파일있으면 파일의 데이터 가지고 오기
        // Todo 없으면 파일만 생성
        // Todo
        Database database = new Database();
        String line = new String();

        try(Scanner scanner = new Scanner(System.in)) {
            while(true){
                line = scanner.nextLine();
                args = line.split(" ");
                checkField(args[0]);

            }

        }catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkField(String field){
        if(!isMatchField(field)){
            throw new FiledNotMatchException();
        }
    }

    /**
     * Database 필드 명이 있는 지 확인
     * @param field 입력한 문자열
     * @return enum에 field value에 동일한 값이 있으면 true, 없으면 false
     */
    private static boolean isMatchField(String field){
        for(DatabaseField value: DatabaseField.values()){
            if(value.getValue().equals(field)){
                return true;
            }
        }
        return false;
    }



    //todo add, del, list에 따른 행동
    // Double dispatch를 여기서 써야하나
    // 우선은 equals로

    public static void behavior(String str){
        if(DatabaseBehavior.ADD.getBehaviorName().equals(str)){

        }
    }

}
