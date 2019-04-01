package com.espe.crud.service;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
 
public class consumir {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String webService = "https://aplicaciones.espe.edu.ec:8443/authentication/api/query/id=L00012059&auth=ba82e1071cd1ea9669a62f24213ba4a4.cf3df0e97b7a4cc68aeaab8d6bbb9691?fbclid=IwAR3D3xBT2UZEsNo04ZeKSW4CIdYtB1tVdC0X5QXRxWCDIlXBw2WxXLGkymc";
            URL url = new URL(webService);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            
            if (conn.getResponseCode() ==200)
            {
                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                
                String output;
                System.out.println("output is-----------------");
                
                while ((output = br.readLine()) != null)
                {
                    System.out.println(output);
                     JSONObject json = new JSONObject(output);
                     String codigo = json.getString("codigo");
                     String nombres = json.getString("nombres");
                     String apellidos = json.getString("apellidos");
                     
                     System.out.println(codigo);
                     System.out.println(nombres+" "+apellidos);
                     
                }
                conn.disconnect();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
      