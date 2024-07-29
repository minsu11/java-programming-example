package org.json.database;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Database {
    private JSONObject db;
    private static final String FILE_PATH = "database.json";

    public Database(JSONObject db) {
        this.db = db;
    }
    public Database(){
        init();
    }

    private void init(){
        this.db = initialize(FILE_PATH);
    }

    private JSONObject initialize(String filePath){
        JSONObject o = new JSONObject();
        JSONParser jsonParser = new JSONParser();
        try(Reader reader = new FileReader(filePath)){
            o = (JSONObject) jsonParser.parse(reader);
        }catch (FileNotFoundException ex) {
            // todo file 생성 메서드를 따로 뺴기

            try(FileWriter fileWriter = new FileWriter(filePath)) {
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return o;
    }


    public void add(User user){
        addUser(user);
    }

    public void add(Item item){

    }

    private void addUser(User user){
        
    }
}
