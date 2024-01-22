package Class_Task.JsonObjectParsing;

import java.io.FileReader;
import java.io.IOException;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    
    {
    	
       //String json=new String(Files.readAllBytes(Paths.get("./Json.json")));
    	System.out.println("---------------Displaying Students Data-----------------");
       JsonReader reader = new JsonReader(new FileReader("./Students.json"));
       Gson gson=new Gson();
       JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);

       // Iterate over each JSON object in the array
       for (JsonElement jsonElement : jsonArray) {
    	   Student student=gson.fromJson(jsonElement, Student.class);
           System.out.println(student);

           // Do something with myObject
       }
       
       System.out.println("-------------------------------------------------------------------------------------------");
       
      	System.out.println("---------------Displaying Employees Data-----------------");
        JsonReader reader1 = new JsonReader(new FileReader("./Employees.json"));
        Gson gson1=new Gson();
        JsonArray jsonArray1 = gson1.fromJson(reader1, JsonArray.class);

        // Iterate over each JSON object in the array
        for (JsonElement jsonElement : jsonArray1) {
     	   Employee employee=gson1.fromJson(jsonElement, Employee.class);
            System.out.println(employee);

            // Do something with myObject
        }
    }
}
