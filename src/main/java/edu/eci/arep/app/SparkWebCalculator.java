package edu.eci.arep.app;

import edu.eci.arep.app.Calculator;
import static spark.Spark.get;
import static spark.Spark.port;
import com.google.gson.JsonParser;
import org.json.JSONObject;
/**
 * Hello world!
 *
 */
public class SparkWebCalculator {
    
/**
 * This main method uses SparkWeb static methods and lambda functions to create 
 * a App that calculate the mean and estandar deviation of a number list entered 
 * by a field on the web page
 */
    public static void main(String[] args) {
        
        port(getPort());
        Calculator calculator = new Calculator();
        get("/log", (req,res) -> {
            res.status(200);
            Double var = Double.parseDouble(req.queryParams("value"));
            JSONObject json = new JSONObject();
            json.put("operation", "log");
            json.put("input", var);
            json.put("output", calculator.calculateLOG(var));
            return json;
        });

        get("/atan", (req,res) -> {
            res.status(200);
            Double var = Double.parseDouble(req.queryParams("value"));
            JSONObject json = new JSONObject();
            json.put("operation", "atan");
            json.put("input", var);
            json.put("output", calculator.calculateATAN(var));
            return json;
        });
    }
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
	
}
